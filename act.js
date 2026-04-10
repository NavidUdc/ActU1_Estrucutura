class estudiante{
    constructor(nombre, edad, promedio){
        this.nombre = nombre
        this.edad =edad
        this.promedio = promedio
    }

}

console.log("================= INICIALIZACION =======================")
let est = new estudiante("navid", 19, 4.0)
let est1 = new estudiante("naser", 18, 3.7)
let est2 = new estudiante("naren", 24, 4.3)

console.log(est)
console.log(est1)
console.log(est2)


let arreglo= [
    est,
    est1,
    est2
]
function recorrer(arreglo){
    for(let e of arreglo){
        console.log(e.nombre, e.edad, e.promedio)
    }

}




function modificar (arreglo, nombre, promedio){
    for (let e of arreglo) {
        if (e.nombre == nombre) {
            e.promedio = promedio
            console.log("Actualizacion:", e.nombre, e.edad, e.promedio)
            return
        }
    }
    console.log("Estudiante no encontrado")
}
console.log("==================== RECORRIDO =========================")
recorrer(arreglo)
console.log("================== MODIFICACION ===================")
modificar(arreglo, est.nombre, 4.8)