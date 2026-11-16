# 🚗 Concesionaria - Java POO

Proyecto desarrollado en Java para practicar los principales conceptos de **Programación Orientada a Objetos (POO)** mediante la implementación de un sistema de concesionaria.

El sistema permite trabajar con distintos tipos de vehículos, como autos y motos, utilizando herencia, interfaces y colecciones para almacenar y organizar la información.

## 📌 Funcionalidades

El sistema cuenta con dos tipos de vehículos:

- **Auto:** posee marca, modelo, precio y cantidad de puertas.
- **Moto:** posee marca, modelo, precio y cilindrada.

Ambos comparten los atributos y funcionalidades definidos en la clase abstracta `Vehiculo`.

## 🚘 Gestión de vehículos

El sistema permite:

- Registrar autos y motos.
- Mostrar la información de todos los vehículos.
- Encontrar el vehículo más caro.
- Encontrar el vehículo más barato.
- Filtrar vehículos cuyo modelo contiene la letra "Y".
- Ordenar vehículos por precio de mayor a menor.
- Ordenar vehículos por su orden natural (marca, modelo y precio).

## 🧩 Conceptos de POO aplicados

Durante el desarrollo se utilizaron:

- **Herencia:** para crear las clases `Auto` y `Moto` a partir de `Vehiculo`.
- **Abstracción:** mediante la clase abstracta `Vehiculo`.
- **Interfaces:** mediante la interfaz `Informacion`, que define el método `mostrarDatos()`.
- **Polimorfismo:** trabajando con distintos tipos de vehículos a través de una lista de tipo `Vehiculo`.
- **Encapsulamiento:** mediante atributos y métodos Getter/Setter.
- **Constructores y `super()`:** para inicializar atributos propios y heredados.
- **Sobrescritura de métodos:** mediante `toString()` y `mostrarDatos()`.
- **Comparable:** para establecer el orden natural de los vehículos.
- **Comparator:** para ordenar vehículos según su precio.

## 📚 Colecciones y API Stream

Se utilizaron:

- **Collections Framework:** mediante `List` y `ArrayList` para almacenar los vehículos.
- **API Stream:** utilizando `stream()`, `forEach()`, `filter()`, `max()`, `min()` y `sorted()`.
- **Collections.sort():** para ordenar los vehículos según su orden natural.

## 🛠️ Tecnologías utilizadas

- Java 21
- Programación Orientada a Objetos
- Lombok
- Maven
- Visual Studio Code