package Modelos;

import Consola.Vista;

import java.util.ArrayList;

public class ListaEquipos {
    int size;
    ArrayList<Equipo> pullEquipos;

    public ListaEquipos(int size, ArrayList<Equipo> pullEquipos) {
        this.pullEquipos = pullEquipos;
        this.size = pullEquipos.size();
    }

    public ListaEquipos(){
        this.pullEquipos = new ArrayList<>();
        this.size = 0;
    }

    public boolean add(Equipo eq){
        size++;
        return pullEquipos.add(eq);
    }

    public int size() {
        return size;
    }

    public String toString(){
        String ret = "";
        int i = 0;
        for(Equipo eq : pullEquipos){
            ret += (i+1) + ") " + eq.getNombre() + ": \n";
            for(Personaje pj : eq.getParty())
                ret += eq.getParty().get(i).toString() + "\n";
            i++;
        }
        return ret;
    }

}
