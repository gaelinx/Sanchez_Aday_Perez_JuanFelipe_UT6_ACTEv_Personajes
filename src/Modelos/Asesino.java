package Modelos;

import Interfaces.ICurar;
import Interfaces.IMovilizable;

public class Asesino extends CombateFisico implements ICurar, IMovilizable {
    int sigilo;
    int critico;

    public Asesino(int id, String nombre, int nivel, int salud) {
        super(id, nombre, nivel, salud);
        this.sigilo = sigilo;
        this.critico = critico;
    }


    @Override
    public void curar() {
        System.out.println(nombre + " recupera la mitad de la salud que le hizo a su enemigo");
    }

    @Override
    public void moverse() {
        System.out.println(nombre+" se mueve entre los arbustos, su sigilo aumenta");
    }

    void ocultar (){
        System.out.println(nombre+" se oculta en los arbutos, su sigilo aumenta");
    }

    void atacarPorlaEspalda(){
        System.out.println(nombre+" Ataco por la espalda! hace daño critico y su sigilo se reinicia");
    }
}
