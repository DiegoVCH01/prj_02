package controller;
import model.Boleto;
import model.MensajesAlerta;


/**
 *
 * @author Diego
 */
public class TestBoleto {
    public static void main(String[] args) {
        Boleto b1 = new Boleto("Lima", "Trujillo");
        b1.imprimirBoleto();
        
        Boleto b2 = new Boleto("Trujillo", "Cajamarca");
        b2.imprimirBoleto();
        
        Boleto b3 = new Boleto("Arequipa", "Tacna");
        b3.imprimirBoleto();
        
        Boleto b4 = new Boleto("Lima", "Ica");
        b4.imprimirBoleto();
        
        //MensajesAlerta m1 = new MensajesAlerta();
        //m1.saludos();
        MensajesAlerta.saludos(); // No se necesita la declaracion de la variable
        MensajesAlerta.atencion();
        // El metodo sin() de la clase Math es static
        System.out.println("El seno de pi/6 es " + Math.sin(3.141592654/6));
        
    
    }
}
