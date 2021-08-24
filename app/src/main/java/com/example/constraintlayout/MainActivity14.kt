package com.example.constraintlayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.constraintlayout.databinding.ActivityMain14Binding

class MainActivity14 : AppCompatActivity() {
    lateinit var viewBinding:ActivityMain14Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding= ActivityMain14Binding.inflate(LayoutInflater.from(this))
        setContentView(viewBinding.root)
    }
}