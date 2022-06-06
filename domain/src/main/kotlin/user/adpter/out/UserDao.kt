package com.example.xquareinterviewassignment.user.adpter.out

import org.springframework.data.repository.CrudRepository
import user.entity.UserEntity
import java.util.*

internal interface UserDao : CrudRepository<UserEntity, UUID>
