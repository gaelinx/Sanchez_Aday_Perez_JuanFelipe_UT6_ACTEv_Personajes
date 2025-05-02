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
                guerrero.arma();
                guerrero.atacar();
                guerrero.cargarAtaque();
                guerrero.defender();
                System.out.println("-----------------");
            } else if (personaje instanceof Mago) {
                Mago mago = (Mago) personaje;
                mago.magico();
                mago.mana();
                mago.atacar();
                mago.lanzarHechizo();
                mago.pocion();
                mago.regenerarMana();
                System.out.println("-----------------");
            } else if (personaje instanceof Arquero) {
                Arquero arquero = (Arquero) personaje;
                arquero.fisico();
                arquero.arma();
                arquero.atacar();
                arquero.volar();
                arquero.moverse();
                arquero.dispararFlecha();
                arquero.reabastecerFlechas();
                System.out.println("-----------------");
            } else if (personaje instanceof Asesino) {
                Asesino asesino = (Asesino) personaje;
                asesino.fisico();
                asesino.arma();
                asesino.atacar();
                asesino.ocultar();
                asesino.moverse();
                asesino.atacarPorlaEspalda();
                System.out.println("-----------------");
            } else if (personaje instanceof Hechicero) {
                Hechicero hechicero = (Hechicero) personaje;
                hechicero.magico();
                hechicero.mana();
                hechicero.atacar();
                hechicero.pocion();
                hechicero.defender();
                hechicero.invocarEntidad();
                System.out.println("-----------------");


            }
        }
    }

}
