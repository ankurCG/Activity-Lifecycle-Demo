package com.example.activity

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val toast = Toast.makeText(this, "Second_Activity_onCreate", Toast.LENGTH_SHORT)
        //toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0)
        toast.show()
    }

    override fun onStart() {
        super.onStart()
        val toast = Toast.makeText(this, "Second_Activity_onStart", Toast.LENGTH_SHORT)
        //toast.setGravity(Gravity.CENTER_VERTICAL, 0, 5)
        toast.show()
    }

    override fun onResume() {
        super.onResume()
        val toast = Toast.makeText(this, "Second_Activity_onResume", Toast.LENGTH_SHORT)
        //toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0)
        toast.show()
    }

    override fun onPause() {
        super.onPause()
        val toast = Toast.makeText(this, "Second_Activity_onPause", Toast.LENGTH_SHORT)
        //toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0)
        toast.show()
    }

    override fun onStop() {
        super.onStop()
        val toast = Toast.makeText(this, "Second_Activity_onStop", Toast.LENGTH_SHORT)
        //toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0)
        toast.show()
    }

    override fun onRestart() {
        super.onRestart()
        val toast = Toast.makeText(this, "Second_Activity_onRestart", Toast.LENGTH_SHORT)
        //toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0)
        toast.show()
    }

    override fun onDestroy() {
        super.onDestroy()
        val toast = Toast.makeText(this, "Second_Activity_onDestroy", Toast.LENGTH_SHORT)
        //toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0)
        toast.show()
    }

}