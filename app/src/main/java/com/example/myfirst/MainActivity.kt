package com.example.myfirst

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1.setOnClickListener {
            val name = nameText.text.toString()
            if (name == null || name.trim() == "")
                Toast.makeText(
                    this@MainActivity,
                    "nama tidak boleh kosong",
                    Toast.LENGTH_SHORT
                )
            else
                textBase.setText(name)
        }
    }


}