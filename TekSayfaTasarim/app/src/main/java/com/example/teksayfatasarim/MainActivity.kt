package com.example.teksayfatasarim

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.teksayfatasarim.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_TekSayfaTasarim)
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginButton.setOnClickListener {
            val u = binding.usernameInput.text.toString()
            val p = binding.passwordInput.text.toString()
            binding.statusText.text = when {
                u.isEmpty() || p.isEmpty() -> getString(R.string.login_fail)
                else -> getString(R.string.login_success)
            }
        }
    }
}
