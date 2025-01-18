package controller;
import model.Prestamo;

/**
 *
 * @author Diego
 */
public class TestPrestamo {
    public static void main(String[] args) {
         Prestamo p1 = new Prestamo (542, "El principito", "01/01/2025", "12/01/2025");
         p1.mostrarinfo();
    }
}
