package com.example.billeasy

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val tv = findViewById<TextView>(R.id.textView)
        val scan = findViewById<MaterialButton>(R.id.scan)
        scan.setOnClickListener {
            val intent = Intent(this, ScanActivity::class.java)
            startActivity(intent)

        }
    }
}