package Modelos;
import Interfaces.IMovilizable;
import Interfaces.IVolador;

public class Arquero extends CombateFisico implements IVolador, IMovilizable{
    int agilidad;
    int numFlechas;
    boolean volando = false;

    public Arquero(int id, String nombre, int nivel, int salud, int agilidad) {
        super(id, nombre, nivel, salud);
        this.agilidad = agilidad;
        this.numFlechas = 10;
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " ataca.");
    }

    @Override
    public void descripcion(){
        System.out.println(nombre+" Es un arquero, los arqueros cuentan con la ventaja de la distancia y poder volar para ser inmunes a ciertos ataque, con el coste de que cuentan con municion limitada que tendran que recargar cada cierto tiempo\n");
    }

    @Override
    public void arma(){
        System.out.println(nombre+" Usa un arco");
    }

    @Override
    public void volar(){
        System.out.println(nombre + " empieza a volar. El siguiente ataque le hará la mitad de puntos de daño original.");
        volando = true;
    }

    @Override
    public void moverse() {
        System.out.println(nombre + " se aleja del enemigo.");
    }

    public void dispararFlecha(){
        if (getFlechas() <= 0) {
            System.out.println(nombre + " no tiene flechas para disparar.");
            return;
            
        }
        numFlechas--;
        System.out.println(nombre + " dispara una flecha. Hace 12 de daño. Flechas restantes: " + (numFlechas));
    }



    public void reabastecerFlechas(){
        System.out.println(nombre + " reabastece flechas.");
        numFlechas = 10;
    } 
    
    //getters y setters
    public int getFlechas(){
        return numFlechas;
    }

    public boolean getVolar(){
        return volando;
    }

    public void setVolar(boolean volando){
        this.volando = volando;
    }


}
