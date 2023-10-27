package com.example.jogo_de_dados_kotlin

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class Sorteio : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sorteio)

        Sorteiodado()
    }

    fun Sorteiodado(){
        val Dado = findViewById<ImageView>(R.id.Dado)
        val ListaImagens = listOf(
            R.drawable.dado_1,
            R.drawable.dado_2,
            R.drawable.dado_3,
            R.drawable.dado_4,
            R.drawable.dado_5,
            R.drawable.dado_6
        )

        var NumeroRandom = Random.nextInt(0,5)
        Dado.setImageResource(ListaImagens[NumeroRandom])

    }

    fun Voltar(view: View) {
        finish()
    }
}
