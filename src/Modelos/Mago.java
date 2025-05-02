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
        if (mana < 2) {
            System.out.println(nombre + " no tiene suficiente maná para lanzar un hechizo de curación.");
            return;
            
        }
        int curacion = (int) (salud * 0.25);
        System.out.println(nombre + " lanza un hechizo de curación, se cura "+curacion+"  puntos de vida totales. Usa 2 de Mana.");
        mana -= 2;
        
        salud += curacion;
    }

    @Override
    public void lanzarHechizo(){
        if (mana < 2) {
            System.out.println(nombre + " no tiene suficiente maná para lanzar un hechizo.");
            return;
            
        }
        mana -= 2;
        System.out.println(nombre + " lanza un hechizo usando 2 de Mana. Mana restante: " + getMana());
    }

    public void regenerarMana(){
        System.out.println(nombre + " regenera maná.");
        mana += 10;
    }

    public int getMana(){
        return mana;
    }

}
