package Consola;

import Servicios.Controlador;

import static Consola.Cli.controlador;

public class Vista {

    public static void showBienvenida(){
        System.out.println("Te doy la bienvenida a Anima Battle Calculator.");
    }

    public static void showError(){
        System.out.println("Algo no ha salido como se esperaba");
    }

    public static void showHelp(){
        System.out.println("Estos son los posibles comandos: ");
        System.out.println("- 'anadir X'");
        System.out.println("- 'ver X'");
        System.out.println("- 'editar X'");
        System.out.println("- 'help': muestra esta tabla");
        System.out.println("- 'salir'");
        System.out.println("(X puede ser sustituido por 'pj', 'eq' y 'com')");
    }

    public static void mostrarPersonajes(){
        System.out.println(controlador.pullPersonajes.toString());
    }

    public static void mostrarEquipos(){
        System.out.println(controlador.pullEquipos.toString());
    }

    public static void mostrarCombates(){
        //System.out.println();
    }

    public static void setMessage(String message){
        System.out.println(message);
    }

    public static void setPedir(String pedir){
        System.out.println("Escribe " + pedir + " pedido/a: ");
    }


}
