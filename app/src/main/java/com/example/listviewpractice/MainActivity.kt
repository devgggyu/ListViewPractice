package com.example.listviewpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.listviewpractice.adapters.StudentAdapter
import com.example.listviewpractice.dates.Student
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val mStudentList = ArrayList<Student>()

    lateinit var mAdapter : StudentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mStudentList.add( Student("학생대규", 1998) )
        mStudentList.add( Student("김창완", 1930) )
        mStudentList.add( Student("김규진", 2000) )
        mStudentList.add( Student("손현수", 1997) )
        mStudentList.add( Student("장준하", 1995) )
        mStudentList.add( Student("곽준구", 1990) )
        mStudentList.add( Student("권혁수", 1999) )


        mAdapter = StudentAdapter(this, R.layout.student_list_item, mStudentList)

        studentListView.adapter = mAdapter



    }
}