package com.matrom.ecommerceteclab

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.matrom.ecommerceteclab.databinding.ActivityMainBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        cargarProductos()
    }

    private fun cargarProductos() {
        lifecycleScope.launch {
            try {
                val response = withContext(Dispatchers.IO) {
                    ApiClient.instance.getProducts()
                }
                mostrarProductos(response.products)
            } catch (e: Exception) {
                Log.e("API_ERROR", "Error", e)
                Toast.makeText(this@MainActivity, "Error: ${e.message}", Toast.LENGTH_LONG).show()
            }
        }
    }

    private fun mostrarProductos(productos: List<Product>) {
        val texto = StringBuilder()
        productos.forEach { p ->
            val stock = if (p.in_stock) "✅ En stock" else "❌ Sin stock"
            texto.append("📱 ${p.name}\n💰 ${p.price} ${p.currency}\n$stock\n\n")
        }
        binding.tvProductos.text = texto.toString()
    }
}