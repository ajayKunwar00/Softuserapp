package com.ajayjung.softuserapp.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ajayjung.softuserapp.adapter.StudentAdapter
import com.ajayjung.softuserapp.model.Students
import com.ajayjung.softuserapp.R
import com.ajayjung.softuserapp.StudentList



class HomeFragment : Fragment() {
    private val lstStudents = ArrayList<Students>()
    private lateinit var recyclerView: RecyclerView
    //private lateinit var recyclerView2: RecyclerView
    //private var newList = ArrayList<Student>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        recyclerView = view.findViewById(R.id.recyclerView)
//

        if (StudentList.get().list().size == 0){
            loadStudents()
        }

        val adapter = StudentAdapter(StudentList.get().list(),context!!)
        recyclerView.layoutManager = LinearLayoutManager(activity)
        recyclerView.adapter = adapter

//        newList = arguments?.getParcelableArrayList("list")!!
//        val adapter2 = StudentAdapter(newList,this@HomeFragment)
//        recyclerView2.layoutManager = LinearLayoutManager(activity)
//        recyclerView2.adapter = adapter2
        return view

    }

    private fun loadStudents() {
        StudentList.get().list().add(Students(1,"Willaim","Ratopul",24,"Male"))
        StudentList.get().list().add(Students(2,"Jane","Maitidevi",23,"Male"))
        StudentList.get().list().add(Students(3,"Michael","Baneswor",20,"Male"))
    }

}