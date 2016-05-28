package com.github.ftoresan.controller

import com.github.ftoresan.domain.Show
import com.github.ftoresan.service.ShowService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

/**
 * Created by fabricio on 19/05/16.
 */
@RestController
@RequestMapping("/shows")
class ShowController @Autowired constructor(val service : ShowService) {

    @RequestMapping(value="", method=arrayOf(RequestMethod.GET))
    fun list()  = service.listAll()

    @RequestMapping(value="", method=arrayOf(RequestMethod.POST))
    fun create(@RequestBody show : Show) = service.createShow(show)
}