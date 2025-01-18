package model;

/**
 *
 * @author Diego
 */
public class Prestamo {
    private int nro_lib;
    private String titulo;
    private String fecha_pres;
    private String fecha_devolucion;


    public Prestamo(int nro_lib, String titulo, String fecha_pres, String fecha_devolucion) {
        this.nro_lib = nro_lib;
        this.titulo = titulo;
        this.fecha_pres = fecha_pres;
        this.fecha_devolucion = fecha_devolucion;

    }
    //setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setFecha_pres(String fecha_pres) {
        this.fecha_pres = fecha_pres;
    }

    public void setFecha_devolucion(String fecha_devolucion) {
        this.fecha_devolucion = fecha_devolucion;
    }

    // getter

    public int getNro_lib() {
        return nro_lib;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getFecha_pres() {
        return fecha_pres;
    }

    public String getFecha_devolucion() {
        return fecha_devolucion;
    }


    
    public void mostrarinfo(){
        System.out.println("Codigo Libro        : " + this.getNro_lib());
        System.out.println("Titulo              : " + this.getTitulo());
        System.out.println("Fecha de prestamo   : " + this.getFecha_pres());
        System.out.println("Fecha de devolucion : " + this.getFecha_devolucion());
    }
}
