package org.example.dao.impl;

import org.example.dao.UsuarioDao;
import org.example.model.Usuario;

import java.util.List;

public class Prueba implements UsuarioDao {
    @Override
    public void agregarUsuario(Usuario usuario) {
        System.out.println("ejecutando este metodo");
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
