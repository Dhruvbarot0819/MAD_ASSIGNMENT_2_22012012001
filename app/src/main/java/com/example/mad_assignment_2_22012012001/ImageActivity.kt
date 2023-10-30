package com.example.mad_assignment_2_22012012001

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class ImageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image)

        val image : ImageView = findViewById(R.id.image)
        val imageResourceId = intent.getIntExtra("IMAGE_ID", 0)
        image.setImageResource(imageResourceId)
    }
}