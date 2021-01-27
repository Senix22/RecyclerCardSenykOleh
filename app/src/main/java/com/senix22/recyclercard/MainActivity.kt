package com.senix22.recyclercard

import android.content.Intent
import android.database.DatabaseUtils
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.databinding.DataBindingUtil.setContentView
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), OnDataItemClickListener {
    lateinit var binding: MainActivity
    lateinit var personList: ArrayList<Person>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        personList = ArrayList()
        addPerson()
        carRecycler.layoutManager = LinearLayoutManager(this)
        carRecycler.addItemDecoration(DividerItemDecoration(this, 1))
        carRecycler.adapter = RecyclerViewAdapter(personList, this)
    }

    fun addPerson() {
        personList.add(Person("Номер К", " Профессионалы", R.drawable.csgo))
        personList.add(Person("Grogu", " Is a character from the Star Wars Disney", R.drawable.starwars))
        personList.add(Person("Райз", "райз", R.drawable.raiz))
        personList.add(Person("Itachi ", "Itachi Uchiha", R.drawable.itachi))
        personList.add(Person("21 pilots ", "Американский дуэт из Колумбуса, штат Огайо", R.drawable.twenty_one_pilots))
        personList.add(Person("Tomas Shelby ", "Peaky Blinders", R.drawable.tomas_shelby))

    }

    override fun onItemClick(item: Person, position: Int) {
        val intent = Intent(this, DetailsActivity::class.java)
        intent.putExtra("NAME", item.name)
        intent.putExtra("DESC", item.description)
        intent.putExtra("PHOTO", item.photo.toString())
        startActivity(intent)
    }
}