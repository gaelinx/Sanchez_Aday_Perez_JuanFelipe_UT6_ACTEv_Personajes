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
    public void descripcion(){
        System.out.println(nombre+ " Es un mago, estos especialistas en las artes antiguas son capaces de crear hechizos poderoso a cambio de Mana, el Mana se regenera progresivamente\n");
    }

    @Override
    public
    void atacar() {
        System.out.println(nombre + " ataca.");
    }

    @Override
    public void pocion(){
        System.out.println(nombre+" Usa una pocion de ignifuga, ahora hace un 10% mas de daño con hechizos de fuego!");
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
