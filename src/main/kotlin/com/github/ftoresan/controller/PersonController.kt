package com.github.ftoresan.controller

import com.github.ftoresan.domain.Person
import com.github.ftoresan.service.PersonService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

/**
 * Created by Fabricio Toresan on 28/05/16.
 */
@RestController
@RequestMapping("/people")
class PersonController @Autowired constructor(val service: PersonService) {

    @RequestMapping("", method = arrayOf(RequestMethod.GET))
    fun list() = service.listAll()

    @RequestMapping("", method = arrayOf(RequestMethod.POST))
    fun createPerson(@RequestBody person : Person) = service.createPerson(person)

    @RequestMapping("/{personId}", method = arrayOf(RequestMethod.GET))
    fun getPerson(@PathVariable personId : Long) = service.findPerson(personId)
}