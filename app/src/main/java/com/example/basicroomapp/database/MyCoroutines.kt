package com.example.basicroomapp.database

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class MyCoroutines(private val userDao: UserDao) {

}


























/*
suspend fun getUsers(): LiveData<List<User>> = withContext(Dispatchers.IO) {
        return@withContext MutableLiveData(userDao.getUsersFromDatabase().map { it.toUser() })
    }

    suspend fun getSingleUser(query: String): LiveData<User> = withContext(Dispatchers.IO){
        return@withContext MutableLiveData(userDao.getUserByUuid(query).toUser())
    }

    suspend fun save(user: User)= withContext(Dispatchers.IO){
        userDao.save(user.toEntity())
    }

    suspend fun delete(user: User)= withContext(Dispatchers.IO){
        userDao.delete(user.toEntity())
    }
 */