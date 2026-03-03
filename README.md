# Laboratorios-JFS-JJA
# 📘 Ejercicio en Clase 3 – Modularización en Java
## Curso: Programación 1

---

## 🎯 Objetivo

Aplicar los conceptos de:

- Modularización mediante métodos.
- Uso correcto de variables locales y globales.
- Validación de entradas del usuario.
- Manejo básico de excepciones.
- Mejora de la organización y legibilidad del código.

---

## 📌 Instrucciones Generales

- Trabajar en parejas (**Obligatorio**).
- No utilizar IA para el análisis.
- Se proporcionará un programa base en Java.
- Analizarlo, mejorarlo y documentar el proceso en este archivo `README.md`.

---

# 🧠 Parte 1 – Análisis del Programa Original

**Al analizar el programa, lo primero que notamos fue que el cuerpo principal estaba en enteramente hecho con if y else. No tenia
nigún metodo, la validación de entrada de datos estaba casi sin tocar, si poniamos una letra el escoger una opción del menú, crasheaba.**



## 1️⃣ Identificación de Tareas Repetitivas

Responder:

- ¿Qué partes del código pueden convertirse en métodos?
  **R/ Mostrar menú, Cada una de las opciones del menú, tambien la validación de datos (validacion para números enteros y decimales) y el rango de las calificaciones.**
  
- ¿Qué bloques de código se repiten?
  **R/ La salidad de datos de "No hay calificaciones registradas."**
  
- ¿Qué responsabilidades pueden separarse?
  **R/ Cada opción del menú. El ingreso de nota se dividio en dos métodos, uno que valida la entrada de datos como decimal y otro método que se valida el rango de notas de 0 a 100.**

Ejemplos de posibles tareas:

- Agregar estudiante.
- Mostrar estudiantes.
- Calcular promedio.
- Mostrar estudiante con mayor calificación.

Explicar por qué dividir estas tareas mejora el programa.

**R/ Dividir las tareas en funciones o métodos mejora el programa porque aumenta la modularidad, hace el código más legible y facilita su mantenimiento. Cada función se encarga de una sola responsabilidad, lo que permite modificar o reutilizar partes del programa sin afectar las demás.**

## 2️⃣ Variables Locales vs Globales

Responder:

- ¿Qué variables deberían declararse como globales (atributos `static` de la clase)?
- **R/ Usamos como variables o atributos static los arrays de estudiantes y calificaciones, y además del Scanner**
- ¿Cuáles deberían ser locales dentro de un método?
- **R/ Utilizamos varias variables locales, como en el caso de la variable numero, estudianteMax, maxCalificacion, opcion, calificacion y cal.**
- ¿Por qué?
- **R/ Así permite agilizar calculos y operaciones dentro de cada metodo, especialmente si el dato no es necesario en otra parte de la clase, como en el caso de la variable numero, que se usa para hacer las validaciones tanto en la validacion de double e int**

Reflexionar sobre:

- Alcance (scope)
- Tiempo de vida de la variable
- Riesgos de modificar datos globales accidentalmente

---

# 🏗️ Parte 2 – Modularización del Programa

Reestructurar el programa aplicando modularización:

- Crear métodos claros y específicos.
- Cada método debe tener una sola responsabilidad.
- Todos los métodos deben ser llamados desde `main`.
- Mantener el programa completamente funcional.

No es obligatorio usar nombres específicos, pero deben ser descriptivos.

Ejemplo de buenas prácticas:

- Un método = una responsabilidad.
- No mezclar múltiples tareas en un mismo método.
- Mantener el código ordenado e indentado.

---

# 🔐 Parte 3 – Validaciones y Manejo de Excepciones

Implementar mejoras en el programa:

- Validar entradas numéricas.
- Evitar que el programa falle si el usuario ingresa texto en lugar de números.
- Verificar que las calificaciones estén en un rango válido.
- Usar `try-catch` cuando sea necesario.

Explicar en esta sección:

- Qué errores podrían ocurrir.
- Qué validaciones implementaron.
- Por qué son importantes.

**R/Se implementó un método que valida la entrada utilizando un bloque try-catch para capturar posibles errores de conversión (NumberFormatException). Esto evita que el programa falle si el usuario ingresa texto en lugar de números. Además, el uso de un ciclo while garantiza que el programa continúe solicitando el dato hasta que sea válido.
Estas validaciones son importantes porque hacen que el programa sea más robusto, evitan cierres inesperados y mejoran la experiencia del usuario.**

# 🧩 Parte 4 – Preguntas de Reflexión

Responder con sus propias palabras.

## 1️⃣ ¿Qué ventajas tiene dividir el código en métodos?

Reflexionar sobre:

- Organización
- Reutilización
- Mantenimiento
- Claridad

**R/ El uso de metodos tiene muchas ventajas, entre eso está la limpieza y la organización del codigo ya que permite segmentar el programa por tareas y así tener un orden más fácil de entender, y también ayuda mucho a ahorrar líneas de código ya que nos permite reutilizar las funcionalidades de cada metodo sin tener que escribirlo otra vez; y el mantenimiento es más sencillo porque el código se interpreta mejor y ayuda a implementar cambios, y la claridad es una ventaja muy grande ya que permite que no solo quien hizo el codigo pueda comprenderlo sino que se facilite para otros colaboradores.

---

## 2️⃣ ¿Por qué no es recomendable usar muchas variables globales?

Reflexionar sobre:

- Posibilidad de errores inesperados
- Dificultad para depurar
- Dependencia entre métodos

---

## 3️⃣ ¿Cómo mejora la modularización la legibilidad del código?

---

# 📦 Entregables

## 1️⃣ Código Java

- Archivo `Main.java`.
- Modularizado correctamente.
- Funcional.
- Con validaciones básicas.
- Ordenado y bien indentado.

---

## 2️⃣ Este archivo `README.md`

Debe contener:

- Análisis del programa original.
- Decisiones de modularización.
- Justificación de variables locales y globales.
- Respuestas a las preguntas guía.
- Explicación de validaciones implementadas.

---

# 📊 Criterios de Evaluación

| Criterio | Puntos |
|----------|--------|
| Programa funciona correctamente | 30 |
| Modularización adecuada | 25 |
| Uso correcto de variables locales y globales | 15 |
| Validaciones implementadas | 15 |
| Calidad del README | 15 |
| **Total** | **100 puntos** |
