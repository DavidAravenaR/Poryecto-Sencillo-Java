
package aravenarivero_ceronvillouta;

public class AravenaRivero_CeronVillouta {

    public static void main(String[] args) {
        
        /*
        IMPORTANTE: Para el desarrollo de este encargo hemos hecho
         las siguientes consideraciones.
            - CantidadUF es el valor diario de una propiedad en UF.
            - Los métodos que devuelven valores, lo hacen en pesos.
        */
        
        Manejadora mane=new Manejadora();
        int numIdentificador, cantDormitorios, cantBanios, cd, cantPisos, num, op;
        double cantidadUf;
        boolean estacionamiento;
        Casa casa;
        Departamento dpto;
        
        do {
            System.out.println("\nSistema Propiedades \n"
                    + "1.	Crear Propiedad \n"
                    + "2.	Mostrar Monto a Pagar e Información \n"
                    + "3.	Mostrar Cantidad de Casas sin Estacionamiento \n"
                    + "4.	Mostrar Número de Propiedades Eliminadas \n"
                    + "5.	Finalizar Ejecución");
            System.out.print("\tIngresar Opción: ");
            op = Leer.datoInt();

            switch (op){
                case 1:
                    System.out.println("\n--- Crear Propiedad---");
                    System.out.print("Número Identificador: ");
                    numIdentificador = Leer.datoInt();
                    
                    //Se asegura de que la cantidad de dormitorios sea sólo 1, 2 o 3
                    do {
                        System.out.print("Cantidad de Dormitorios [1], [2] o [3]: ");
                        cantDormitorios = Leer.datoInt();
                    } while (cantDormitorios!=1 && cantDormitorios!=2 && cantDormitorios!=3);
                    
                    //Se asegura de que la cantidad de baños sea sólo 1 o 2
                    do {
                        System.out.print("Cantidad de Baños [1] o [2]: ");
                        cantBanios = Leer.datoInt();
                    } while (cantBanios!=1 && cantBanios!=2);
                    
                    System.out.print("Cantidad UF por día: ");
                    cantidadUf = Leer.datoDouble();
                    
                    //Se asegura de que el valor ingresado sea 1 o 2
                    do {
                        System.out.print("Ingrese [1] para Casa, [2] para Departamento: ");
                        cd = Leer.datoInt();
                        switch (cd){
                            case 1:
                                System.out.print("Estacionamiento [true] o [false]: ");
                                estacionamiento = Leer.datoBoolean();
                                casa = new Casa(estacionamiento, numIdentificador, cantDormitorios, cantBanios, cantidadUf);
                                System.out.println(mane.ingresarPropiedad(casa));
                                break;
                            case 2:
                                //Nos aseguramos de que la cantidad de pisos sea 1 o 2
                                do {
                                    System.out.print("Cantidad de Pisos [1] o [2]: ");
                                    cantPisos = Leer.datoInt();
                                } while (cantPisos!=1 && cantPisos!=2);

                                dpto = new Departamento(cantPisos, numIdentificador, cantDormitorios, cantBanios, cantidadUf);
                                System.out.println(mane.ingresarPropiedad(dpto));
                                break;
                            default:
                                System.out.println("Ingrese una opción Válida...");
                        }
                    } while (cd!=1 && cd!=2);
                    break;

                case 2:
                    System.out.print("Ingresar número de propiedad a mostrar: ");
                    num = Leer.datoInt();
                    System.out.println(mane.mostrar(num));
                    break;

                case 3:
                    System.out.println("La cantidad de casas sin estacionamiento es: " + mane.contar());
                    break;

                case 4:
                    System.out.println(mane.eliminar());
                    break;

                default:
                    System.out.println("Ingrese una opción Válida...");
            }
        } while (op != 5);
    }
}
