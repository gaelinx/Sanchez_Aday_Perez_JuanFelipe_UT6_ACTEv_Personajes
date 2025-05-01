package Juego;
import Modelos.*;
import Interfaces.*;
import java.util.ArrayList;


public class Juego {
    ArrayList<Personaje> personajes = new ArrayList<>();

    public void agregarPersonaje(Personaje personaje) {
        personajes.add(personaje);
    }

    public void mostrarAcciones(){
        for (Personaje personaje : personajes) {
            if (personaje instanceof Guerrero) {
                Guerrero guerrero = (Guerrero) personaje;
                guerrero.fisico();
                guerrero.atacar();
                guerrero.cargarAtaque();
                guerrero.defender();
            } else if (personaje instanceof Mago) {
                Mago mago = (Mago) personaje;
                mago.magico();
                mago.mana();
                mago.atacar();
                mago.lanzarHechizo();
                mago.regenerarMana();
            } else if (personaje instanceof Arquero) {
                Arquero arquero = (Arquero) personaje;
                arquero.fisico();
                arquero.atacar();
                arquero.volar();
                arquero.moverse();
                arquero.dispararFlecha();
                arquero.reabastecerFlechas(); 
            } else if (personaje instanceof Asesino) {
                Asesino asesino = (Asesino) personaje;
                asesino.atacar();
                asesino.fisico();
                asesino.moverse();
                asesino.ocultar();
                asesino.atacarPorlaEspalda();
            } else if (personaje instanceof Hechicero) {
                Hechicero hechicero = (Hechicero) personaje;
                hechicero.magico();
                hechicero.atacar();
                hechicero.mana();
                hechicero.defender();
                hechicero.invocarEntidad();


            }
        }
    }

}
