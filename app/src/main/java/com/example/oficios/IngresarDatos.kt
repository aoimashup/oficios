package com.example.oficios

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class IngresarDatos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ingresar_datos)

        val confirmarDatosBtn = findViewById<Button>(R.id.confirmarDatos)

        confirmarDatosBtn?.setOnClickListener()
        {
            Toast.makeText(this, "Confimo datos", Toast.LENGTH_LONG).show()
        }

    }
}