package com.example.top10university

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.top10university.model.Univ
import kotlinx.android.synthetic.main.activity_detail_univ.*

class DetailUnivActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_UNIV = "extra_univ"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_univ)

        val actionBar = supportActionBar
        actionBar?.title = "Detail University"
        actionBar?.setDisplayHomeAsUpEnabled(true)

        val data = intent.getParcelableExtra<Univ>(EXTRA_UNIV)
        val country = "Country : ${data?.country}"
        val countryRank = "Rank in Country : ${data?.country_rank}"

        if (data != null){
            Glide.with(applicationContext).load(data.logo).into(detail_img_univ)
            tv_detail_name_univ.text = data.name
            tv_detail_country_univ.text = country
            tv_detail_country_rank_univ.text = countryRank
            tv_detail_desc_univ.text = data.description

            btn_detail_link.setOnClickListener {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(data.link))
                startActivity(intent)
            }
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}