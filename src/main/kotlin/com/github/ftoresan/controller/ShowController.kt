package com.github.ftoresan.controller

import com.github.ftoresan.domain.Show
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by fabricio on 19/05/16.
 */
@RestController
class ShowController {

    @RequestMapping("/shows")
    fun list() : Array<Show> {
        return arrayOf(Show(1L, "Breaking Bad"), Show(2L, "Walking Dead"))
    }
}