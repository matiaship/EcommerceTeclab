package com.matrom.ecommerceteclab

import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class ProductFormatterTest {

    @Test
    fun `cuando hay productos, validar que la informacion se muestra correctamente`() {
        // Arrange
        val productos = listOf(
            Product(1, "Laptop", "High performance", 1500.0, "USD", true),
            Product(2, "Mouse", "Wireless mouse", 25.0, "USD", false)
        )

        // Act
        val resultado = ProductFormatter.formatProductList(productos)

        // Assert
        assertTrue(resultado.contains("Laptop"))
        assertTrue(resultado.contains("1500.0 USD"))
        assertTrue(resultado.contains("✅ En stock"))
        assertTrue(resultado.contains("Mouse"))
        assertTrue(resultado.contains("❌ Sin stock"))
    }

    @Test
    fun `cuando el listado esta vacio, validar que no se muestra informacion`() {
        // Arrange
        val productos = emptyList<Product>()

        // Act
        val resultado = ProductFormatter.formatProductList(productos)

        // Assert
        assertEquals("", resultado)
    }
}