package com.example.listviewpractice.adapters

import android.content.Context
import android.widget.ArrayAdapter
import com.example.listviewpractice.dates.Student

class StudentAdapter(
    val mContext : Context,
    val resId : Int,
    val mList : ArrayList<Student>) : ArrayAdapter<Student>(mContext, resId, mList) {
}