ventas = [[0 for j in range(3)] for i in range(12)]

meses = [
    "Enero", "Febrero", "Marzo", "Abril",
    "Mayo", "Junio", "Julio", "Agosto",
    "Septiembre", "Octubre", "Noviembre", "Diciembre"
]

departamentos = [
    "Ropa", "Deportes", "Jugueteria"
]

def insertar_venta(mes, departamento, cantidad):
    ventas[mes][departamento] = cantidad


def buscar_venta(mes, departamento):
    print("\nVenta encontrada:")
    print("Mes:", meses[mes])
    print("Departamento:", departamentos[departamento])
    print("Venta: $", ventas[mes][departamento])


def eliminar_venta(mes, departamento):
    ventas[mes][departamento] = 0
    print("\nLa venta fue eliminada correctamente.")


def mostrar_ventas():

    print("\n========== VENTAS MENSUALES ==========")

    print(f"{'Mes':<15}{'Ropa':<15}{'Deportes':<15}{'Jugueteria':<15}")

    for i in range(12):

        print(f"{meses[i]:<15}"
              f"{ventas[i][0]:<15}"
              f"{ventas[i][1]:<15}"
              f"{ventas[i][2]:<15}")

print("===== INGRESO DE VENTAS =====")

for i in range(12):

    print("\n---", meses[i], "---")

    for j in range(3):

        cantidad = int(input(
            "Ingrese las ventas de "
            + departamentos[j] + ": $"
        ))

        insertar_venta(i, j, cantidad)

mostrar_ventas()


print("\n===== BUSCAR UNA VENTA =====")

mes_buscar = int(input("Ingrese el número del mes (1-12): ")) - 1

print("Seleccione el departamento:")
print("0 - Ropa")
print("1 - Deportes")
print("2 - Jugueteria")

departamento_buscar = int(input("Ingrese el número del departamento: "))

buscar_venta(mes_buscar, departamento_buscar)


print("\n===== ELIMINAR UNA VENTA =====")

mes_eliminar = int(input("Ingrese el número del mes (1-12): ")) - 1

print("Seleccione el departamento:")
print("0 - Ropa")
print("1 - Deportes")
print("2 - Jugueteria")

departamento_eliminar = int(input("Ingrese el número del departamento: "))

eliminar_venta(mes_eliminar, departamento_eliminar)

mostrar_ventas()