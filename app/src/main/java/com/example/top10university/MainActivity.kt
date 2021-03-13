package com.example.top10university

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.top10university.adapter.UnivAdapter
import com.example.top10university.data.UnivData
import com.example.top10university.model.Univ

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var rvUniverstities : RecyclerView
    private val listUniv : ArrayList<Univ> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val btnSource : Button = findViewById(R.id.btn_source)
        btnSource.setOnClickListener(this)

        rvUniverstities = findViewById(R.id.rv_univ)
        rvUniverstities.setHasFixedSize(true)

        listUniv.addAll(UnivData.listUniv)
        showRV()
    }

    override fun onClick(view: View) {
        when (view.id){
            R.id.btn_source -> {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.topuniversities.com/university-rankings/world-university-rankings/2020"))
                startActivity(intent)
            }
        }
    }
    fun showRV() {
        rvUniverstities.layoutManager = LinearLayoutManager(this)
        val univAdapter = UnivAdapter(listUniv)
        rvUniverstities.adapter = univAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            R.id.btn_profile -> {
                val  intent = Intent(this, ProfileActivity::class.java)
                startActivity(intent)
            }
        }
        return super.onOptionsItemSelected(item)
    }
}