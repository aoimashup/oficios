package com.example.oficios

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buscoServiciosBtn = findViewById<Button>(R.id.buscaServicioBtn)
        val ofrezcoServicioBtn = findViewById<Button>(R.id.ofrezcoServicioBtn)
        val cerrarSesionBtn = findViewById<Button>(R.id.cerrarSesionBtn)

        buscoServiciosBtn?.setOnClickListener()
        {
            Toast.makeText(this@MainActivity, "JALA", Toast.LENGTH_LONG).show()
            val intent = Intent(this, BusquedaServicios::class.java)
            startActivity(intent)
        }

        ofrezcoServicioBtn.setOnClickListener(){
            val intent2 = Intent(this, Registro::class.java)
            startActivity(intent2)
        }

        cerrarSesionBtn?.setOnClickListener()
        {
            Toast.makeText(this@MainActivity, "Se cierra la sesion", Toast.LENGTH_LONG).show()
        }

    }
}