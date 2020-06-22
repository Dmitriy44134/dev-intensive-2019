package ru.skillbranch.devintensive.models

import ru.skillbranch.devintensive.utils.Utils
import java.sql.Date


data class User(
    val id:String,
    var firstName:String?,
    var lastName:String?,
    var avatar:String?,
    var rating:Int=0,
    var respect:Int=0,
    val lastVisit: Date?=null,
    val isOnline:Boolean=false

) {
    constructor(
        id: String,
        firstName: String?,
        lastName: String?
    ) : this(id=id, firstName=firstName,lastName= lastName,  avatar=null)


    constructor(
        id: String            ) : this(id=id, firstName="Jor",lastName= "Doe $id")

    init {
        println("I'am alive\n" +
        "${if (lastName==="Doe") "His name id $firstName $lastName" else "And His name id $firstName $lastName\n"}")
    }
    companion object Factory {
        private var lastId : Int = -1
        fun makeUser(fullName:String?):User{
            lastId++

            val (firstName,  lastName) = Utils.parseFullName(fullName)
            return User(id="$lastId", firstName =firstName , lastName =lastName )
        }
    }


    fun printMe(): Unit{
        println("""
          id:$id
    firstName:$firstName
    lastName:$lastName
    avatar:$avatar
    rating:$rating
    respect:$respect
    lastVisit: $lastVisit
    val isOnline: $isOnline  
        """.trimIndent())
    }
}