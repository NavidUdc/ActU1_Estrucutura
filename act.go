package main

import "fmt"

type estudiante struct {
	nombre   string
	edad     int
	promedio float64
}

func modificar(arreglo []estudiante, nombre string, promedio float64) []estudiante {
	for i := 0; i < len(arreglo); i++ {
		if arreglo[i].nombre == nombre {
			arreglo[i].promedio = promedio
			fmt.Println("Estudiante modificado:", arreglo[i].nombre, " Nuevo promedio:", arreglo[i].promedio)
			return arreglo
		}
	}
	fmt.Println("Estudiante no encontrado:", nombre)
	return arreglo
}

func main() {

	fmt.Println("========== INICIALIZACION ==========")
	var est = estudiante{nombre: "navid", edad: 5, promedio: 3.8}
	var est1 = estudiante{"naser", 18, 4.0}
	var est2 = estudiante{"naren", 25, 2.9}

	fmt.Println(est.nombre, est.edad, est.promedio)
	fmt.Println(est1.nombre, est1.edad, est1.promedio)
	fmt.Println(est2.nombre, est2.edad, est2.promedio)

	fmt.Println("=========== RECORRIDO ===========")
	var arreglo = []estudiante{
		est, est1, est2,
	}

	for i := 0; i < len(arreglo); i++ {
		fmt.Println(arreglo[i].nombre, arreglo[i].edad, arreglo[i].promedio)
	}

	fmt.Println("=========== MODIFICACION ===========")
	modificar(arreglo, est.nombre, 1.56)

}
