package org.example.service;

import org.example.model.Usuario;

import java.util.List;

public interface UsuarioService {
    public void addUser(Usuario usuario);
    public void delete(int id);
    public void update(Usuario usuario);
    public Usuario getByid(int id);
    public List<Usuario> getAllUsers();
}
