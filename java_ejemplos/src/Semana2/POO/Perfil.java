package Semana2.POO;

import Semana2.herencia.Persona;

public class Perfil {
    String foto;
    boolean estado;
    String email;
    Persona persona;

    public Perfil(String foto, boolean estado, String email){
        this.foto = foto;
        this.estado = estado;
        this.email = email;
    }
}
