package com.github.ftoresan.service

import com.github.ftoresan.domain.Person
import com.github.ftoresan.domain.PersonRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

/**
 * Created by Fabricio Toresan on 29/05/16.
 */
@Component
class PersonServiceImpl @Autowired constructor(val repository : PersonRepository) : PersonService {

    override fun updatePerson(person: Person) {
        repository.save(person)
    }

    override fun findPerson(id: Long) = repository.findOne(id)

    override fun createPerson(person: Person) = repository.save(person)

    override fun listAll(): Iterable<Person> = repository.findAll()
}