
package aravenarivero_ceronvillouta;
import java.util.ArrayList;

public class Manejadora {
    private ArrayList <Propiedad> propiedades = new ArrayList<Propiedad>();

    public Manejadora() {
    }

    public ArrayList<Propiedad> getPropiedades() {
        return propiedades;
    }

    public void setPropiedades(ArrayList<Propiedad> propiedades) {
        this.propiedades = propiedades;
    }
    
    public int buscar(int cod){
        for (int i = 0; i < propiedades.size(); i++) {
            if(propiedades.get(i).getNumIdentificador()==cod)
                return i;
        }
        return -1;
    }
    
    public String ingresarPropiedad(Propiedad pro){
        int pos=buscar(pro.getNumIdentificador());
        if(pos==-1){
            propiedades.add(pro);
            return "\n\tPropiedad ingresada con Éxito...";
        }
        else{
            return "\n\tLa Propiedad ya existe...";
        }
    }
    
    public String mostrar(int cod){
        int pos=buscar(cod);
        if (pos==-1) {
            return "\n\tLa propiedad no existe...";
        }else{
            return propiedades.get(pos).mostrarInfo()+
                    "\nMonto a pagar: "+propiedades.get(pos).obtenerTotal()+
                    "\nMonto del Iva: "+propiedades.get(pos).obtenerIva()+
                    "\nMonto Interés: "+propiedades.get(pos).obtenerInteres();
        }
    }
        
    public int contar(){
        int cant=0;
        for (int i = 0; i < propiedades.size(); i++) {
            if(propiedades.get(i) instanceof Casa &&
                    !(((Casa)propiedades.get(i)).isEstacionamiento()))
                cant++;      
        }
        return cant;
    }
    
    public String eliminar(){
        int cant=0;
        for (int i = 0; i < propiedades.size(); i++) {
            if(propiedades.get(i) instanceof Departamento &&
                    ((Departamento)propiedades.get(i)).getCantPisos()==1){
                propiedades.remove(i);
                i--;
                cant++;
            }
        }
        return "\n\tSe han eliminado "+cant+" propiedades de un piso";
    }
      
}
