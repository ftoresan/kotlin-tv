package com.github.ftoresan.domain

import java.time.LocalDate
import javax.persistence.*

/**
 * Created by Fabricio Toresan on 19/05/16.
 */
@Entity
class Show {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long = 0

    var name: String = ""

    var releaseDate: LocalDate = LocalDate.now()

    @JoinColumn(name = "person_id")
    @ManyToOne
    var creator: Person? = null

    @JoinColumn(name = "director_id")
    @ManyToOne
    var director: Person? = null

    @ManyToMany
    var cast: List<Role> = listOf()
}