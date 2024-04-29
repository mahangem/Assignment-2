package com.example.assignment2imad

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

private var petHealth = 100
private var petHunger = 50
private var petPlay = 50

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        // Get the button and text views
        val btnFeed =findViewById<Button>(R.id.btnFeed)
        val btnHealth =findViewById<Button>(R.id.btnHealth)
        val btnPlay =findViewById<Button>(R.id.btnPlay)
        val txtHunger =findViewById<EditText>(R.id.txtHunger)
        val txtHealth =findViewById<EditText>(R.id.txtHealth)
        val txtHappy =findViewById<EditText>(R.id.txtHappy)
        val petImage =findViewById<ImageView>(R.id.petImage)

        // Set the initial text values

        txtHunger.setText(petHunger.toString())
        txtHealth.setText(petHealth.toString())
        txtHappy.setText(petPlay.toString())
        //txtHappy.setText(petHappy.toString())

        // Handle button clicks
        btnFeed.setOnClickListener {
            petHunger -= 10
            petHealth += 10
            petPlay += 5
            txtHunger.setText(petHunger.toString())
            animateImageChange(petImage, R.drawable.pit_eating)
        }
        btnHealth.setOnClickListener {
            petHunger -= 10
            petHealth += 10
            petPlay += 5

            txtHappy.setText(petHealth.toString())
            animateImageChange(petImage, R.drawable.pit_running)
        }
        btnPlay.setOnClickListener {
            petHunger -= 10
            petHealth += 10

            txtHappy.setText(petPlay.toString())
            animateImageChange(petImage, R.drawable.pit_playing)
        }


    }
    private fun animateImageChange(imageView: ImageView, newImageResource: Int){
        //val animation = AlphaAnimation(0.Of, 1.Of)
        //animation.duration = 500
        //animation.fillAfter = true
        //imageView.startAnimation(animation)
        imageView.setImageResource(newImageResource)

    }
    }
