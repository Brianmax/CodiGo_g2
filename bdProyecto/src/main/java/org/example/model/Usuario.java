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
}
