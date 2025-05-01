package Modelos;
import Interfaces.IMovilizable;

public class Arquero extends CombateFisico implements IMovilizable{
    int agilidad;
    int numFlechas;
    public Arquero(int id, String nombre, int nivel, int salud, int agilidad, int numFlechas) {
        super(id, nombre, nivel, salud);
        this.agilidad = agilidad;
        this.numFlechas = numFlechas;
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " ataca.");
    }

    @Override
    public void moverse(){
        System.out.println(nombre + " se mueve.");
    }

    public void dispararFlecha(){
        System.out.println(nombre + " dispara una flecha.");
    }

    public void reabastecerFlechas(){
        System.out.println(nombre + " reabastece flechas.");
    }   
}
