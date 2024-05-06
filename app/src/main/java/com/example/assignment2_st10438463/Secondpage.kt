package com.example.assignment2_st10438463

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat


class Secondpage<view> : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_secondpage)

        // Initialize views
        val feedCountTextView = findViewById<TextView>(R.id.feedCount)
        val playCountTextView = findViewById<TextView>(R.id.playCount)
        val cleanCountTextView = findViewById<TextView>(R.id.cleanCount)
        val petImage =
            findViewById<ImageView>(R.id.petImage) // Assuming petImage is the ImageView for displaying pet pictures

        var feedClickCount = 0
        var playClickCount = 0
        var cleanClickCount = 0

        val feedButton = findViewById<Button>(R.id.feedButton)
        feedButton.setOnClickListener {
            petImage.setImageResource(R.drawable.dog_eating_picture_imad)
            feedClickCount++
            feedCountTextView.text = "$feedClickCount"
        }

        val playButton = findViewById<Button>(R.id.playButton)
        playButton.setOnClickListener {
            petImage.setImageResource(R.drawable.dog_playing_picture_imad)
            playClickCount++
            playCountTextView.text = "$playClickCount"
        }

        val cleanButton = findViewById<Button>(R.id.cleanButton)
        cleanButton.setOnClickListener {
            petImage.setImageResource(R.drawable.dog_bathing_picture_imad)
            cleanClickCount++
            cleanCountTextView.text = "$cleanClickCount"
        }
    }
}



