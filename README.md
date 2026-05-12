# Taller de Interfaces en Java

## Descripción general
Este proyecto reúne tres ejercicios desarrollados en Java utilizando Programación Orientada a Objetos (POO) e interfaces.

Cada actividad fue creada con el objetivo de comprender cómo las interfaces permiten definir comportamientos comunes entre distintas clases, mejorando la organización, reutilización y escalabilidad del código.

Los ejercicios incluyen:
1. Sistema académico de impresión.
2. Sistema bancario de pagos.
3. Sistema de roles empresariales.

---

# Objetivos del taller

- Aplicar interfaces en Java.
- Utilizar `@Override` correctamente.
- Implementar polimorfismo.
- Evitar repetición de lógica innecesaria.
- Diferenciar responsabilidades mediante múltiples interfaces.
- Desarrollar menús interactivos utilizando estructuras repetitivas y condicionales.

---

# Ejercicio 1: Sistema académico de impresión

## Objetivo
Aplicar una interfaz utilizando varias clases relacionadas con documentos académicos.

---

## Interfaz utilizada

```java
public interface Imprimible {
    void imprimir();
}
```

---

## Clases desarrolladas

### Certificado
Representa certificados académicos.

Funciones:
- Imprimir certificados.
- Mostrar información del estudiante.

---

### ActaNotas
Representa actas de calificaciones.

Funciones:
- Imprimir notas académicas.
- Mostrar período o materia.

---

### HorarioAcademico
Representa horarios estudiantiles.

Funciones:
- Imprimir horarios académicos.
- Mostrar carrera o semestre.

---

## Funcionalidades aplicadas

- Uso de interfaz simple.
- Implementación de `@Override`.
- Polimorfismo básico.
- Diferentes mensajes según la clase.

---

# Ejercicio 2: Sistema bancario de pagos

## Objetivo
Aplicar interfaces junto con validación de datos y reutilización de lógica.

---

## Interfaz utilizada

```java
public interface Pagable {
    void procesarPago(double monto);
}
```

---

## Clases desarrolladas

### PagoEfectivo
Procesa pagos realizados en efectivo.

---

### PagoTarjeta
Procesa pagos realizados mediante tarjeta.

---

### Transferencia
Procesa transferencias bancarias.

---

## Funcionalidades aplicadas

- Validación de montos mayores a cero.
- Diferentes mensajes según el método de pago.
- Reutilización de lógica mediante una clase base.
- Uso de herencia e interfaces.
- Uso de `@Override`.

---

## Validaciones implementadas

```text
- El monto no puede ser menor o igual a cero.
- Se muestran mensajes de error cuando el monto es inválido.
- Cada tipo de pago tiene su propio comportamiento.
```

---

# Ejercicio 3: Sistema de roles empresariales

## Objetivo
Diferenciar responsabilidades utilizando múltiples interfaces.

---

# Interfaces utilizadas

## Autenticable

```java
public interface Autenticable {
    boolean iniciarSesion(String usuario, String clave);
}
```

---

## Reportable

```java
public interface Reportable {
    void generarReporte();
}
```

---

## Gestionable

```java
public interface Gestionable {
    void gestionarDatos();
}
```

---

# Clases desarrolladas

## Cajero
Implementa:
- Autenticable
- Gestionable

Funciones:
- Iniciar sesión.
- Gestionar pagos y ventas.

---

## Administrador
Implementa:
- Autenticable
- Reportable
- Gestionable

Funciones:
- Iniciar sesión.
- Generar reportes.
- Gestionar información del sistema.

---

## Supervisor
Implementa:
- Autenticable
- Reportable

Funciones:
- Iniciar sesión.
- Generar reportes de supervisión.

---

# Menú interactivo implementado

Se agregó un menú utilizando `while` y `switch` para seleccionar el rol que accederá al sistema.

Opciones disponibles:

```text
1. Cajero
2. Administrador
3. Supervisor
4. Salir
```

---

# Funcionalidades generales del proyecto

- Uso de interfaces.
- Uso de múltiples interfaces.
- Aplicación de polimorfismo.
- Implementación de herencia.
- Validación de datos.
- Uso correcto de `@Override`.
- Menús interactivos.
- Organización modular del código.
- Programación Orientada a Objetos (POO).

---

# Tecnologías utilizadas

- Java
- IntelliJ IDEA
- Programación Orientada a Objetos

---

# Estructura del proyecto

```text
├── Ejercicio1
│   ├── Imprimible.java
│   ├── Certificado.java
│   ├── ActaNotas.java
│   ├── HorarioAcademico.java
│   └── MainAcademico.java
│
├── Ejercicio2
│   ├── Pagable.java
│   ├── PagoBase.java
│   ├── PagoEfectivo.java
│   ├── PagoTarjeta.java
│   ├── Transferencia.java
│   └── MainPagos.java
│
├── Ejercicio3
│   ├── Autenticable.java
│   ├── Reportable.java
│   ├── Gestionable.java
│   ├── Cajero.java
│   ├── Administrador.java
│   ├── Supervisor.java
│   └── MainEmpresa.java
```

---

# Aprendizajes adquiridos

Durante el desarrollo del proyecto se aprendió:

- Cómo crear e implementar interfaces.
- Cómo reutilizar lógica para evitar código repetido.
- Cómo aplicar herencia e interfaces simultáneamente.
- Cómo diferenciar responsabilidades entre clases.
- Cómo validar información ingresada por el usuario.
- Cómo construir menús interactivos utilizando estructuras repetitivas y condicionales.
- Cómo organizar proyectos utilizando buenas prácticas básicas de POO.

---

# Conclusión

Este taller permitió reforzar conocimientos fundamentales de Programación Orientada a Objetos en Java, especialmente el uso de interfaces para separar responsabilidades y mejorar la estructura del código.

Además, se aplicaron conceptos importantes como:
- Polimorfismo.
- Herencia.
- Encapsulamiento.
- Reutilización de código.
- Validación de datos.
- Diseño modular de clases.
