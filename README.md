# Práctica 1 – Estructuras Lineales

## Versión: 2.0.2  
**Mensaje de versión:** Estructuras Lineales – Ejercicios

---

## 📌 Descripción general

Esta versión incluye la implementación de dos ejercicios prácticos utilizando pilas (`Stack`) y colas (`Queue`).  
Todo el código fue desarrollado directamente dentro del archivo `App.java`, como lo indicó el docente.

---

## ✅ Ejercicio 01: Validación de signos

Se implementó un algoritmo que evalúa si una cadena de caracteres contiene signos de apertura y cierre correctamente balanceados.  
Se usó una pila (`Stack<Character>`) para ir almacenando los signos abiertos y validar que los signos de cierre coincidan en el orden correcto.

### Ejemplos de prueba:
- Entrada: `"([]){}"` → Salida: `true`
- Entrada: `"({)}"` → Salida: `false`

---

## ✅ Ejercicio 02: Ordenar un Stack

Se implementó una lógica para ordenar una pila (`Stack<Integer>`) utilizando únicamente otra pila auxiliar.  
No se usaron arreglos ni listas externas.  
Los elementos más pequeños terminan en la cima del stack.

### Ejemplo:
- Entrada (tope): `2, 4, 1, 5`
- Salida (tope): `1, 2, 4, 5`

---

## 🛠️ Estructura del código

- Todo el código se encuentra en el archivo `App.java`.
- Se usaron únicamente clases provistas (como `Stack`, `StackG`, `Cola`, `ColaG`) y estructuras auxiliares como `java.util.Stack`.
- Los métodos fueron implementados dentro de `main()` o directamente como bloques de código sin métodos auxiliares, siguiendo las instrucciones del docente.

---

## 🚀 Cómo ejecutar

1. Abrir el proyecto en tu IDE.
2. Ejecutar la clase `App.java` ubicada en `src/`.
3. Observar los resultados en consola para los ejercicios 01 y 02.

---

## 👤 Autor

**Estudiante:** Keyra Carvajal 
**Carrera:** Computación  
**Asignatura:** Estructura de Datos – Interciclo  

---

