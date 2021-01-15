package com.ajayjung.softuserapp


import com.ajayjung.softuserapp.model.Students


class StudentList private constructor(){
    var mylist =ArrayList<Students
            >()

    fun list(): ArrayList<Students>{
        return mylist
    }

    companion object {
        private val data = StudentList()
        fun get(): StudentList {
            return data
        }
    }
}