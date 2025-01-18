package model;

/**
 *
 * @author Diego
 */
/**
 * Definicion de la clase Alumno con la creacion de
 * Atributos
 */
public class Alumno {
    // Definicion de atributos
    private String DNI;
    private int cod_alum;
    private int nro_lista;
    public String nombres;
    private String email;
    public String telefono;
    private String ubigeo;
    private String apoderado;
    private boolean estado_activo;
    private String fec_nacim;
    private String nacionalidad;
    private String direccion;
    private int año_nacim;
    
    // metodos para los accesos
    // para guardar "setters"
    public void setDNI(String dni){
        DNI = dni;
    }
    
    public void setAño_nacim(int año_nacim){
        // this es una referencia a la misma clase (Alumno)
        this.año_nacim = año_nacim;
    }
    
    // para leer datos "getters"
    public String getDNI(){
        return DNI;
    }
    
    public int getAño_nacim() {
        return this.año_nacim;   // o simplemente año_nacim
    }
    
    // Metodos del negocio
    // Obtencion de la edad
    public int getEdad(){
        int año_actual = 2025; // variable que se crea dentro del metodo
        return año_actual - this.año_nacim;
    } // la var anio actual se elimina
}
