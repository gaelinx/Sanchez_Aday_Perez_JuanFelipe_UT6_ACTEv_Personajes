package Modelos;
import Interfaces.IDefendible;


public class Guerrero extends CombateFisico implements IDefendible{
    int fuerza;
    int armadura;
    boolean escudo= false;
    boolean defender = false;
    boolean cargar = false;
    boolean usado = false;
    public Guerrero(int id, String nombre, int nivel, int salud, int fuerza, int armadura, boolean escudo) {
        super(id, nombre, nivel, salud);
        this.fuerza = fuerza;
        this.armadura = armadura;
        this.escudo = escudo;
    }
    
    @Override
    public void atacar() {
        System.out.println(nombre + " ataca.");
    }

    @Override
    public void descripcion(){
        System.out.println(nombre+" Es un guerrero, estas tropas valerosas cuentan con una fuerza que les permite tener un balance entre el daño y la defensa, tambien cuentan con un escudo que les protegera de un ataque a cambio de perderlo por el resto del combate\n");
    }

    public void cargarAtaque(){
        if (cargar == true) {
            System.out.println(nombre + " ya ha cargado su ataque, no puede cargarlo de nuevo.");
            return;
            
        }
        System.out.println(nombre + " carga un poderoso ataque. El siguiente ataque hará el doble de daño.");
        cargar = true;
    }

    @Override
    public void defender(){
        System.out.println(nombre + " se defiende. El siguiente ataque le hará la mitad del daño original.");
        defender=true;
    }

    public void usarEscudo(){
        if (usado==true) {
            System.out.println(nombre + " ya ha usado su escudo, no puede usarlo de nuevo.");
            return;
            
        }
        System.out.println(nombre + " usa su escudo. El siguiente ataque no le hará daño.");
        escudo = true;
        usado=true;
    }   

    public boolean getDefender(){
        return defender;
    }

    public boolean getCargar(){
        return cargar;
    }

    public void setCargar(boolean cargar){
        this.cargar = cargar;
    }

    public void setDefender(boolean defender){
        this.defender = defender;
    }

    public boolean getEscudo(){
        return escudo;
    }
    
    public void setEscudo(boolean escudo){
        this.escudo = escudo;
    }

    public boolean getUsado(){
        return usado;
    }   


}