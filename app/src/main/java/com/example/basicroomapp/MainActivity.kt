package com.example.basicroomapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.LifecycleOwner
import com.example.basicroomapp.database.DatabaseManager
import com.example.basicroomapp.database.User
import com.example.basicroomapp.database.UserEntity
import com.example.basicroomapp.database.toEntity

class MainActivity : AppCompatActivity() {
    private val mainViewModel: MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        mainViewModel.saveUser(User(
//            0,
//            "name0001",
//            1.74,
//            74.4,
//            "user004@email.com",
//            "passworduser0004"
//        ))
//        mainViewModel.saveUser(User(
//            0,
//            "name0002",
//            1.74,
//            74.4,
//            "user004@email.com",
//            "passworduser0004"
//        ))
//        mainViewModel.saveUser(User(
//            0,
//            "name0003",
//            1.74,
//            74.4,
//            "user004@email.com",
//            "passworduser0004"
//        ))

        mainViewModel.getUsers()
        //si es Fragment
        // es con viewLifecycleOwner en lugar de this
        mainViewModel.savedUsers.observe(this) { usersList ->
            if (!usersList.isNullOrEmpty()) {
                for (user in usersList) {
                    Log.d("usuarios", user.user_name + " id: ${user.user_id}")
                }
            } else {
                Log.d("usuarios", "null or empty")
            }
        }


    }
}






















/*
        mainViewModel.getUsers()
        mainViewModel.savedUsers.observe(this, { usersList ->
            if(!usersList.isNullOrEmpty()){
                for(user in usersList){
                    Log.d("userlistfromdb", user.user_name)
                }

            }else{
                Log.d("userlistfromdb", "null or empty")
            }
        })

 */