
package aravenarivero_ceronvillouta;

public class Departamento extends Propiedad{
    private int cantPisos;

    public Departamento(int cantPisos, int numIdentificador, int cantDormitorios, int cantBanios, double cantidadUf) {
        super(numIdentificador, cantDormitorios, cantBanios, cantidadUf);
        this.cantPisos = cantPisos;
    }

    public int getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(int cantPisos) {
        this.cantPisos = cantPisos;
    }
    
    public String mostrarInfo(){
        return super.mostrarInfo()+"\nCantidad de Pisos: "+cantPisos;
    }
    
    public int obtenerInteres(){
        if(cantPisos==2)
            return (int)(getCantidadUf()*UF*INTERES_DEPTO);
        else
            return 0;
    }
    
    public int obtenerTotal(){
        return (int)(getCantidadUf()*UF+obtenerIva()+obtenerInteres());
    }
}
