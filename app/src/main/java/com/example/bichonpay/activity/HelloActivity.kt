package com.example.bichonpay.activity

import android.app.Activity
import android.os.Bundle
import android.widget.Toast
import com.example.bichonpay.R
import kotlinx.android.synthetic.main.activity_hello.*

class HelloActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello)

        btnHello.setOnClickListener(){
            Toast.makeText(this, "토스트 메시지", Toast.LENGTH_SHORT).show()
        }
    }
}