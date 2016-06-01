package com.github.ftoresan.service;

import com.github.ftoresan.domain.Person;
import org.springframework.stereotype.Service;

/**
 * Created by Fabricio Toresan on 28/05/16.
 */
@Service
interface PersonService {

    fun listAll() : Iterable<Person>

    fun createPerson(person : Person) : Person

    fun findPerson(id : Long) : Person?

    fun updatePerson(person : Person)
}
