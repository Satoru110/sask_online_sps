package com.example.sask_online_sps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        Glide.with(this)
            .load("https://i.ytimg.com/vi/M-64R6D_nR0/maxresdefault.jpg")
            .into(cir)


    }
}





