package com.github.ftoresan.service

import com.github.ftoresan.domain.Role
import org.springframework.stereotype.Service

/**
 * Created by Fabricio Toresan on 01/06/16.
 */
@Service
interface RoleService {

    fun listAll() : Iterable<Role>

    fun createRole(role : Role) : Role

    fun findRole(id : Long) : Role?

    fun updateRole(role : Role) : Role
}