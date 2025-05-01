import Juego.Juego;
import Modelos.*;
import Interfaces.*;

public class Main {
    public static void main(String[] args) {
        Juego juego = new Juego();
        
        // Crear personajes
        Guerrero guerrero1 = new Guerrero(1, "Guerrero1", 10, 100,1,1,1);
        Mago mago1 = new Mago(2, "Mago1", 10, 100, 1,1);

        juego.agregarPersonaje(mago1);
        juego.agregarPersonaje(guerrero1);
        juego.mostrarAcciones();
        
    }
}
