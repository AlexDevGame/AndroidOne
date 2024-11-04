package br.edu.androidactivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.ComponentActivity

class Tela2Activity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela2)

        val nome = intent.getStringExtra("nome") ?: "Nome não informado"
        val idade = intent.getIntExtra("idade", -1)

        try {
            val textMensagem = findViewById<TextView>(R.id.textMensagem)
            textMensagem.text = "Nome: $nome / Idade: $idade"
        } catch (e: Exception) {
            Log.e("Tela2Activity", "Erro ao exibir mensagem: ${e.message}")
        }
    }
}
