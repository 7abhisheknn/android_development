package com.example.a83_contacts_manager_app.room

import androidx.lifecycle.LiveData

class UserRepository(
    private val dao: UserDAO
) {
//    val users = dao.getAllUsersInDB()
    suspend fun getAllUsers(): LiveData<List<User>> {
        return dao.getAllUsersInDB()
    }
    suspend fun insert(user: User): Long {
        return dao.insertUser(user)
    }
    suspend fun delete(user: User): Long {
        return dao.deleteUser(user)
    }
    suspend fun update(user: User): Long {
        return dao.updateUser(user)
    }
}