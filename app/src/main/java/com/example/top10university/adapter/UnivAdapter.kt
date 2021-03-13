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
import kotlinx.android.synthetic.main.item_hero.view.*

class UnivAdapter(private val listUniv: ArrayList<Univ>) : RecyclerView.Adapter<UnivAdapter.UnivViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): UnivViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_hero,viewGroup,false)
        return UnivViewHolder(view)
    }

    override fun onBindViewHolder(holder: UnivViewHolder, position: Int) {
        holder.bindData(listUniv[position])
    }

    override fun getItemCount(): Int {
        return listUniv.size
    }

    inner class UnivViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindData(data: Univ) {
            with(itemView) {
                Glide.with(this)
                    .load(data.logo)
                    .apply(RequestOptions().override(60,60))
                    .into(img_univ)
                tv_name_univ.text = data.name
                tv_desc_univ.text = data.description
                setOnClickListener {
                    val intent = Intent(context, DetailUnivActivity::class.java)
                    intent.putExtra(DetailUnivActivity.EXTRA_UNIV,data)
                    context.startActivity(intent)
                }
            }
        }
    }
}