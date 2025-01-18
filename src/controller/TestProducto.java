package controller;
import model.Producto;
/**
 *
 * @author Diego
 */
public class TestProducto {
    public static void main(String[] args) {
        Producto p1; // declaracion
        p1 = new Producto(789, "Aspirina"); // Inicializacion del objeto
        // Comprobar los datos creados
        System.out.println("Codigo producto     : " + p1.getCod_prod());
        System.out.println("Nombre              : " + p1.getNombre());
        // Llenar el resto de atributos
        p1.setAño_vencim(2028);
        p1.setComp_generico("Acido Salicilico");
        p1.setLaborario("Bayer");
        p1.setQuim_farma("ABEL ABAD");
        // Mostrar el resto de datos
        
        if(p1.getAño_vencim() == -1){
            System.out.println("Anio de vencimiento No registrado!!!");
        } else {
            System.out.println("Anio Vencimiento    : " + p1.getAño_vencim());
        }
        System.out.println("Componente generico : " + p1.getComp_generico());
        System.out.println("Laboratorio         : " + p1.getLaborario());
        System.out.println("Quimico Farmaceutico: " + p1.getQuim_farma());
        
        Producto p2 = new Producto(); // Declaracion e inicializacion del 
        System.out.println("Codigo producto     : " + p2.getCod_prod());
        System.out.println("Nombre              : " + p2.getNombre());
        if(p2.getAño_vencim() == -1){
            System.out.println("Anio de vencimiento No registrado!!!");
        } else {
            System.out.println("Anio Vencimiento  : " + p2.getAño_vencim());
        }
        System.out.println("Componente generico : " + p2.getComp_generico());
        System.out.println("Laboratorio         : " + p2.getLaborario());
        System.out.println("Quimico Farmaceutico: " + p2.getQuim_farma());
        
        Producto p3 = new Producto(999, "Ibuprofeno");
        p3.mostrar();
    }
}
