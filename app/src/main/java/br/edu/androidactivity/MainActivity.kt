package br.edu.androidactivity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import br.edu.androidactivity.ui.theme.AndroidActivityTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtTexto = findViewById<EditText>(R.id.editTexto)
        val button = findViewById<Button>(R.id.buttonToast)
        val buttonTela2 = findViewById<Button>(R.id.buttonTela2)
        button.setOnClickListener{
            val texto = edtTexto.text.toString()
            Toast.makeText(this, texto, Toast.LENGTH_SHORT).show()
        }
        buttonTela2.setOnClickListener {
            val intent = Intent(this, Tela2Activity::class.java)
            intent.putExtra("nome","Alex")
            intent.putExtra("idade",48)
            startActivity(intent)
        }

    }
}