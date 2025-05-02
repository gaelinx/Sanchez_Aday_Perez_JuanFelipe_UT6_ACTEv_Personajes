import Juego.Juego;
import Modelos.*;
import Interfaces.*;

public class Main {
    public static void main(String[] args) {
        Juego juego = new Juego();

        // Crear personajes
        Guerrero guerrero1 = new Guerrero(1, "Oswald", 10, 200,50,30,1);
        Mago mago1 = new Mago(2, "Lulu", 10, 100, 40,1);
        Asesino asesino1 = new Asesino(3, "Belfort", 10, 80, 10, 25);
        Hechicero hechicero1 = new Hechicero(3,"Magnificus", 15, 150, 90, 25);
        Arquero arquero1 = new Arquero(4,"Ranok", 99, 70, 90, 25);

        juego.agregarPersonaje(mago1);
        juego.agregarPersonaje(guerrero1);
        juego.agregarPersonaje(asesino1);
        juego.agregarPersonaje(hechicero1);
        juego.agregarPersonaje(arquero1);

        arquero1.descripcion();
        guerrero1.descripcion();
        mago1.descripcion();
        asesino1.descripcion();
        hechicero1.descripcion();
        arquero1.descripcion();
        System.out.println();

        juego.mostrarAcciones();
    }
}
