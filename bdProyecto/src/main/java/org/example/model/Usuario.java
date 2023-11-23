package org.example.model;

import lombok.*;

import java.sql.Date;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Usuario {
    private int usuario_id;
    private String nombre;
    private String email;
    private byte edad;
    private String passworduser;
    private Date fechacreacion;
    // relacion de uno a muchos


    public Usuario(String nombre, String email, byte edad, String passworduser) {
        this.nombre = nombre;
        this.email = email;
        this.edad = edad;
        this.passworduser = passworduser;
    }
    public void printUser(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Email" + email);
        System.out.println("Edad" + edad);
    }
}
