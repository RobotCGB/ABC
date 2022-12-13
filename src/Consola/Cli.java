package Consola;

import Servicios.Controlador;

import java.util.Scanner;

public class Cli {

    Vista vista = new Vista();
    Controlador controlador = new Controlador();

    public Cli(){

    }

    public void run(){

        String comando;
        Scanner sc = new Scanner(System.in);

        vista.showBienvenida();
        do{
            vista.pedirComando();
            comando = sc.next();
            switch (comando){

                case "anadir" -> anadirAlgo(sc.next());

                case "ver" -> verAlgo(sc.next());

                case "editar" -> editarAlgo(sc.next());

                case "help" -> vista.showHelp();

                case "salir" -> vista.showDespedida();

                default -> vista.showError();
            }

        } while(!comando.equals("salir"));

    }

    public void anadirAlgo(String comando){

        switch (comando){

            case "pj" -> controlador.anadirPj();

            case "eq" -> controlador.anadirEq();

            case "com" -> controlador.anadirCom();

            default -> vista.showError();

        }

    }

    public void verAlgo(String comando){

        switch (comando){

            case "pj" -> vista.showPjs();

            case "eq" -> vista.showEqs();

            case "com" -> vista.showComs();

            default -> vista.showError();

        }

    }

    public void editarAlgo(String comando){

        switch (comando){

            case "pj" -> controlador.editarPj();

            case "eq" -> controlador.editarEq();

            case "com" -> controlador.editarCom();

            default -> vista.showError();

        }

    }

}
