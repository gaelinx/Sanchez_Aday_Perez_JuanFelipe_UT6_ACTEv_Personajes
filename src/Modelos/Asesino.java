package Modelos;

import Interfaces.ICurar;

public class Asesino extends CombateMagico implements ICurar {
    public Asesino(int id, String nombre, int nivel, int salud) {
        super(id, nombre, nivel, salud);
    }

    @Override
    public void atacar() {
        super.atacar();
    }

    @Override
    public void curar() {

    }
}
