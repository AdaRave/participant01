package com.example.session01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_add.*
import kotlinx.android.synthetic.main.activity_settings.*

class SettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        setSupportActionBar(findViewById(R.id.toolbar))
        supportActionBar?.title = ""

        baaaaj.setNavigationOnClickListener {
            val intent5 = Intent(this, MainActivity::class.java)
            startActivity(intent5)
            overridePendingTransition(R.anim.left_out, R.anim.right_out)
        }
    }
}