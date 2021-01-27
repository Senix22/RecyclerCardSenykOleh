package com.senix22.recyclercard

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import kotlinx.android.synthetic.main.activity_details.*
import kotlinx.android.synthetic.main.card_view.*


class DetailsActivity : AppCompatActivity() {
    val TAG = ""
    lateinit var binding: DetailsActivity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        supportActionBar?.setDisplayShowTitleEnabled(false)

        name.text = intent.getStringExtra("NAME")
        description.text = intent.getStringExtra("DESC")
        image.setImageResource(intent.getStringExtra("PHOTO")!!.toInt())

    }

}