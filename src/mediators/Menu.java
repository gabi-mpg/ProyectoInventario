package mediators;

import static Utilidades.Herramientas.introducirString;
import static Utilidades.Herramientas.pedirN;

public class Menu {

    public static boolean preguntarOffOnline(){
        System.out.println("¿Quiere trabajar online?");
        String respu = introducirString("Di si o no: ");
        return respu.equalsIgnoreCase("si");
    }

    public static int mostrarMenu(){
        int n;

        do{
            System.out.println("Menu de Inventario");
            System.out.println("1. Gestion Aula\n2.Gestion Productos\n3.Gestion Marcajes\n4. Informes\n5. Datos\n0. Salir");
            n = pedirN("Elige una opcion: ");
        }while(n != 0);

        System.out.println("Cerrando el programa");
    }

}
