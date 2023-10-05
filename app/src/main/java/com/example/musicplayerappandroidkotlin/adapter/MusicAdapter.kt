package com.example.musicplayerappandroidkotlin.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.musicplayerappandroidkotlin.Music
import com.example.musicplayerappandroidkotlin.databinding.MusicItemBinding

class MusicAdapter(private val contex: Context, private val musicList: ArrayList<Music>) : RecyclerView.Adapter<MusicAdapter.MyHolder>() {
    class MyHolder(binding: MusicItemBinding) : RecyclerView.ViewHolder(binding.root){
        val title = binding.songNameMV
        val album = binding.SongAlbumMV
        val image = binding.imgMV
        val duration = binding.songDuration

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MusicAdapter.MyHolder {
        return MyHolder(MusicItemBinding.inflate(LayoutInflater.from(contex), parent, false))
    }

    override fun onBindViewHolder(holder: MusicAdapter.MyHolder, position: Int) {
        holder.title.text = musicList[position].title
        holder.album.text = musicList[position].album
        holder.duration.text = musicList[position].duration.toString()
    }

    override fun getItemCount(): Int {
        return musicList.size
    }
}