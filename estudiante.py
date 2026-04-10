class Estudiante:
    def __init__ (self, nombre, edad , promedio):
        self.edad = edad
        self.nombre = nombre
        self.promedio = promedio
    
    def mostrarInfo(self):
        print(f"Nombre: {self.nombre} , Edad: {self.edad} , Promedio: {self.promedio}")
