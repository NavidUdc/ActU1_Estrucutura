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

console.log("==================== RECORRIDO =========================")
let arreglo= [
    new estudiante("naser", 18, 3.5),
    new estudiante("naren ", 24, 3.9),
    new estudiante("navid", 19, 2.5)
]

for(let e of arreglo){
    console.log(e.nombre, e.edad, e.promedio)
}