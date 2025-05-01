package Modelos;

import Interfaces.IDefendible;

public class Hechicero extends CombateMagico implements IDefendible {
    int concentracion;

    public Hechicero(int id, String nombre, int nivel, int salud, int mana, int concentracion) {
        super(id, nombre, nivel, salud, mana);
        this.concentracion = concentracion;
    }

    @Override
    public void atacar() {
        super.atacar();
    }

    @Override
    public void descripcion(){
        System.out.println(nombre+" Es un Hechizero, los Hechizeros usan sus habilidades magicas para aumentar su resistencia y poder contactar con entes antiguos que llaman para el combate");
    }

    @Override
    public void defender() {
        System.out.println(nombre+" Se envuelve en Magia, se esta defendiendo");
    }

    public void invocarEntidad(){
        System.out.println(nombre+" Pide ayudar a fuerzas ancestrales, "+nombre+" invoco a una entidad");
    }
}
