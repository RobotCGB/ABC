package Consola;

public class Vista {

    public void showBienvenida(){
        System.out.println("Te doy la bienvenida a Anima Battle Calculator.");
    }

    public void showError(){
        System.out.println("Algo no ha salido como se esperaba");
    }

    public void pedirComando() {
        System.out.println("Escribe que quieres hacer: ");
    }

    public void showHelp(){
        System.out.println("Estos son los posibles comandos: ");
        System.out.println("- 'anadir X'");
        System.out.println("- 'ver X'");
        System.out.println("- 'editar X'");
        System.out.println("- 'help': muestra esta tabla");
        System.out.println("- 'salir'");
        System.out.println("(X puede ser sustituido por 'pj', 'eq' y 'com')");
    }

    public void showDespedida(){
        System.out.println("Adios");
    }

    public void showPjs(){
        System.out.println();
    }

    public void showEqs(){
        System.out.println();
    }

    public void showComs(){
        System.out.println();
    }


}
