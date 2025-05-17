package com.example.login

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var etUsername: EditText
    private lateinit var etPassword: EditText
    private lateinit var btnLogin: Button
    private lateinit var tvError: TextView

    private val validUsername = "admin"
    private val validPassword = "12345"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inicializamos las vistas
        etUsername = findViewById(R.id.etUsername)
        etPassword = findViewById(R.id.etPassword)
        btnLogin = findViewById(R.id.btnLogin)
        tvError = findViewById(R.id.tvError)

        // Configuramos el botón de login
        btnLogin.setOnClickListener {
            val username = etUsername.text.toString().trim()
            val password = etPassword.text.toString().trim()

            // Validamos si el nombre de usuario y contraseña son correctos
            if (username == validUsername && password == validPassword) {
                // Si los datos son correctos, mostramos un mensaje de éxito
                Toast.makeText(this, "Login exitoso", Toast.LENGTH_SHORT).show()
                // Aquí podrías iniciar otra actividad si el login es correcto
            } else {
                // Si los datos son incorrectos, mostramos un mensaje de error
                tvError.visibility = TextView.VISIBLE
            }
        }
    }
}
