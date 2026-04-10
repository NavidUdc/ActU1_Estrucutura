class Estudiante:
    def __init__ (self, nombre, edad , promedio):
        self.edad = edad
        self.nombre = nombre
        self.promedio = promedio
    
    def mostrarInfo(self):
        print(f"Nombre: {self.nombre} , Edad: {self.edad} , Promedio: {self.promedio}")

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
