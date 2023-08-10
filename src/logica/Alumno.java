


package logica;

//Objeto alumno
class Alumno {
    
    
    //Atributos o caracteristicas del alumno
    int id;
    String nombre = "marta";
    String apellido;
    
    
    /*===============================
    =========METODOS DE ALUMNO=======
    =================================
    */
    
    //Metodo mostrar nombre
    public void mostrarNombre(){
        System.out.println("Hola, soy un alumno y se decir mi nombre!");
        System.out.println("Mira! "+ nombre);
    }
    
    
    //Metodo saber si esta aprobado
    public void resultadoExamen(double calificacion){
        if (calificacion >= 6){
            System.out.println("SIII APROBEE!");
        }
        else{
            System.out.println("Uyy no aprobe");
        }
    }
    
}
