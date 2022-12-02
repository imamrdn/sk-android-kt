package com.example.myfirst

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.myfirst.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(
            this,
            R.layout.activity_main
        )

        binding.btn1.setOnClickListener {
            val name = binding.nameText.text.toString()
            if (name.trim() == "")
                Toast.makeText(
                    this@MainActivity,
                    "nama tidak boleh kosong",
                    Toast.LENGTH_SHORT
                ).show()
            else {
                binding.textBase.text = name
                val imgRes = resources.getIdentifier(name, "drawable", packageName)
                binding.img1.setImageResource(imgRes)
            }
        }
    }
}