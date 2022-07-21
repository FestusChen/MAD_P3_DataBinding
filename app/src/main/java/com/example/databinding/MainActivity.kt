package com.example.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.databinding.DataBindingUtil
import com.example.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    // Student s = new Student(); --> Java Version
    // var s: Student; --> Kotlin Version
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        var s = Student("Ali", "RIT", 21)

        binding.btnGetValue.setOnClickListener() {
            binding.myData = s
        }

        binding.btnSetValue.setOnClickListener() {
            s.age = 28
            binding.apply {
                invalidateAll()
            }
        }
    }
}