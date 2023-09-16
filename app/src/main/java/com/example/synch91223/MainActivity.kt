package com.example.synch91223

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toNext = findViewById<Button>(R.id.btnNextPage)
        toNext.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }
    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "OnStart", Toast.LENGTH_SHORT).show()
        Log.i("info", "OnStart")
    }
    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "OnPause", Toast.LENGTH_SHORT).show()
        Log.i("info", "OnPause")
    }
    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "OnStop", Toast.LENGTH_SHORT).show()
        Log.i("info", "OnStop")
    }
    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this, "OnRestart", Toast.LENGTH_SHORT).show()
        Log.i("info", "OnRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "OnDestroy", Toast.LENGTH_SHORT).show()
        Log.i("info", "OnDestroy")
    }
}