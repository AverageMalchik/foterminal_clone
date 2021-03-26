package com.example.falloutterminal

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main_menu.*

class MainMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)
        var c = 0
        power.setBackgroundResource(R.drawable.powerbuttonoff)
        Toast.makeText(this, "Power Off", Toast.LENGTH_SHORT).show()
        textView.visibility = View.GONE
        textView2.visibility = View.GONE
        layout1.visibility = View.GONE
        layout.setBackgroundResource(R.color.black)
        power.setOnClickListener {
            if (c % 2 == 0) {
                power.setBackgroundResource(R.drawable.powerbutton)
                Toast.makeText(this, "Power On", Toast.LENGTH_SHORT).show()
                textView.visibility = View.VISIBLE
                textView2.visibility = View.VISIBLE
                layout1.visibility = View.VISIBLE
                layout.setBackgroundResource(R.drawable.bg_black)
                c++
            } else {
                power.setBackgroundResource(R.drawable.powerbuttonoff)
                Toast.makeText(this, "Power Off", Toast.LENGTH_SHORT).show()
                textView.visibility = View.GONE
                textView2.visibility = View.GONE
                layout1.visibility = View.GONE
                layout.setBackgroundResource(R.color.black)
                c++
            }
            terminal1.setOnClickListener{
                val intent:Intent=Intent(this,MainActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}