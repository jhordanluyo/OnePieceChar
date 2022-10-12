package com.creartec.onepiecechar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.creartec.onepiecechar.datasource.DataSource
import com.creartec.onepiecechar.model.OpChar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recycler=findViewById<RecyclerView>(R.id.recycler)
        //aqui podemos manipular la propiedad que establecimos en el xml para el recycler view
        //val layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        //recycler.layoutManager=layoutManager
        recycler.adapter=OpCharAdapter(DataSource().loadChars())
    }
}