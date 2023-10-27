package com.example.jogo_de_dados_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun Segunda_Tela(view: View){

        val Botao_Segunda_Tela = findViewById<Button>(R.id.Botao)

        Botao_Segunda_Tela.setOnClickListener{
            val intent = Intent(this, Sorteio::class.java)
            startActivity(intent)
        }

    }

}