package com.github.ftoresan.controller

import com.github.ftoresan.domain.Role
import com.github.ftoresan.domain.Show
import com.github.ftoresan.service.RoleService
import com.github.ftoresan.service.ShowService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

/**
 * Created by fabricio on 19/05/16.
 */
@RestController
@RequestMapping("/shows")
class ShowController @Autowired constructor(val service : ShowService, val roleService: RoleService) {

    @RequestMapping(value="", method=arrayOf(RequestMethod.GET))
    fun list()  = service.listAll()

    @RequestMapping(value="", method=arrayOf(RequestMethod.POST))
    fun create(@RequestBody show : Show) = service.createShow(show)

    @RequestMapping(value="/{showId}", method=arrayOf(RequestMethod.GET))
    fun find(@PathVariable showId : Long) = service.findShow(showId)

    @RequestMapping(value="/{showId}", method = arrayOf(RequestMethod.PUT))
    fun update(@PathVariable showId : Long, @RequestBody show : Show) {
        val curShow = service.findShow(showId)
        if (curShow?.id != showId) {
            throw IllegalArgumentException("Attempting to update a show with a different id")
        }
        service.updateShow(show)
    }

    @RequestMapping(value = "/{showId}/actors", method = arrayOf(RequestMethod.POST))
    fun addActor(@PathVariable showId : Long, @RequestBody actor : Role) {
        val show = service.findShow(showId) ?: throw NotFoundException("Show not found: " + showId)
        val role = roleService.findRole(actor.id) ?: roleService.createRole(actor)

        show.cast = show.cast.plus(role)
        service.updateShow(show)
    }
}