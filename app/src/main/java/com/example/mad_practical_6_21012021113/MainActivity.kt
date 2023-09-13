package com.example.mad_practical_6_21012021113

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val browsebutton: Button = findViewById(R.id.button)
        val browsebutton: Button = findViewById(R.id.button2)

        browsebutton.setOnClickListener {
            playpause()
        }
        browsebutton.setOnClickListener {
            stop()
        }
    }

    fun playpause(){
        Intent(applicationContext,MyService::class.java).putExtra(MyService.PLAYERKEY,MyService.PLAYERVALUE).apply {
            startService(this)
        }
    }
    fun stop(){
        Intent(applicationContext,MyService::class.java).putExtra(MyService.PLAYERKEY,MyService.PLAYERVALUE).apply {
            startService(this)
        }
    }

}