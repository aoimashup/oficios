package com.example.oficios

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class BusquedaServicios : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_busqueda_servicios)

        val buscarBtn = findViewById<Button>(R.id.buscarServiciosBtn)

        buscarBtn.setOnClickListener(){
            val intent5 = Intent(this, MostrarResultados::class.java)
            startActivity(intent5)
        }
    }
}