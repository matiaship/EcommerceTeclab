# E-commerce - Listado de Productos

Aplicación Android desarrollada en **Kotlin** que consume una API externa y muestra un listado de productos con su nombre y precio.

---

## 📋 Descripción

Este proyecto cumple con los requisitos del trabajo práctico:
- Conexión a la API externa: `https://jsonkeeper.com/b/MX0A`
- Obtención y parseo del JSON con productos
- Visualización de nombre y precio de cada producto
- Manejo básico de errores
- Uso de corrutinas y Retrofit (mejores prácticas)

---

## 🛠 Tecnologías utilizadas

- **Lenguaje**: Kotlin
- **Arquitectura**: MVVM (básico)
- **Consumo de API**: Retrofit 2 + Gson
- **Corrutinas**: kotlinx-coroutines
- **Interfaz**: View Binding
- **Mínimo SDK**: Android 7.0 (API 24)

---

## 📱 Funcionalidades

- Carga asíncrona de productos desde la API
- Muestra en pantalla: Nombre, Precio y Estado de stock
- Logs en consola (Logcat) para ver los datos obtenidos
- Manejo de errores con mensaje al usuario

---

## 📊 Productos incluidos en la API

- iPhone 13
- Samsung Galaxy S21
- Google Pixel 6
- MacBook Pro
- Dell XPS 13

---

## 🚀 Cómo ejecutar el proyecto

1. Clonar el repositorio:
   ```bash
   git clone https://github.com/matiaship/EcommerceTeclab.git
