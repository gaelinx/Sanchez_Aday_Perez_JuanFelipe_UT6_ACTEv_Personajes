package Modelos;
import Interfaces.IMovilizable;

class Arquero extends CombateFisico implements IMovilizable{
    int agilidad;
    int numFlechas;
    Arquero(int id, String nombre, int nivel, int salud, int agilidad, int numFlechas) {
        super(id, nombre, nivel, salud);
        this.agilidad = agilidad;
        this.numFlechas = numFlechas;
    }

    @Override
    void atacar() {
        System.out.println(nombre + " ataca.");
    }

    @Override
    public void moverse(){
        System.out.println(nombre + " se mueve.");
    }

    void dispararFlecha(){
        System.out.println(nombre + " dispara una flecha.");
    }

    void reabastecerFlechas(){
        System.out.println(nombre + " reabastece flechas.");
    }   
}
