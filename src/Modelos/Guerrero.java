package Modelos;
import Interfaces.IDefendible;


class Guerrero extends CombateFisico implements IDefendible{
    int fuerza;
    int armadura;
    int escudo;
    Guerrero(int id, String nombre, int nivel, int salud, int fuerza, int armadura, int escudo) {
        super(id, nombre, nivel, salud);
        this.fuerza = fuerza;
        this.armadura = armadura;
        this.escudo = escudo;
    }
    
    @Override
    void atacar() {
        System.out.println(nombre + " ataca.");
    }

    void cargarAtaque(){
        System.out.println(nombre + " carga su ataque.");
    }

    @Override
    public void defender(){
        System.out.println(nombre + " se defiende.");
    }

}