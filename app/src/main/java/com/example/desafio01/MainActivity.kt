package com.example.desafio01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.novo_layout.*
import java.math.BigDecimal
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.novo_layout)


        btnVerificar.setOnClickListener{

            if (textValorGasolina.getText().isNullOrEmpty() ||
                textValorEtanol.getText().isNullOrEmpty())
            {
                textViewResultado.setText("Informe os valores da gasolina e etanol")
                Log.i("Informação", "Informe os valores da gasolina e etanol")
                return@setOnClickListener
            }

            var valorEtanol = textValorEtanol.getText().toString().toFloat()
            var valorGasolina = textValorGasolina.getText().toString().toFloat()

            if ((valorGasolina * 0.7)  > valorEtanol)
                textViewResultado.setText("Utilizar o etanol")
            else
                textViewResultado.setText("Utilizar a gasolina")

            Log.i("Informação", textViewResultado.getText().toString())
        }
    }
}
