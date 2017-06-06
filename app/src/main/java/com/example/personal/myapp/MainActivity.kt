package com.example.personal.myapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.view.View
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnAge.setOnClickListener(View.OnClickListener {
            val userData:String=etDOb.text.toString()
            val year:Int=Calendar.getInstance().get(Calendar.YEAR)
            val myAge=year-userData.toInt()
            tvShowAge.setText("Your Age Is : $myAge")
        })


    }
}
