package com.alimmanurung.moviecatalogues1.ui

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.alimmanurung.moviecatalogues1.R
import com.alimmanurung.moviecatalogues1.ui.home.HomeActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        setSupportActionBar(findViewById(R.id.toolbar))

        Handler().postDelayed(Runnable {
            val intent = Intent(this@SplashActivity, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }, 2000)
    }
}