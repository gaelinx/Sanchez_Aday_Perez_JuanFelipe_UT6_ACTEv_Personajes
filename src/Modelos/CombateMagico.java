package Modelos;

public class CombateMagico extends Personaje {

    public CombateMagico(int id, String nombre, int nivel, int salud) {
        super(id, nombre, nivel, salud);
    }

    public void magico(){
        System.out.println(nombre + " Es un atacante magico");
    }

    public void mana(){
        System.out.println(nombre + "Cuenta con Maná");
    }

    @Override
    public void atacar() {

    }
}
