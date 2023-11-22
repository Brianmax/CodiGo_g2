package org.example;

import org.example.dao.UsuarioDao;
import org.example.dao.impl.UsuarioDaoImpl;
import org.example.model.Usuario;
import org.example.service.UsuarioService;
import org.example.service.impl.UsuarioServiceImpl;
import org.example.utils.DbConnection;

import java.sql.Connection;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        DbConnection dbConnection = new DbConnection();
        UsuarioService usuarioService = new UsuarioServiceImpl(new UsuarioDaoImpl(dbConnection.getConnection()));
        Usuario usuario = new Usuario();
        
    }
}