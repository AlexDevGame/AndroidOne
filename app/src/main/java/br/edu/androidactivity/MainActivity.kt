package br.edu.androidactivity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val edtNome = findViewById<EditText>(R.id.editTexto)
        val edtIdade = findViewById<EditText>(R.id.editIdade)
        val buttonToast = findViewById<Button>(R.id.buttonToast)
        val buttonTela2 = findViewById<Button>(R.id.buttonTela2)


        buttonToast.setOnClickListener {

            val nome = edtNome.text.toString()
            val idade = edtIdade.text.toString()
            val mensagem = "Nome: $nome / Idade: $idade"
            Toast.makeText(this, mensagem, Toast.LENGTH_SHORT).show()
        }


        buttonTela2.setOnClickListener {

            val nome = edtNome.text.toString()
            val idade = edtIdade.text.toString().toIntOrNull()
            if (nome.isNotBlank() && idade != null) {
                val intent = Intent(this, Tela2Activity::class.java)
                intent.putExtra("nome", nome)
                intent.putExtra("idade", idade)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Digite um nome e uma idade válida.", Toast.LENGTH_SHORT)
                    .show()
            }
        }
    }
}
