# 04 - Funciones en Java

Ejemplos progresivos para introducir funciones (métodos) en Java.

> En Java no existen variables globales en el mismo sentido que en otros lenguajes.  
> Para este nivel introductorio se utilizarán **variables de clase (`static`)** como equivalente didáctico a una variable "global", porque pueden ser usadas por los métodos de la clase.

## Secuencia

1. `Ejemplo1FuncionSimple.java` — función sin parámetros y sin retorno.
2. `Ejemplo2FuncionConParametro.java` — función con parámetro.
3. `Ejemplo3FuncionConRetorno.java` — función con `return`.
4. `Ejemplo4FuncionConVariosParametros.java` — varios parámetros.
5. `Ejemplo5FuncionesRelacionadas.java` — varias funciones colaborando.
6. `Ejemplo6PracticaGuiada.java` — práctica corta.
7. `Ejemplo7VariablesLocalesYDeClase.java` — diferencia entre variable local y variable de clase.
8. `Ejemplo8AlcanceDeVariables.java` — alcance y reutilización de una variable de clase desde varios métodos.

## Idea clave

```java
static int sumar(int a, int b) {
    return a + b;
}
```

- Los parámetros reciben datos.
- `return` devuelve un resultado.
- `void` indica que no se devuelve ningún valor.
- Una función puede reutilizarse varias veces.

## Variables locales y de clase

```java
static double iva = 0.19;   // Variable de clase

static double calcularTotal(double precio) {
    double impuesto = precio * iva;   // Variable local
    return precio + impuesto;
}
```

- Una **variable local** existe solamente dentro del método o bloque donde se declara.
- Una **variable de clase `static`** pertenece a la clase y puede ser utilizada por sus métodos `static`.
