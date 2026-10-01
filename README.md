# 🏦 Sistema Bancario - Java POO

Proyecto desarrollado en Java para practicar los principales conceptos de **Programación Orientada a Objetos (POO)** mediante la implementación de un sistema bancario.

El sistema permite registrar distintos tipos de clientes y trabajar con diferentes tipos de cuentas bancarias, cada una con sus propias características y operaciones.

## 📌 Funcionalidades

El sistema cuenta con dos tipos de clientes:

- **Cliente Individual:** posee número de cliente, nombre, apellido y DNI.
- **Cliente Empresa:** posee número de cliente, nombre de fantasía y CUIT.

También se implementaron distintos tipos de cuentas:

### 💰 Cuenta de Ahorro
Permite:
- Depositar dinero.
- Extraer dinero.
- Aplicar intereses sobre el saldo disponible.

### 💳 Cuenta Corriente
Permite:
- Depositar y extraer dinero.
- Trabajar con un monto de descubierto.
- Depositar cheques.

### 💵 Cuenta Convertibilidad
Extiende las funcionalidades de una cuenta corriente y agrega:
- Saldo en dólares.
- Depósito de dólares.
- Extracción de dólares.
- Conversión de pesos a dólares.
- Conversión de dólares a pesos mediante una tasa de conversión.

## 🏛️ Sistema Bancario

La clase `SistemaBancario` mantiene dos registros principales:

- Una lista de clientes.
- Una lista de cuentas.

Los clientes y cuentas pueden registrarse mediante los métodos correspondientes del sistema.

## 🧩 Conceptos de POO aplicados

Durante el desarrollo se utilizaron:

- **Herencia:** para crear diferentes tipos de clientes y cuentas a partir de clases padre.
- **Abstracción:** mediante las clases abstractas `Cliente` y `Cuenta`.
- **Encapsulamiento:** utilizando atributos privados y métodos Getter/Setter.
- **Polimorfismo:** mediante la implementación de métodos como `depositar()` y `extraer()` en los distintos tipos de cuenta.
- **Constructores y `super()`:** para inicializar atributos propios y heredados.
- **Colecciones (`List` y `ArrayList`):** para almacenar clientes y cuentas.
- **Lombok:** para generar automáticamente métodos como Getter, Setter y `toString()`.

## 🧪 Pruebas

El proyecto incluye clases de prueba para comprobar el funcionamiento de:

- Clientes individuales y empresas.
- Cuentas de ahorro.
- Cuentas corrientes.
- Cuentas de convertibilidad.
- Registro de clientes y cuentas en el sistema bancario.

## 🛠️ Tecnologías utilizadas

- Java
- Programación Orientada a Objetos
- Lombok
- Maven
- Visual Studio Code
