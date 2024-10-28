package br.edu.androidactivity

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Tela2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela2)
        val nome = intent.getStringExtra("nome")
        val idade = intent.getIntExtra("idade", -1)
        val textMensagem = findViewById<TextView>(R.id.textMensagem)

    }
}