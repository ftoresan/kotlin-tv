package com.github.ftoresan.domain

import javax.persistence.*

/**
 * Created by Fabricio Toresan on 01/06/16.
 */
@Entity
class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long = 0

    var name : String = ""

    @JoinColumn(name = "person_id")
    @ManyToOne
    var actor : Person = Person()
}