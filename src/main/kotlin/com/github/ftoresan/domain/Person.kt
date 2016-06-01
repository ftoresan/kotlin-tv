package com.github.ftoresan.domain

import java.time.LocalDate
import javax.persistence.*

/**
 * Created by Fabricio Toresan on 28/05/16.
 */
@Entity
@Table(name = "person")
class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id : Long = 0

    var name : String = ""

    var birthDate : LocalDate = LocalDate.now()
}