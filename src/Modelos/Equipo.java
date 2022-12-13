package Modelos;
import Consola.Vista;

import java.util.ArrayList;

public class Equipo {

    private String nombre;
    private ArrayList<Personaje> party;
    private Vista view = new Vista();

    public Equipo(String nombre, ArrayList<Personaje> party){
        this.nombre = nombre;
        this.party = party;
    }

    public Equipo(){
        this.nombre = "vacio";
        this.party = new ArrayList<>();
    }

}
