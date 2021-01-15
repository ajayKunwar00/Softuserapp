package com.ajayjung.softuserapp

import com.ajayjung.softuserapp.model.Students

interface Communicator {
    fun passData(lstStd: ArrayList<Students>)
}