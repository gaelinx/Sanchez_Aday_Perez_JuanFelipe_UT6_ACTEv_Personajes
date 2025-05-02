package Modelos;

public abstract class CombateMagico extends Personaje {

    int mana;

    public CombateMagico(int id, String nombre, int nivel, int salud, int mana) {
        super(id, nombre, nivel, salud);
        this.mana = mana;
    }

    public void magico(){
        System.out.println(nombre + " Es un atacante magico");
    }

    public void mana(){
        System.out.println(nombre + " Cuenta con Maná");
    }

    abstract void pocion();

    @Override
    public void atacar() {
        System.out.println(nombre+" Hace daño magico");
    }
}
