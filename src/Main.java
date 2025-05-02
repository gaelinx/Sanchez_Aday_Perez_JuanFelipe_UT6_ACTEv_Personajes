import Juego.Juego;
import Modelos.*;
import Batalla.*;

public class Main {
    public static void main(String[] args) {
        Juego juego = new Juego();

        // Crear personajes
        Guerrero guerrero1 = new Guerrero(1, "Oswald", 10, 200,50,30);
        Mago mago1 = new Mago(2, "Lulu", 10, 100, 40,1);
        Asesino asesino1 = new Asesino(3, "Belfort", 10, 80, 10, 25);
        Hechicero hechicero1 = new Hechicero(3,"Magnificus", 15, 150, 90, 25);
        Arquero arquero1 = new Arquero(4,"Ranok", 99, 70, 90);

        //prueba batalla
        Guerrero guerreroBatalla = new Guerrero(20, "Fang Yuan", 10, 100,1,1);
        Arquero arqueroBatalla = new Arquero(20, "Arquerito", 10,100,1);
        Asesino asesinoBatalla = new Asesino(20, "Asesinito", 10, 100,1,1);
        Hechicero hechiceroBatalla = new Hechicero(20, "Hechicero", 10, 100,1,1);

        juego.agregarPersonaje(mago1);
        juego.agregarPersonaje(guerrero1);
        juego.agregarPersonaje(asesino1);
        juego.agregarPersonaje(hechicero1);
        juego.agregarPersonaje(arquero1);
        juego.mostrarAcciones();

        arquero1.descripcion();
        guerrero1.descripcion();
        mago1.descripcion();
        asesino1.descripcion();
        hechicero1.descripcion();
        arquero1.descripcion();
        System.out.println();


        System.out.println("Ahora simularemos una batalla");

        Batalla batalla = new Batalla(asesinoBatalla, hechiceroBatalla);
        batalla.iniciarBatalla();


    }
}
