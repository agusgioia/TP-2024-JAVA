package com.PersonalizaTuViaje.PersonalizaTuViaje.Service;

import com.PersonalizaTuViaje.PersonalizaTuViaje.LogicaDeNegocio.Usuario;

import java.util.List;

public interface UserService {

    List<Usuario> ListaUsuarios();

    Usuario ObtenerUsuario(String id) throws Exception;

    Boolean NuevoUsuario(Usuario usuario);

    Boolean EditarUsuario(String id,Usuario usuario);

    Boolean EliminarUsuario(String id);
}
