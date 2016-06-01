package com.github.ftoresan.domain

import org.springframework.data.repository.CrudRepository

/**
 * Created by Fabricio Toresan on 01/06/16.
 */
interface RoleRepository : CrudRepository<Role, Long> {
}