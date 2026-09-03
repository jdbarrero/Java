# 02 - Operadores

## Objetivo

Comprender cómo Java utiliza operadores para **calcular**, **comparar** y **combinar condiciones**, y observar cómo una expresión booleana puede convertirse posteriormente en la condición de una sentencia `if`.

## Operadores estudiados

### Aritméticos

| Operador | Significado |
|---|---|
| `+` | suma |
| `-` | resta |
| `*` | multiplicación |
| `/` | división |
| `%` | residuo de una división |

### Relacionales

| Operador | Significado |
|---|---|
| `>` | mayor que |
| `<` | menor que |
| `>=` | mayor o igual que |
| `<=` | menor o igual que |
| `==` | igual a |
| `!=` | diferente de |

Los operadores relacionales producen como resultado un valor `boolean`: `true` o `false`.

### Lógicos

| Operador | Significado |
|---|---|
| `&&` | AND: ambas condiciones deben ser verdaderas |
| `||` | OR: al menos una condición debe ser verdadera |
| `!` | NOT: niega o invierte un valor booleano |

## Ejemplos

### 1. `Ejemplo1OperadoresAritmeticos.java`
Presenta `+`, `-`, `*`, `/` y `%` usando dos números enteros.

> En una división entre variables `int`, Java produce un resultado entero. Por ejemplo, `20 / 6` produce `3`.

### 2. `Ejemplo2OperadoresRelacionales.java`
Compara dos valores y muestra que toda comparación genera `true` o `false`.

### 3. `Ejemplo3OperadoresLogicos.java`
Trabaja directamente con variables `boolean` para comprender `&&`, `||` y `!`.

### 4. `Ejemplo4OperadoresCombinados.java`
Relaciona los tres grupos de operadores en una misma situación:

```text
precio * cantidad
       ↓
total de la compra
       ↓
total >= monto mínimo
       ↓
true / false
       ↓
condición && cliente frecuente
       ↓
true / false
```

De esta forma se observa que un **cálculo aritmético** puede alimentar una **comparación**, y el resultado booleano de esa comparación puede utilizarse después en una **operación lógica**.

### 5. `Ejemplo5AntesDeIf.java`
Utiliza `!` para negar una variable booleana y muestra, como adelanto del siguiente tema, que una expresión `boolean` puede controlar la ejecución de un bloque `if`.

## Compilar y ejecutar

Cada archivo es independiente. Por ejemplo:

```bash
javac Ejemplo1OperadoresAritmeticos.java
java Ejemplo1OperadoresAritmeticos
```

Todos los ejemplos de esta carpeta fueron verificados con `javac` antes de incorporarlos al repositorio.
