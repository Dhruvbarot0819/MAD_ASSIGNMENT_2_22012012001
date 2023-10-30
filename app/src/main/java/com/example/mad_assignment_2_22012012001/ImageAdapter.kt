package com.example.mad_assignment_2_22012012001

import android.content.Context
import android.content.Intent
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class ImageAdapter(private val context:Context, private val images : List<Int>) : RecyclerView.Adapter<ImageAdapter.ImageViewHolder>(){
    class ImageViewHolder(view: View) : RecyclerView.ViewHolder(view)
    {
        val img = itemView.findViewById<ImageView>(R.id.image)
        fun bindView(image : Int)
        {
            img.setImageResource(image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder =
        ImageViewHolder(LayoutInflater.from(context).inflate(R.layout.item_images, parent, false))


    override fun getItemCount(): Int = images.size

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        holder.bindView(images[position])

        holder.img.setOnClickListener {
            val intent = Intent(it.context, ImageActivity::class.java)
            intent.putExtra("IMAGE_ID", images[position]) // Assuming images[position] is the integer value you want to pass
            it.context.startActivity(intent)
        }
    }
}