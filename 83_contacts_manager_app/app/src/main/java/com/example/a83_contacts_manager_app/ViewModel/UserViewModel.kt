package com.example.a83_contacts_manager_app.ViewModel

import android.database.Observable
import androidx.annotation.BinderThread
import androidx.lifecycle.ViewModel
import com.example.a83_contacts_manager_app.room.User
import com.example.a83_contacts_manager_app.room.UserRepository

class UserViewModel(
    private val repository: UserRepository
): ViewModel(), Observable {
    private var isUpdateOrDelete = false
    private lateinit var userToUpdateOrDelete: User

    @BinderThread
    
}