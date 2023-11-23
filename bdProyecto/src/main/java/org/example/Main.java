package org.example;

import org.example.dao.UsuarioDao;
import org.example.dao.impl.Prueba;
import org.example.dao.impl.UsuarioDaoImpl;
import org.example.model.Usuario;
import org.example.service.UsuarioService;
import org.example.service.impl.UsuarioServiceImpl;
import org.example.utils.DbConnection;

import java.sql.Connection;
import java.sql.Date;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        DbConnection dbConnection = new DbConnection();
        UsuarioService usuarioService = new UsuarioServiceImpl(new UsuarioDaoImpl(dbConnection.getConnection()));
        Usuario user = new Usuario("Juaaaaa", "email@gmail.com", (byte) 40, "password");
        // usuarioService.addUser(user);
        List<Usuario> userList = usuarioService.getAllUsers();

        for(Usuario userdb: userList){
            userdb.printUser();
            System.out.println("------------------------------------");
        }
    }
}