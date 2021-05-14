package com.example.logintask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.logintask.databinding.ActivityListViewBinding
import com.example.logintask.databinding.ActivityMainBinding

class ListViewActivity : AppCompatActivity() {

    var binding : ActivityListViewBinding? = null
    var adapter : FactAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListViewBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        setUpFact()
    }

    private fun setUpFact(){
        adapter = FactAdapter(this, DummyData.facts)
        binding?.factListView?.adapter = adapter
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}