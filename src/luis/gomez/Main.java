package luis.gomez;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        // Aqui en el main creo 4 objetos de casas

        Casas casa1 = new Casas("Avenida San Sebastian", 23700, 4, 120);
        Casas casa2 = new Casas("Calle Sagunto", 32586, 3, 90.8);
        Casas casa3 = new Casas("Calle Zambrana", 57418, 2, 80.0);
        Casas casa4 = new Casas("Calle Julio Burell", 62458, 3, 100);

        // Ahora creo un ArrayList que incluya todas las casas

        ArrayList<Casas> listadoDeCasas = new ArrayList<Casas>(); // Entre los <> pongo Casas ya que quiero usar sus atributos

        // Ahora añado al arrayList que he creado los objetos, en este caso las casas que he creado
        listadoDeCasas.add(casa1);
        listadoDeCasas.add(casa2);
        listadoDeCasas.add(casa3);
        listadoDeCasas.add(casa4);

        System.out.println();

        // Ahora con for y size recorro el ArrayList y me va a decir con getDireccion, el valor de la direccion de cada casa que contiene el arraList listadodecasas
        System.out.println("Direcciones" +"\n");
        for (int i = 0; i < listadoDeCasas.size(); i++) { // Recorre desde la posicion 0 hasta la ultima posicion del arraylist, por eso pongo size.
            System.out.println(listadoDeCasas.get(i).getDireccion()); // con get obtenemos el valor de las direcciones de cada casa que haya en el arralist listadodecassas y las imprime
        }
        System.out.println();

        //Aqui me dice el valor del Codigo postal de cada casa
        System.out.println("Codigos postales"+"\n");
        for (int i = 0; i < listadoDeCasas.size(); i++) {
            System.out.println(listadoDeCasas.get(i).getCp());
        }
        System.out.println();

        //Aqui me dice el valor del numero de habitaciones de cada casa
        System.out.println("Numero Habitaciones"+"\n");
        for (int i = 0; i < listadoDeCasas.size(); i++) {
            System.out.println(listadoDeCasas.get(i).getNumHabitaciones());
        }
        System.out.println();

        //Aqui me dice el valor de los metros cuadrados de cada casa
        System.out.println("Metros cuadrados"+"\n");
        for (int i = 0; i < listadoDeCasas.size(); i++) {
            System.out.println(listadoDeCasas.get(i).getMetros());
        }
        System.out.println();

        System.out.println("AHORA LO MISMO PERO CON foreach"+"\n");

        // Ahora con foreach
        System.out.println("Direcciones"+"\n");
         for (Casas a : listadoDeCasas) {
                System.out.println(a.getDireccion()); // obtengo las direcciones de todas las Casas del ArrayList listadodecasas
         }
        System.out.println();

        System.out.println("Codigos postales"+"\n");
        for (Casas a : listadoDeCasas) {
                System.out.println(a.getCp());
         }
        System.out.println();

        System.out.println("Numero habitaciones"+"\n");
        for (Casas a : listadoDeCasas) {
            System.out.println(a.getNumHabitaciones());
        }
        System.out.println();

        System.out.println("Metros cuadrados"+"\n");
        for (Casas a : listadoDeCasas) {
            System.out.println(a.getMetros());
        }

    }
}


