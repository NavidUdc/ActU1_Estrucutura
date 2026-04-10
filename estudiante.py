class Estudiante:
    def __init__ (self, nombre, edad , promedio):
        self.edad = edad
        self.nombre = nombre
        self.promedio = promedio
    
    def mostrarInfo(self):
        print(f"Nombre: {self.nombre} , Edad: {self.edad} , Promedio: {self.promedio}")

    def setPromedio(self, nuevoPromedio):
        self.promedio = nuevoPromedio


def modificar(arreglo, nombre, nuevoPromedio):
    for e in arreglo:
        if e.nombre == nombre:
            e.setPromedio(nuevoPromedio)
            print(f"Actualizado: {e.nombre} | Nuevo promedio: {e.promedio}")
            return
    print(f"Estudiante no encontrado: {nombre}")


#2. Inicializacion

arreglo =[
    Estudiante("Navid", 20, 3.8),
    Estudiante("Naser", 18, 4.0),
    Estudiante("Naren", 25, 2.9)
]

# 3. Recorrido
print("========== RECORRIDO ==========")
for e in arreglo:
    e.mostrarInfo()

# 4. Modificacion
print("========== MODIFICACION ==========")
modificar(arreglo, "Naser", 3.5)
