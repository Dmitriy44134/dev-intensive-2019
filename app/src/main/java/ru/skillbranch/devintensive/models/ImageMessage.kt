package ru.skillbranch.devintensive.models

import java.util.*

class ImageMessage(id1:String,
                   from:User?,
                   chat:Chat,
                   isIncoming:Boolean = false,
                   date: Date = Date(),
                   var image:String?
): BaseMessage(id1,from,chat,isIncoming,date) {
    override fun formatMessage(): String {
        TODO("Not yet implemented")
    }

}