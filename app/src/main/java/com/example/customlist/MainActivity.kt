package com.example.customlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    var arrayDatos = ArrayList<Character>()
    var adaptador: MyAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        arrayDatos.add(Character("Bender","Futurama",R.drawable.bender))

        adaptador = MyAdapter(this,arrayDatos)

        val list = findViewById<ListView>(R.id.listID)
        list.adapter = adaptador
    }
}