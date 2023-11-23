package org.example.dao.impl;

import org.example.dao.UsuarioDao;
import org.example.model.Usuario;
import org.example.utils.DbConnection;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDaoImpl implements UsuarioDao {
    private Connection connection;
    public UsuarioDaoImpl(Connection connection){
        this.connection = connection;
    }
    @Override
    public void agregarUsuario(Usuario usuario) {
        try{
            String sql = "insert into usuarios (nombre, email, edad, passworduser) values (?,?,?,?)";
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
        try{
           String sql = "select * from usuarios";
           PreparedStatement psmt = connection.prepareStatement(sql);
           ResultSet resultSet = psmt.executeQuery();
           List<Usuario> usuarios = new ArrayList<>();
           while(resultSet.next()){
                String nombre = resultSet.getString("nombre");
                String email = resultSet.getString("email");
                byte edad =resultSet.getByte("edad");
                Usuario userDb = new Usuario();
                userDb.setNombre(nombre);
                userDb.setEmail(email);
                userDb.setEdad(edad);
                usuarios.add(userDb);
           }
           return usuarios;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
