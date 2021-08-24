package com.example.constraintlayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import com.example.constraintlayout.databinding.ActivityMain11Binding

class MainActivity11 : AppCompatActivity() {
    lateinit var viewBinding:ActivityMain11Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("TAG", "onCreate: ")
        super.onCreate(savedInstanceState)
        viewBinding= ActivityMain11Binding.inflate(LayoutInflater.from(this))
        setContentView(viewBinding.root)

        viewBinding.btn.setOnClickListener {
            var intent=Intent(this,MainActivity12::class.java)
            intent.putExtra("name",viewBinding.edt1.text.toString())
            intent.putExtra("email",viewBinding.edt2.text.toString())
            intent.putExtra("age",viewBinding.edt3.text.toString())
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("TAG", "onStart: ")
    }
    override fun onStop() {
        super.onStop()
        Log.d("TAG", "onStop: ")
    }
    override fun onRestart() {
        super.onRestart()
        Log.d("TAG", "onRestart: ")
    }
    override fun onResume() {
        super.onResume()
        Log.d("TAG", "onResume: ")
    }
    override fun onPause() {
        super.onPause()
        Log.d("TAG", "onPause: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("TAG", "onDestroy: ")
    }
}