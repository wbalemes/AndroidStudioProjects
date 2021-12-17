package me.wbalemes.meresponda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    val res = arrayOf("sim", "Não conte com isso!!", "Talvez")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClick = findViewById(R.id.btnClick)
        btnClick.setOnClickListener {
            textView = res[0]
        }
    }
}