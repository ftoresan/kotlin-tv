package com.github.ftoresan.service

import com.github.ftoresan.domain.Role
import com.github.ftoresan.domain.RoleRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

/**
 * Created by Fabricio Toresan on 01/06/16.
 */
@Component
class RoleServiceImpl @Autowired constructor(val roleRepository : RoleRepository) : RoleService {
    override fun listAll() = roleRepository.findAll()

    override fun createRole(role: Role) = roleRepository.save(role)

    override fun findRole(id: Long) = roleRepository.findOne(id)

    override fun updateRole(role: Role) = roleRepository.save(role)
}