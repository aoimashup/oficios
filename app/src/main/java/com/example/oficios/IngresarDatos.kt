package com.example.oficios

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class IngresarDatos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ingresar_datos)
    }

    fun onClickListener(view: View) {
        if (view is Button) {
            when (view.id) {
                R.id.confirmarDatos -> {
                    Toast.makeText(this, "Confimo datos", Toast.LENGTH_LONG).show()
                }
            }
        }
    }
}