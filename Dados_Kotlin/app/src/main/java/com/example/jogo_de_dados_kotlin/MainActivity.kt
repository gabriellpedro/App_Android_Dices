package com.example.jogo_de_dados_kotlin

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

    fun Sorteiodado(view: View){
        val Dado = findViewById<ImageView>(R.id.Dado)
        val Botao = findViewById<Button>(R.id.Botao)
        val ListaImagens = listOf(
            R.drawable.dado_1,
            R.drawable.dado_2,
            R.drawable.dado_3,
            R.drawable.dado_4,
            R.drawable.dado_5,
            R.drawable.dado_6
        )

        Botao.setOnClickListener{
            var NumeroRandom = Random.nextInt(0,5)
            Dado.setImageResource(ListaImagens[NumeroRandom])
        }

    }

}