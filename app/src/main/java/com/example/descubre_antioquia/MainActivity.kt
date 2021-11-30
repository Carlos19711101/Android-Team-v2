package com.example.descubre_antioquia

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView



class MainActivity : AppCompatActivity() {

    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<Sites>
    lateinit var imageId :Array<Int>
    lateinit var heading : Array<String>
    lateinit var detail : Array<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageId = arrayOf(
            R.drawable.piedra_1,
            R.drawable.santafe_2,
            R.drawable.jardin_3,
            R.drawable.estadio_4,
            R.drawable.jerico_5
        )
        heading = arrayOf(
            "Piedra del Peñol",
            "Santa Fe de Antioquia",
            "El Jardín",
            "Estadio Atanasio Girardot",
            "Jericó"
        )
        detail = arrayOf(
            "El peñón de Guatapé, o piedra del Peñol, es un monolito de 220 metros de altura, localizado en El Peñol-Guatapé",
            "Puente de Occidente. Kanaloa Parque Acuatico. Plaza Mayor Juan de Corral. Iglesia de Nuestra Señora de Chiquinquirá",
            "Pueblo más Bonito de Antioquia, Ciudad de los muchos cerros y Monumento Nacional",
            "Campo deportivo del Área Metropolitana del Valle de Aburrá","La Atenas del suroeste antioqueño"
        )

        newRecyclerView = findViewById(R.id.recyclerView)
        newRecyclerView.layoutManager = LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)

        newArrayList = arrayListOf<Sites>()
        getUserdata()
        }

    private fun getUserdata() {
        for (i in imageId.indices){
            val sites = Sites(imageId[i],heading[i],detail [i])
            newArrayList.add(sites)
        }

        var adapter = RecyclerAdapter(newArrayList)
        newRecyclerView.adapter = adapter
        adapter.setOnItemClickListener(object:RecyclerAdapter.onItemClickListener{
            override fun onItemClick(position:Int){
                Toast.makeText(this@MainActivity, "You clicked on item no. $position",Toast.LENGTH_SHORT).show()
            }
        })
    }

}