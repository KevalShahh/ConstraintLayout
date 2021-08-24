package com.example.constraintlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.LayoutInflater
import android.webkit.WebViewClient
import com.example.constraintlayout.databinding.ActivityMain13Binding

class MainActivity13 : AppCompatActivity() {
    lateinit var viewBinding:ActivityMain13Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding= ActivityMain13Binding.inflate(LayoutInflater.from(this))
        setContentView(viewBinding.root)

        viewBinding.web.loadUrl("https://www.google.com/")
        viewBinding.web.webViewClient= WebViewClient()
        viewBinding.web.settings.javaScriptEnabled=true
    }
    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        if (keyCode==KeyEvent.KEYCODE_BACK && viewBinding.web.canGoBack()){
            viewBinding.web.goBack()
            return true
        }
        return super.onKeyDown(keyCode, event)
    }
}