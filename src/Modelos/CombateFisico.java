package Modelos;

public class CombateFisico extends Personaje {

    CombateFisico(int id, String nombre, int nivel, int salud) {
        super(id, nombre, nivel, salud);
        
    }

    public void fisico(){
        System.out.println(nombre+" se prepara físicamente.");
    }

    @Override
    void atacar(){
        System.out.println(nombre+" Hace daño fisico");
    }

}