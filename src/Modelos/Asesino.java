package Modelos;

import Interfaces.ICurar;
import Interfaces.IMovilizable;

public class Asesino extends CombateFisico implements ICurar, IMovilizable {
    int sigilo;
    int critico;
    boolean oculto = false;

    public Asesino(int id, String nombre, int nivel, int salud, int sigilo, int critico) {
        super(id, nombre, nivel, salud);
        this.sigilo = sigilo;
        this.critico = critico;
    }
    int saludOriginal = salud;

    @Override
    public void descripcion(){
        System.out.println(nombre+" es un asesino, estos renegados se ocultan en la sombra para cargar su sigilo, una vez ya sean invisibles para el rival pueden dar un potente ataque por la espalda que inflingira daño critico, si el enemigo los ataca perderan su sigilo actual\n");
    }

    @Override
    public void curar() {
       
        if (salud >= saludOriginal) {
            System.out.println(nombre + " ya tiene su salud completa.");
            return;
        }
        System.out.println(nombre + " recupera un 25% de su salud total.");
        int curacion = (int) (salud * 0.25);   
        salud += curacion;
    }

    @Override
    public void moverse() {
        System.out.println(nombre+" se mueve entre los arbustos, su sigilo aumenta");
    }

    public void ocultar (){
        System.out.println(nombre+" se oculta en los arbutos, su sigilo aumenta");
        oculto = true;
    }

    public void atacarPorlaEspalda(){
        if (oculto == false) {
            System.out.println(nombre+" no puede atacar por la espalda, no esta oculto");
            return;
            
        }
        System.out.println(nombre+" Ataca por la espalda! hace daño critico y su sigilo se reinicia");
    }

    public boolean getOculto(){
        return oculto;
    }

    public void setOculto(boolean oculto){
        this.oculto = oculto;
    }

}
