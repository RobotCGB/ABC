package Servicios;

import Consola.Vista;
import Modelos.*;
import jdk.jshell.execution.Util;

import java.util.Scanner;

public class Controlador {

    public ListaPersonajes pullPersonajes = new ListaPersonajes();
    private static final int CANT_TA = 7;
    public ListaEquipos pullEquipos = new ListaEquipos();

    public void anadirPj(Scanner teclado) {
        //TODO: set opcion cancelar en cualquier momento
        boolean ok = false;
        String nombre = null;

        while (!ok) {
            nombre = Utilidades.pedirString(teclado, "nombre");
            if (pullPersonajes.existsPjPorNombre(nombre))
                Vista.setMessage("Ya existe un pj con ese nombre, prueba otro");
            else
                ok = true;
        }

        int salud = Utilidades.pedirInt(teclado, "salud");

        int HA = Utilidades.pedirInt(teclado, "HA");

        int HD = Utilidades.pedirInt(teclado, "HD");

        int turno = Utilidades.pedirInt(teclado, "turno");

        int danoBase = Utilidades.pedirInt(teclado, "dano");

        int[] TA = preguntarNuevaTA(teclado);

        int critico;

        do
            critico = Utilidades.pedirInt(teclado, "critico");
        while (critico < 0 || critico > 6);

        pullPersonajes.add(new Personaje(nombre, salud, HA, HD, turno, danoBase, TA, critico));
    }

    public void anadirEq() {

    }

    public void anadirCom() {

    }

    public void editarPj(Scanner teclado) {
        String pjBuscado = "";
        boolean ok = false;
        Personaje pj = new Personaje();

        while (!ok) {
            pjBuscado = Utilidades.pedirString(teclado, "nombre del pj");
            if (pjBuscado.equals("salir")) {
                ok = true;
                Vista.setMessage("Saliendo de modo edicion");
            } else if (!pullPersonajes.existsPjPorNombre(pjBuscado)) {
                Vista.setMessage("No existe pj con ese nombre");
            } else {
                Vista.setMessage("Pj encontrado.");
                pj = pullPersonajes.getPjPorNombre(pjBuscado);
                ok = true;
            }
        }
        if (!pjBuscado.equals("salir")) {
            String comando = "";
            while (!comando.equals("salir")) {
                comando = Utilidades.pedirString(teclado, "valor a editar");
                switch (comando) {
                    case "nombre" -> pj.setNombre(Utilidades.pedirString(teclado, "nombre nuevo"));

                    case "salud" -> pj.setSalud(Utilidades.pedirInt(teclado, "salud nueva"));

                    case "HA" -> pj.setHAbase(Utilidades.pedirInt(teclado, "HA"));

                    case "HD" -> pj.setHDbase(Utilidades.pedirInt(teclado, "HD"));

                    case "turno" -> pj.setTurnoBase(Utilidades.pedirInt(teclado, "turno"));

                    case "dano" -> pj.setDanoBase(Utilidades.pedirInt(teclado, "dano"));

                    case "TA" -> pj.setTAindex(Utilidades.pedirInt(teclado, "indice de TA"),
                            Utilidades.pedirInt(teclado, "valor para TA"));

                    default -> Vista.showError();
                }
                Vista.setMessage("¿Has acabado?(s/n)");
                if(teclado.next().equals("s"))
                    comando = "salir";
            }
        }
    }


    public void editarEq() {

    }

    public void editarCom() {

    }

    public int[] preguntarNuevaTA(Scanner teclado) {
        int[] TA = new int[CANT_TA];
        int cuentaTA = 0;

        TA[cuentaTA] = Utilidades.pedirInt(teclado, "FIL");
        cuentaTA++;

        TA[cuentaTA] = Utilidades.pedirInt(teclado, "CON");
        cuentaTA++;

        TA[cuentaTA] = Utilidades.pedirInt(teclado, "PEN");
        cuentaTA++;

        TA[cuentaTA] = Utilidades.pedirInt(teclado, "CAL");
        cuentaTA++;

        TA[cuentaTA] = Utilidades.pedirInt(teclado, "ELE");
        cuentaTA++;

        TA[cuentaTA] = Utilidades.pedirInt(teclado, "FRI");
        cuentaTA++;

        TA[cuentaTA] = Utilidades.pedirInt(teclado, "ENE");

        return TA;
    }

}
