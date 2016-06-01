package com.github.ftoresan.service

import com.github.ftoresan.domain.Show
import org.springframework.stereotype.Service

/**
 * Created by fabricio on 21/05/16.
 */
@Service
interface ShowService {

    fun listAll() : Iterable<Show>

    fun createShow(show : Show) : Show

    fun findShow(id : Long) : Show?

    fun updateShow(show : Show)
}