package Modelos;

import Interfaces.IDefendible;

public class Hechicero extends CombateMagico implements IDefendible {
    int concentracion;
    public Hechicero(int id, String nombre, int nivel, int salud, int mana) {
        super(id, nombre, nivel, salud, mana);
        this.concentracion = concentracion;
    }

    @Override
    public void atacar() {
        super.atacar();
    }

    @Override
    public void defender() {
        System.out.println(nombre+" se envuelve en Magia, se esta defendiendo");
    }
}
