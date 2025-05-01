package Modelos;
import Interfaces.IDefendible;


public class Guerrero extends CombateFisico implements IDefendible{
    int fuerza;
    int armadura;
    int escudo;
    public Guerrero(int id, String nombre, int nivel, int salud, int fuerza, int armadura, int escudo) {
        super(id, nombre, nivel, salud);
        this.fuerza = fuerza;
        this.armadura = armadura;
        this.escudo = escudo;
    }
    
    @Override
    public void atacar() {
        System.out.println(nombre + " ataca.");
    }

    @Override
    public void descripcion(){
        System.out.println(nombre+" Es un guerrero, estas tropas valerosas cuentan con una fuerza que les permite tener un balance entre el daño y la defensa, tambien cuentan con un escudo que les protegera de un ataque a cambio de perderlo por el resto del combate");
    }

    public void cargarAtaque(){
        System.out.println(nombre + " carga su ataque.");
    }

    @Override
    public void defender(){
        System.out.println(nombre + " se defiende.");
    }

}