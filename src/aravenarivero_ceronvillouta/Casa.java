
package aravenarivero_ceronvillouta;

public class Casa extends Propiedad{
    private boolean estacionamiento;

    public Casa(boolean estacionamiento, int numIdentificador, int cantDormitorios, int cantBanios, double cantidadUf) {
        super(numIdentificador, cantDormitorios, cantBanios, cantidadUf);
        this.estacionamiento = estacionamiento;
    }

    public boolean isEstacionamiento() {
        return estacionamiento;
    }

    public void setEstacionamiento(boolean estacionamiento) {
        this.estacionamiento = estacionamiento;
    }
    
    public String mostrarInfo(){
        return super.mostrarInfo()+"\nEstacionamiento: "+estacionamiento;
    }
    
    public int obtenerInteres(){
        if(estacionamiento)
            return (int)(getCantidadUf()*UF*INTERES_CASA);
        else
            return 0;
    }
    
    public int obtenerTotal(){
        return (int) (getCantidadUf()*UF+obtenerIva()+obtenerInteres());
    }
    
}
