package com.github.ftoresan.service

import com.github.ftoresan.domain.Show
import com.github.ftoresan.domain.ShowRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

/**
 * Created by Fabricio Toresan on 28/05/16.
 */
@Component
class ShowServiceImpl @Autowired constructor(val repository : ShowRepository) : ShowService {

    override fun createShow(show: Show) {
        repository.save(show)
    }

    override fun listAll(): Iterable<Show> {
        return repository.findAll()
    }
}