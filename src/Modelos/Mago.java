package Modelos;
import Interfaces.ICurar;
import Interfaces.IMagico;

public class Mago extends CombateMagico implements IMagico, ICurar{
    int sabiduria;
    public Mago(int id, String nombre, int nivel, int salud, int mana, int sabiduria) {
        super(id, nombre, nivel, salud, mana);
        this.sabiduria = sabiduria;
    }
    
    @Override
    public
    void atacar() {
        System.out.println(nombre + " ataca.");
    }

    @Override
    public void curar() {
        System.out.println(nombre + " lanza un hechizo de curación.");
    }

    @Override
    public void lanzarHechizo(){
        System.out.println(nombre + " lanza un hechizo.");
    }

    public void regenerarMana(){
        System.out.println(nombre + " regenera maná.");
    }
}
