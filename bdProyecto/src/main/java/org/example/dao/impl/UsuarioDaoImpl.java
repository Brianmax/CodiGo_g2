package org.example.dao.impl;

import org.example.dao.UsuarioDao;
import org.example.model.Usuario;
import org.example.utils.DbConnection;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.util.List;

public class UsuarioDaoImpl implements UsuarioDao {
    private Connection connection;
    public UsuarioDaoImpl(Connection connection){
        this.connection = connection;
    }
    @Override
    public void agregarUsuario(Usuario usuario) {
        try{
            String sql = "insert into usuarios (nombre, email, edad, passworduser, fechacreacion) values (?,?,?,?,?)";
            PreparedStatement psmt = connection.prepareStatement(sql);
            String nombre = usuario.getNombre();
            String email = usuario.getEmail();
            byte edad = usuario.getEdad();
            String passworduser = usuario.getPassworduser();
            Date fechacreacion = usuario.getFechacreacion();
            // preparamos la sentencia
            psmt.setString(1, nombre);
            psmt.setString(2, email);
            psmt.setByte(3, edad);
            psmt.setString(4, passworduser);
            psmt.setDate(5, fechacreacion);
            psmt.executeUpdate();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void eliminar(int id) {

    }

    @Override
    public void update(Usuario usuario) {

    }

    @Override
    public Usuario getById(int id) {
        return null;
    }

    @Override
    public List<Usuario> getAll() {
        return null;
    }
}
