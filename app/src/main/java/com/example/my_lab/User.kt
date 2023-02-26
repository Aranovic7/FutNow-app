package com.example.my_lab

class User (
    var username: String = "",
    var password: String = ""
) {
    override fun toString(): String {
        return "Users(username='$username', password='$password')"
    }
}