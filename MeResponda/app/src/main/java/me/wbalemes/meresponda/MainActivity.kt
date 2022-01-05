package me.wbalemes.meresponda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    val res = arrayOf("Sim", "Não conte com isso!!", "Talvez", "Com certeza!", "O Google deve saber.", "Não", "E o kiko?")
    val random = Random.Default

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnEnviar = findViewById<Button>(R.id.btnEnviar)
        val resposta = findViewById<TextView>(R.id.resposta)
        val pergunta = findViewById<EditText>(R.id.lblPergunta)


        // Register the onClick listener with the implementation above
        btnEnviar.setOnClickListener {
            if (pergunta.text.isEmpty()) {
                resposta.text = "Pergunte antes..."
            } else {
                val i = random.nextInt(7)
                resposta.text = res[i]
            }
        }
    }
}
