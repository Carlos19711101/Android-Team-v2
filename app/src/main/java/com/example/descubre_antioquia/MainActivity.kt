package com.example.descubre_antioquia

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.descubre_antioquia.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*
import org.json.JSONArray
import java.io.IOException
import java.io.InputStream
import android.widget.ImageView


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

        newRecyclerView.adapter = RecyclerAdapter(newArrayList)
    }

}