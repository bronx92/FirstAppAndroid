package com.bronx92.docexemplo1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

const val EXTRA_MESSAGE = "com.bronx92.docexemplo1.MESSAGE"
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun sendMessage(view: View) {
        val texto = findViewById<EditText>(R.id.editText)
        val mensagem = texto.text.toString()
        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, mensagem)
        }
        startActivity(intent)
    }
}

