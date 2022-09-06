
package aravenarivero_ceronvillouta;

public class Propiedad implements Factorizable{
    private int numIdentificador, cantDormitorios,
            cantBanios;
    private double cantidadUf;

    public Propiedad(int numIdentificador, int cantDormitorios, int cantBanios, double cantidadUf) {
        this.numIdentificador = numIdentificador;
        this.cantDormitorios = cantDormitorios;
        this.cantBanios = cantBanios;
        this.cantidadUf = cantidadUf;
    }

    public int getNumIdentificador() {
        return numIdentificador;
    }

    public void setNumIdentificador(int numIdentificador) {
        this.numIdentificador = numIdentificador;
    }

    public int getCantDormitorios() {
        return cantDormitorios;
    }

    public void setCantDormitorios(int cantDormitorios) {
        this.cantDormitorios = cantDormitorios;
    }

    public int getCantBanios() {
        return cantBanios;
    }

    public void setCantBanios(int cantBanios) {
        this.cantBanios = cantBanios;
    }

    public double getCantidadUf() {
        return cantidadUf;
    }

    public void setCantidadUf(double cantidadUf) {
        this.cantidadUf = cantidadUf;
    }
    
    public String mostrarInfo(){
        return "\nNúmero Identificador: "+numIdentificador+"\nCantidad de Dormitorios: "+cantDormitorios+"\n"
                + "Cantidad de Baños: "+cantBanios+"\nCantidad UF: "+cantidadUf;
    }
    
    public int obtenerIva(){
        return (int)(cantidadUf*UF*IVA);
    }
    
    public int obtenerInteres(){
        return 0;
    }
    
    public int obtenerTotal(){
        return 0;
    }
    
    
}
