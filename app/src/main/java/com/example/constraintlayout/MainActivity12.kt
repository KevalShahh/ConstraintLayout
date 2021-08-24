package com.example.constraintlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.core.view.marginTop
import com.example.constraintlayout.databinding.ActivityMain12Binding

class MainActivity12 : AppCompatActivity() {
    lateinit var viewBinding:ActivityMain12Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding= ActivityMain12Binding.inflate(LayoutInflater.from(this))
        setContentView(viewBinding.root)

        viewBinding.textview1.text=intent.getStringExtra("name").toString()
        viewBinding.textview2.text=intent.getStringExtra("email").toString()
        viewBinding.textview3.text=intent.getStringExtra("age").toString()
    }
}