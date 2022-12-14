package Consola;

import Modelos.Combate;
import Modelos.Equipo;
import Modelos.Personaje;
import Servicios.Controlador;

import java.util.ArrayList;
import java.util.Scanner;

public class Cli {

    public static Controlador controlador = new Controlador();
    private final Scanner sc = new Scanner(System.in);

    public Cli(){

    }

    public void run(){

        String comando;

        Vista.showBienvenida();
        do{
            Vista.setMessage("Escribe que quieres hacer: ");
            comando = sc.next();
            switch (comando){

                case "anadir" -> anadirAlgo(sc.next());

                case "ver" -> verAlgo(sc.next());

                case "editar" -> editarAlgo(sc.next());

                case "help" -> Vista.showHelp();

                case "salir" -> Vista.setMessage("Adios");

                default -> Vista.showError();
            }

        } while(!comando.equals("salir"));

    }

    public void anadirAlgo(String comando){

        switch (comando){

            case "pj" -> controlador.anadirPj(sc);

            case "eq" -> controlador.anadirEq(sc);

            case "com" -> controlador.anadirCom(sc);

            default -> Vista.showError();

        }

    }

    public void verAlgo(String comando){

        switch (comando){

            case "pj" -> Vista.mostrarPersonajes();

            case "eq" -> Vista.mostrarEquipos();

            //case "com" -> Vista.mostrarCombates();

            default -> Vista.showError();

        }

    }

    public void editarAlgo(String comando){

        switch (comando){

            case "pj" -> controlador.editarPj(sc);

            case "eq" -> controlador.editarEq();

            case "com" -> controlador.editarCom();

            default -> Vista.showError();

        }

    }

}
