package main

import "fmt"

type estudiante struct {
	nombre   string
	edad     int
	promedio float64
}

func main() {
	var est = estudiante{nombre: "navid", edad: 5, promedio: 3.8}
	var est1 = estudiante{"naser", 18, 4.0}
	var est2 = estudiante{"naren", 25, 2.9}

	fmt.Println(est.nombre, est.edad, est.promedio)
	fmt.Println(est1.nombre, est1.edad, est1.promedio)
	fmt.Println(est2.nombre, est2.edad, est2.promedio)
}
