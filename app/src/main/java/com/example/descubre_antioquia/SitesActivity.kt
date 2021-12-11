package com.example.descubre_antioquia

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SitesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sites)

        val headingSite: TextView = findViewById(R.id.heading)
        val descSite: TextView = findViewById(R.id.desc)
        val imageSite: ImageView = findViewById(R.id.image_heading)


        val bundle: Bundle? = intent.extras
        val heading = bundle!!.getString("heading")
        val imageId = bundle.getInt("imageId")
        val desc = bundle.getString("desc")

        headingSite.text = heading
        descSite.text = desc
        imageSite.setImageResource(imageId)


    }
}