package com.example.logintask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.logintask.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private var logo = 0
    private var name : String? = null
    private var details : String? = null

    private var binding : ActivityDetailBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        logo = intent.getIntExtra(FactAdapter.LOGO_EXTRAs, 0)
        name = intent.getStringExtra(FactAdapter.NAME_EXTRA)
        details = intent.getStringExtra(FactAdapter.FACT_EXTRAs)

        setUpFactDetail()
    }

    private fun setUpFactDetail(){
        binding?.detailTv?.text = details
        binding?.logoIv?.setImageResource(logo)
        title = name

    }

    override fun onDestroy() {
        super.onDestroy()

        binding = null
    }
}