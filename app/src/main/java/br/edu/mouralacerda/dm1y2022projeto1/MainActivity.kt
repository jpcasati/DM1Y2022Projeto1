package br.edu.mouralacerda.dm1y2022projeto1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botao = findViewById<Button>(R.id.btnExibir)
        val nomeDigitado = findViewById<EditText>(R.id.edtNome)
        val nomeExibido = findViewById<TextView>(R.id.txtNome)

        botao.setOnClickListener {

            val textoDigitado = nomeDigitado.text.toString()
            nomeExibido.text = textoDigitado

        }

        val botao2 = findViewById<Button>(R.id.btnResetar)

        botao2.setOnClickListener {
            nomeDigitado.text.clear()
            nomeExibido.text = "Digite seu nome acima"
        }


    }
}


