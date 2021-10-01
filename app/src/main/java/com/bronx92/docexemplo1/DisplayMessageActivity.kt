package com.bronx92.docexemplo1

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.widget.TextView

class DisplayMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        // Obtem o Intent iniciado nessa Activity e Extrai a mensagem contida nela
        val mensagem = intent.getStringExtra(EXTRA_MESSAGE)

        // Captura o TextView do layout e Define como texto da View a mensagem extraida
        val textView = findViewById<TextView>(R.id.textView2).apply {
            text = mensagem
        }
    }
}

