package Modelos;

import java.util.Objects;

public abstract class Personaje {
    int id;
    String nombre;
    int nivel;
    int salud;

    public Personaje(int id, String nombre, int nivel, int salud) {
        this.id = id;
        this.nombre = nombre;
        this.nivel = nivel;
        this.salud = salud;
    }

    public void descripcion(){
        System.out.println(nombre+" es un Personaje");
    }

    public abstract void atacar();

    public String getNombre() {
        return nombre;
    }

    public int getSalud(){
        return salud;
    }

    public void setSalud(int salud){
        this.salud = salud;
    }

    @Override
    public String toString() {
        return "Personaje: " + nombre + ", Nivel: " + nivel + ", Salud: " + salud;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if(obj==null || getClass() != obj.getClass()) return false;
        Personaje other = (Personaje) obj;
        return id==other.id &&nombre.equals(other.nombre) &&nivel == other.nivel &&salud==other.salud;
    }
    
    @Override
    public int hashCode(){
        return Objects.hash(id, nombre, nivel, salud);
    }

}
