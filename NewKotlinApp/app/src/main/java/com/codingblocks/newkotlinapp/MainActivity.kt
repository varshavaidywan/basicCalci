package com.codingblocks.newkotlinapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        btnAdd.setOnClickListener({
           // Toast.makeText(this@MainActivity, "hello!", Toast.LENGTH_SHORT).show()
            val result = etVar1.text.toString().toInt() + etVar2.text.toString().toInt()
            tvResult.text = result.toString()
            
        })



    }
}


