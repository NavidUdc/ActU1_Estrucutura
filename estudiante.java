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


    public static void main (String []args ){
          
        // 2. Inicializacion
        ArrayList<estudiante> arreglo = new ArrayList<>();
        arreglo.add(new estudiante("Navid", 4.1, 20));
        arreglo.add(new estudiante("Naser", 5.0, 18));
        arreglo.add(new estudiante("Naren", 2.5, 23));

    
    }

}
