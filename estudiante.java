import java.util.ArrayList;

public class estudiante {
    
    private String nombre;
    private double promedio;
    private int edad;

    public estudiante(String nombre, double promedio, int edad){
        this.edad=edad;
        this.nombre= nombre; 
        this.promedio=promedio;

    }



    public void mostrarInfor(){
        System.out.println("Nombre: " + getNombre() + "Edad: "  + getEdad() + "Promedio: " + getPromedio());
    }


    public String getNombre(){
        return nombre;
    }

    public int getEdad(){
        return edad;
    }
    

    public double getPromedio(){
        return promedio;
    }

    public void setPromedio (double promedio){
        this.promedio = promedio;
    }

    public static void modificar(ArrayList<estudiante> arreglo, String nombre, double proemdio){
        for (estudiante e : arreglo) {
            if (e.getNombre().equals(nombre)) {
                e.setPromedio(proemdio);
                System.out.println("Actualizado: " + e.getNombre() + " | Nuevo promedio: " + e.getPromedio());
                return;
            }
        }
        System.out.println("Estudiante no encontrado: " + nombre);
    }


    public static void main (String []args ){
          
        // 2. Inicializacion
        ArrayList<estudiante> arreglo = new ArrayList<>();
        arreglo.add(new estudiante("Navid", 4.1, 20));
        arreglo.add(new estudiante("Naser", 5.0, 18));
        arreglo.add(new estudiante("Naren", 2.5, 23));

        // 3. Recorrido
        System.out.println("========== RECORRIDO ==========");
        for (estudiante e : arreglo) {
            e.mostrarInfor();
        }

         // 4. Modificacion
        System.out.println("========== MODIFICACION ==========");
        modificar(arreglo, "Naser", 3.5);
    
    }

}
