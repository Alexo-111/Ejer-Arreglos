# Ventas mensuales por departamento

Este proyecto consiste en desarrollar un programa que permita almacenar y administrar las **ventas mensuales de tres departamentos: Ropa, Deportes y Juguetería**, utilizando un arreglo bidimensional.

El programa cuenta con 12 filas, correspondientes a los meses del año, y 3 columnas, correspondientes a los departamentos. De esta manera, el arreglo permite almacenar un total de **36 valores de ventas**.

El mismo problema fue implementado en dos lenguajes de programación:

* Java
* Python

Ambos programas utilizan la misma lógica y cuentan con métodos o funciones para insertar, buscar y eliminar ventas.

# Estructura del arreglo

El arreglo bidimensional se organiza de la siguiente manera:

| Mes        |  Ropa | Deportes | Juguetería |
| ---------- | ----: | -------: | ---------: |
| Enero      | Venta |    Venta |      Venta |
| Febrero    | Venta |    Venta |      Venta |
| Marzo      | Venta |    Venta |      Venta |
| Abril      | Venta |    Venta |      Venta |
| Mayo       | Venta |    Venta |      Venta |
| Junio      | Venta |    Venta |      Venta |
| Julio      | Venta |    Venta |      Venta |
| Agosto     | Venta |    Venta |      Venta |
| Septiembre | Venta |    Venta |      Venta |
| Octubre    | Venta |    Venta |      Venta |
| Noviembre  | Venta |    Venta |      Venta |
| Diciembre  | Venta |    Venta |      Venta |

Cada posición del arreglo representa una venta específica.

Por ejemplo:

* `ventas[0][0]` → Enero, Ropa
* `ventas[0][1]` → Enero, Deportes
* `ventas[0][2]` → Enero, Juguetería
* `ventas[1][0]` → Febrero, Ropa

Los índices comienzan desde `0`, tanto en Java como en Python.

# Lógica del programa

Al iniciar el programa se crea un arreglo bidimensional vacío, cuyos valores iniciales son `0`.
Posteriormente, mediante ciclos, el programa solicita al usuario las ventas correspondientes a cada mes y departamento.
Primero se recorre cada uno de los **12 meses** y, dentro de ese recorrido, se recorren los **3 departamentos**. Por cada posición se solicita al usuario la cantidad de ventas y esta se almacena en el arreglo.

La estructura general de los recorridos es:

```text
Para cada mes:
    Para cada departamento:
        Solicitar venta
        Guardar venta en el arreglo
```

De esta manera, el usuario puede introducir las 36 ventas

Después de llenar el arreglo, el programa permite realizar operaciones sobre las ventas mediante tres métodos principales:

1. Insertar una venta.
2. Buscar una venta.
3. Eliminar una venta.

También cuenta con una función adicional para mostrar todas las ventas almacenadas.

---

# Método para insertar una venta

### Java

```java
public static void insertarVenta(int mes, int departamento, int cantidad) {
    ventas[mes][departamento] = cantidad;
}
```

### Python

```python
def insertar_venta(mes, departamento, cantidad):
    ventas[mes][departamento] = cantidad
```

Este método recibe tres datos:

* `mes`: indica la fila del arreglo.
* `departamento`: indica la columna del arreglo.
* `cantidad`: representa el valor de la venta.

Con estos datos, el método coloca la cantidad correspondiente en la posición indicada del arreglo.

Por ejemplo:

```text
insertarVenta(0, 0, 15000)
```

o en Python:

```text
insertar_venta(0, 0, 15000)
```

almacena una venta de **$15,000 en Enero, departamento de Ropa**.

---

# Método para buscar una venta

### Java

```java
public static void buscarVenta(int mes, int departamento) {
    System.out.println("Mes: " + meses[mes]);
    System.out.println("Departamento: " + departamentos[departamento]);
    System.out.println("Venta: $" + ventas[mes][departamento]);
}
```

### Python

```python
def buscar_venta(mes, departamento):
    print("Mes:", meses[mes])
    print("Departamento:", departamentos[departamento])
    print("Venta: $", ventas[mes][departamento])
```

Este método permite consultar una venta específica.

Para realizar la búsqueda se proporciona el número de la fila correspondiente al mes y el número de la columna correspondiente al departamento.

El método utiliza esos índices para acceder directamente a la posición correspondiente del arreglo.

Por ejemplo:

```text
buscarVenta(1, 2)
```

busca la venta correspondiente a:

**Febrero → Juguetería**

---

# Método para eliminar una venta

### Java

```java
public static void eliminarVenta(int mes, int departamento) {
    ventas[mes][departamento] = 0;
}
```

### Python

```python
def eliminar_venta(mes, departamento):
    ventas[mes][departamento] = 0
```

Este método permite eliminar una venta específica.

Como los arreglos tienen un tamaño fijo, no se elimina físicamente una posición del arreglo. En su lugar, el valor de la posición seleccionada se cambia a `0`, representando que no existe una venta registrada en esa posición.

Por ejemplo:

```text
eliminarVenta(1, 0)
```

cambia la venta de **Febrero → Ropa** a `0`.

---

# Método para mostrar las ventas

Además de los tres métodos solicitados, ambos programas cuentan con una función o método para mostrar el contenido completo del arreglo.

### Java

```java
public static void mostrarVentas() {
    for (int i = 0; i < 12; i++) {
        System.out.println(
            meses[i] + " " +
            ventas[i][0] + " " +
            ventas[i][1] + " " +
            ventas[i][2]
        );
    }
}
```

### Python

```python
def mostrar_ventas():
    for i in range(12):
        print(
            meses[i],
            ventas[i][0],
            ventas[i][1],
            ventas[i][2]
        )
```

Este método recorre las 12 filas del arreglo y muestra las tres ventas correspondientes a cada mes.
