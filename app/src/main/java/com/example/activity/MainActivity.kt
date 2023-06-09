package com.example.activity

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txt: TextView = findViewById(R.id.txtView)
        txt.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
        val toast = Toast.makeText(this, "Main_Activity_onCreate", Toast.LENGTH_SHORT)
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0)
        toast.show()
    }


    override fun onStart() {
        super.onStart()
        val toast = Toast.makeText(this, "Main_Activity_onStart", Toast.LENGTH_SHORT)
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0)
        toast.show()
    }

    override fun onResume() {
        super.onResume()
        val toast = Toast.makeText(this, "Main_Activity_onResume", Toast.LENGTH_SHORT)
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0)
        toast.show()
    }

    override fun onPause() {
        super.onPause()
        val toast = Toast.makeText(this, "Main_Activity_onPause", Toast.LENGTH_SHORT)
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0)
        toast.show()
    }

    override fun onStop() {
        super.onStop()
        val toast = Toast.makeText(this, "Main_Activity_onStop", Toast.LENGTH_SHORT)
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0)
        toast.show()
    }

    override fun onRestart() {
        super.onRestart()
        val toast = Toast.makeText(this, "Main_Activity_onRestart", Toast.LENGTH_SHORT)
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0)
        toast.show()
    }

    override fun onDestroy() {
        super.onDestroy()
        val toast = Toast.makeText(this, "Main_Activity_onDestroy", Toast.LENGTH_SHORT)
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0)
        toast.show()
    }
}


