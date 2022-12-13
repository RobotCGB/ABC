package Servicios;

import Consola.Vista;

import java.util.Scanner;

public class Utilidades {

    public static int pedirInt(Scanner teclado, String pedir){
        Vista.setPedir(pedir);
        int ret = teclado.nextInt();
        return ret;
    }

    public static String pedirString(Scanner teclado, String pedir){
        Vista.setPedir(pedir);
        String ret = teclado.next();
        return ret;
    }


}
