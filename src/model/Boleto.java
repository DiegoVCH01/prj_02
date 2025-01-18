package model;

/**
 *
 * @author Diego
 */
public class Boleto {
    private int nro_boleto;
    private String lug_venta;
    private String destino;
    static private int correlativo = 0; // crea un solo espacio de memoria

    public Boleto(String lug_venta, String destino) {
        this.correlativo++;
        this.nro_boleto = this.correlativo;
        this.lug_venta = lug_venta;
        this.destino = destino;
    }
    
    public void imprimirBoleto() {
        System.out.println("Numero Boleto      : " + this.nro_boleto);
        System.out.println("Lugar de Venta     : " + this.lug_venta);
        System.out.println("Lugar de  destino  : " + this.destino);
    }
    
}
