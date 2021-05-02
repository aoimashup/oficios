package com.example.oficios

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Registro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)

        val yaMeRegistreBtn = findViewById<Button>(R.id.yaMeRegistreBtn)
        val confirmarBtn = findViewById<Button>(R.id.confirmarBtn)

        yaMeRegistreBtn.setOnClickListener(){
            val intent4 = Intent(this, IniciarSesion::class.java)
            startActivity(intent4)
        }

        confirmarBtn.setOnClickListener(){
            Toast.makeText(this, "Registro completado", Toast.LENGTH_SHORT).show()
        }

    }
}