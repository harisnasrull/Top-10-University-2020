package com.example.top10university.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.top10university.DetailUnivActivity
import com.example.top10university.R
import com.example.top10university.model.Univ
import kotlinx.android.synthetic.main.item_grid_univ.view.*

class GridAdapter(private val gridUniv: ArrayList<Univ>) : RecyclerView.Adapter<GridAdapter.GridViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): GridViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_grid_univ, viewGroup, false)
        return GridViewHolder(view)
    }

    override fun onBindViewHolder(holder: GridViewHolder, position: Int) {
        holder.bindData(gridUniv[position])
    }

    override fun getItemCount(): Int {
        return gridUniv.size
    }

    inner class GridViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindData(data: Univ) {
            with(itemView) {
                Glide.with(this)
                        .load(data.logo)
                        .apply(RequestOptions().override(500, 200))
                        .into(img_grid_univ)
                setOnClickListener {
                    val intent = Intent(context, DetailUnivActivity::class.java)
                    intent.putExtra(DetailUnivActivity.EXTRA_UNIV, data)
                    context.startActivity(intent)
                }
            }
        }
    }
}