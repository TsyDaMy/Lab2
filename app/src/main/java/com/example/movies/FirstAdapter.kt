package com.example.movies

import android.content.ClipData.Item
import android.text.Html
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.movies.databinding.ItemMovieBinding

class FirstAdapter(val onClick: (model: MovieData, position: Int) -> Unit): RecyclerView.Adapter<FirstAdapter.MovieViewHolder>() {

    val list = ArrayList<MovieData>()

    inner class MovieViewHolder(val binding: ItemMovieBinding): RecyclerView.ViewHolder(binding.root){

        fun bindItem(movieData: MovieData, position: Int){

            val d1 = Html.fromHtml(movieData.dfirst, Html.FROM_HTML_MODE_COMPACT)
            binding.FirstDescription.text = d1

            binding.FirstName.text = movieData.name

            binding.btn.setOnClickListener {
                onClick(movieData, position)
            }

            Glide.with(binding.FirstImage.context)
                .load(movieData.image)
                .into(binding.FirstImage)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val view = ItemMovieBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return MovieViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.bindItem(list[position], position)
    }

    fun setNewData(newList:List<MovieData>){
        list.clear()
        list.addAll(newList)
        notifyDataSetChanged()
    }
}