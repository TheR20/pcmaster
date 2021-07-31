package com.example.pcmasters

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var ButtonIntel: Button? = null
    private var ButtonAmd: Button? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ButtonIntel = findViewById<View>(R.id.btnintel) as Button
        ButtonAmd = findViewById<View>(R.id.btnamd) as Button
        val intent = Intent(this@MainActivity,Procesado::class.java)

        ButtonIntel!!.setOnClickListener {
            intent.putExtra("Procesador","Intel")
            startActivity(intent)
        }

        ButtonAmd!!.setOnClickListener {
            intent.putExtra("Procesador","Amd")
            startActivity(intent)
        }
    }

}