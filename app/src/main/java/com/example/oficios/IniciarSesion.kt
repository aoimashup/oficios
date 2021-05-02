package com.example.oficios

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class IniciarSesion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_iniciar_sesion)

        val confirmarBtn = findViewById<Button>(R.id.confirmarInicioSesion)

        confirmarBtn.setOnClickListener(){
            Toast.makeText(this, "SESION INICIADA ", Toast.LENGTH_SHORT).show()
        }
    }
}