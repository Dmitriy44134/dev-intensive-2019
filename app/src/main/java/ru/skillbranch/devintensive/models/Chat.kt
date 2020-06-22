package ru.skillbranch.devintensive.models

class Chat(
    val id1:String,
    val members: MutableList<User> = mutableListOf(),
    val MESSAGES: MutableList<BaseMessage> = mutableListOf()
) {

}