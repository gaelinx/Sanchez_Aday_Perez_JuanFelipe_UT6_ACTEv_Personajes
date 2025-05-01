package Modelos;

abstract class CombateFisico extends Personaje {

    CombateFisico(int id, String nombre, int nivel, int salud) {
        super(id, nombre, nivel, salud);
        
    }

    void fisico(){
        System.out.println(nombre+" se prepara físicamente.");
    }

    @Override
    abstract void atacar();

}