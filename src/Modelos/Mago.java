package Modelos;
import Interfaces.IMagico;

public class Mago extends CombateMagico implements IMagico{
    int mana;
    int sabiduria;
    public Mago(int id, String nombre, int nivel, int salud, int mana, int sabiduria) {
        super(id, nombre, nivel, salud);
        this.mana = mana;
        this.sabiduria = sabiduria;
    }
    
    @Override
    public
    void atacar() {
        System.out.println(nombre + " ataca.");
    }

    @Override
    public void lanzarHechizo(){
        System.out.println(nombre + " lanza un hechizo.");
    }

    public void regenerarMana(){
        System.out.println(nombre + " regenera maná.");
    }
}
