import Juego.Juego;
import Modelos.*;
import Interfaces.*;

public class Main {
    public static void main(String[] args) {
        Juego juego = new Juego();

        // Crear personajes
        Guerrero guerrero1 = new Guerrero(1, "Guerrero1", 10, 100,1,1,1);
        Mago mago1 = new Mago(2, "Mago1", 10, 100, 1,1);
        Asesino asesino1 = new Asesino(3, "Asesino1", 10, 80, 10, 25);
        Hechicero hechicero1 = new Hechicero(3,"hechizero1", 15, 150, 90, 25);

        juego.agregarPersonaje(mago1);
        juego.agregarPersonaje(guerrero1);
        juego.agregarPersonaje(asesino1);
        juego.agregarPersonaje(hechicero1);
        juego.mostrarAcciones();

    }
}
