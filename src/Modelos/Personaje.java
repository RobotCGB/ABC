package Modelos;

public class Personaje {
    final int FIL = 0; final int CON = 1; final int PEN = 2;
    final int CAL = 3; final int ELE = 4; final int FRI = 5;
    final int ENE = 6;
    private String nombre;
    private int salud;
    private int HAbase;
    private int HDbase;
    private int turnoBase;
    private int danoBase;
    int[] TA;
    int critico;

    public Personaje(String nombre, int salud, int HAbase, int HDbase, int turnoBase, int danoBase, int[] TA, int critico){
        this.nombre = nombre;
        this.salud = salud;
        this.HAbase = HAbase;
        this.HDbase = HDbase;
        this.turnoBase = turnoBase;
        this.danoBase = danoBase;
        this.TA = TA;
        this.critico = critico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTurnoBase() {
        return turnoBase;
    }

    public int getHAbase() {
        return HAbase;
    }

    public int getHDbase() {
        return HDbase;
    }

    public int getDanoBase() {
        return danoBase;
    }

    public int getSalud() {
        return salud;
    }

    public int[] getTA() {
        return TA;
    }

    public int getTAindex(int i){
        return TA[i];
    }

    public int getCritico() {
        return critico;
    }

    public void setHAbase(int HAbase) {
        this.HAbase = HAbase;
    }

    public void setDanoBase(int danoBase) {
        this.danoBase = danoBase;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public void setHDbase(int HDbase) {
        this.HDbase = HDbase;
    }

    public void setTurnoBase(int turnoBase) {
        this.turnoBase = turnoBase;
    }

    public void setTA(int[] TA) {
        this.TA = TA;
    }

    public void setCritico(int critico) {
        this.critico = critico;
    }

    @Override
    public String toString(){
        return nombre;
    }

    public Personaje clona(){
        return new Personaje(this.nombre, this.salud, this.HAbase, this.HDbase, this.turnoBase, this.danoBase, this.TA, this.critico);
    }

}
