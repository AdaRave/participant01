package com.example.session01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_add.*
import kotlinx.android.synthetic.main.app_bar_main.*

class AddActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add)

        setSupportActionBar(findViewById(R.id.toolbar))
        supportActionBar?.title = ""

        ban.setNavigationOnClickListener {
            val intent3 = Intent(this, MainActivity::class.java)
            startActivity(intent3)
            overridePendingTransition(R.anim.left_out, R.anim.right_out)
        }
    }
}