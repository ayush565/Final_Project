package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
//import android.os.Handler
import androidx.core.os.HandlerCompat.postDelayed
import java.util.logging.Handler

class Splash_Activity : AppCompatActivity() {

    private val splash:Long = 5000
    lateinit var iv_grocery:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        iv_grocery = findViewById(R.id.iv_grocery)
        iv_grocery.alpha = 0f
        iv_grocery.animate().setDuration(3000).alpha(1f).withEndAction()
        {
            val i = Intent(this,MainActivity::class.java)
            startActivity(i)
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
            finish()
        }
    }
}