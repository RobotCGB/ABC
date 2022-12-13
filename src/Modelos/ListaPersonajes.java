package Modelos;

import java.util.ArrayList;

public class ListaPersonajes {
    ArrayList<Personaje> pullPersonajes = new ArrayList<>();

    public ListaPersonajes() {
        this.pullPersonajes = new ArrayList<>();
    }

    public Personaje getPjPorNombre(String nombre){
        int i = 0;
        boolean ok = false;
        Personaje pj = null;
        while(!ok && pullPersonajes.size() > i){
            if(pullPersonajes.get(i).getNombre().equals(nombre)) {
                pj = pullPersonajes.get(i);
                ok = true;
            }
            i++;
        }
        return pj;
    }

    public boolean existsPjPorNombre(String nombre){
        int i = 0;
        boolean ok = false;
        while(!ok && pullPersonajes.size() > i){
            ok = pullPersonajes.get(i).getNombre().equals(nombre);
            i++;
        }
        return ok;
    }

    public boolean add(Personaje pj){
        return pullPersonajes.add(pj);
    }

    public String toString(){
        String ret = "";
        for(int i = 0; i < pullPersonajes.size(); i++){
            Personaje aux = pullPersonajes.get(i);
            ret += aux.toString() + "\n";
        }
        return ret;
    }

}
