package Modelos;

import Interfaces.IDefendible;

public class Hechicero extends CombateMagico implements IDefendible {
    public Hechicero(int id, String nombre, int nivel, int salud) {
        super(id, nombre, nivel, salud);
    }

    @Override
    public void atacar() {
        super.atacar();
    }

    @Override
    public void defender() {

    }
}
