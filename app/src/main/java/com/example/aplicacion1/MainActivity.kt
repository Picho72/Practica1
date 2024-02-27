package com.example.aplicacion1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var contador:Int = 0
    var bandera:Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtConteo = findViewById<TextView>(R.id.txtConteo)
        val btnContador = findViewById<Button>(R.id.btnCuenta)
        val btnReiniciar = findViewById<Button>(R.id.btnReiniciar)

        btnContador.setOnClickListener{
            if(bandera){
                contador--
                txtConteo.text = "$contador"
                if(contador <= 0){
                    bandera = false
                    btnContador.text = "AUMENTAR"
                }
            }else {
                contador++
                txtConteo.text = "$contador"
                if(contador >= 10){
                    btnContador.text = "DISMINUIR"
                    bandera = true
                }
            }
        }

        btnReiniciar.setOnClickListener{
            contador = 0
            bandera = false
            txtConteo.text = "$contador"
            btnContador.text = "AUMENTAR"
        }

    }
}