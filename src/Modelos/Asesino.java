package Modelos;

import Interfaces.ICurar;
import Interfaces.IMovilizable;

public class Asesino extends CombateFisico implements ICurar, IMovilizable {
    int sigilo;
    int critico;

    public Asesino(int id, String nombre, int nivel, int salud, int sigilo, int critico) {
        super(id, nombre, nivel, salud);
        this.sigilo = sigilo;
        this.critico = critico;
    }

    @Override
    public void descripcion(){
        System.out.println(nombre+" es un asesino, estos renegados se ocultan en la sombra para cargar su sigilo, una vez ya sean invisibles para el rival pueden dar un potente ataque por la espalda que inflingira daño critico, si el enemigo los ataca perderan su sigilo actual\n");
    }

    @Override
    public void curar() {
        System.out.println(nombre + " recupera la mitad de la salud que le hizo a su enemigo");
    }

    @Override
    public void moverse() {
        System.out.println(nombre+" se mueve entre los arbustos, su sigilo aumenta");
    }

    public void ocultar (){
        System.out.println(nombre+" se oculta en los arbutos, su sigilo aumenta");
    }

    public void atacarPorlaEspalda(){
        System.out.println(nombre+" Ataco por la espalda! hace daño critico y su sigilo se reinicia");
    }
}
