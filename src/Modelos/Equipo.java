package Modelos;
import Consola.Vista;

import java.util.ArrayList;

public class Equipo {

    private String nombre;
    private ArrayList<Personaje> party;

    public Equipo(String nombre, ArrayList<Personaje> party){
        this.nombre = nombre;
        this.party = party;
    }

    public Equipo(){
        this.nombre = "vacio";
        this.party = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Personaje> getParty() {
        return party;
    }

    public boolean add(Personaje pj){
        return party.add(pj);
    }

    public void combinar(ArrayList<Personaje> list){
        party.addAll(list);
    }

}
