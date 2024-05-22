package com.example.a83_contacts_manager_app.room

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface UserDAO {
    @Insert
    suspend fun insertUser(user: User): Long
    @Update
    suspend fun updateUser(user: User): Long
    @Delete
    suspend fun deleteUser(user: User): Long
    @Query("DELETE FROM user")
    suspend fun deleteAll()
    @Query("SELECT * FROM user")
    suspend fun getAllUsersInDB(): LiveData<List<User>>
}