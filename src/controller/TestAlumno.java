package controller;
import model.Alumno; // Se usara la clase Alumno del paquete model
/**
 *
 * @author Diego
 */
public class TestAlumno {
    public static void main(String[] args) {
        /*
            Uso o llamada a la clase Alumno
        */
        Alumno a1; // Declaracion del objeto a1
                   //Alumno es la clase o tipo de dato
                   // a1 es el objeto o instancia de la clase Alumno
        a1 = new Alumno();  // Inicializacion del objeto(Listo a usarse)
        
        // Llenado de datos 
        a1.nombres = "Ana Maria"; // Se pone la caracteristica "Ana Maria" al atributo nombres
        a1.telefono = "98456132";
        // a1.DNI = "3123451"; // No se puede usar porque es privado
        a1.setDNI("3123451"); // Poner la caracteristica
        a1.setAño_nacim(2000);
        
        // Uso y muestra los datos
        System.out.println("Nombres        : " + a1.nombres);
        System.out.println("Telefono       : " + a1.telefono);
        System.out.println("DNI            : " + a1.getDNI());
        System.out.println("Anio nacimiento: " + a1.getAño_nacim());
        System.out.println("Edad actual    : " + a1.getEdad());
    } // Se libera memoria (se destruye todas las variables creadas en main)
}
