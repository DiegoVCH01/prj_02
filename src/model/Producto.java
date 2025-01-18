package model;

/**
 *
 * @author Diego
 */
public class Producto {

    private int cod_prod;
    private String nombre;
    private String comp_generico;
    private int año_vencim;
    private String laborario;
    private String quim_farma;

    // Definicion del constructor
    public Producto(int cod_prod, String nombre) {
        this.cod_prod = cod_prod;
        this.nombre = nombre;
        // Es recomendable inicializar el resto de atributos
        comp_generico = "";
        año_vencim = -1; // PARA INDICAR QUE NO SE HA REGISTRADO
        laborario = "";
        quim_farma = "";
    }
    
    
    //recarga de contructor
    // Constructor vacio
    public Producto() {
        cod_prod = -1;
        nombre = "SIN DATO";
        comp_generico = "";
        año_vencim = -1;
        laborario = "SIN LABORATORIO";
        quim_farma = "SIN QF";
    }

    // setters (Para modificar datos)
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setComp_generico(String comp_generico) {
        this.comp_generico = comp_generico;
    }

    public void setAño_vencim(int año_vencim) {
        this.año_vencim = año_vencim;
    }

    public void setLaborario(String laborario) {
        this.laborario = laborario;
    }

    public void setQuim_farma(String quim_farma) {
        this.quim_farma = quim_farma;
    }

    // getter (para lectura de datos)
    public int getCod_prod() {
        return cod_prod;
    }

    public String getNombre() {
        return nombre;
    }

    public String getComp_generico() {
        return comp_generico;
    }

    public int getAño_vencim() {
        return año_vencim;
    }

    public String getLaborario() {
        return laborario;
    }

    public String getQuim_farma() {
        return quim_farma;
    }
    
    // Mostrar datos
    public void mostrar() {
        System.out.println("Codigo producto     : " + this.getCod_prod());
        System.out.println("Nombre              : " + this.getNombre());
        if(this.getAño_vencim() == -1){
            System.out.println("Anio de vencimiento No registrado!!!");
        } else {
            System.out.println("Anio Vencimiento  : " + this.getAño_vencim());
        }
        System.out.println("Componente generico : " + this.getComp_generico());
        System.out.println("Laboratorio         : " + this.getLaborario());
        System.out.println("Quimico Farmaceutico: " + this.getQuim_farma());
    }

}
