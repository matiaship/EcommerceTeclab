package com.matrom.ecommerceteclab

object ProductFormatter {
    fun formatProductList(productos: List<Product>): String {
        if (productos.isEmpty()) return ""
        
        val texto = StringBuilder()
        productos.forEach { p ->
            val stock = if (p.in_stock) "✅ En stock" else "❌ Sin stock"
            texto.append("📱 ${p.name}\n💰 ${p.price} ${p.currency}\n$stock\n\n")
        }
        return texto.toString().trimEnd()
    }
}