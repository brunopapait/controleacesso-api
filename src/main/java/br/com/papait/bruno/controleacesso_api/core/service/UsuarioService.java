package br.com.papait.bruno.controleacesso_api.core.service;

import br.com.papait.bruno.controleacesso_api.core.domain.Usuario;
import br.com.papait.bruno.controleacesso_api.core.ports.UsuarioServicePort;
import org.springframework.stereotype.Component;

public class UsuarioService implements UsuarioServicePort {
  @Override
  public Usuario create(Usuario usuario) {
    return usuario;
  }
}
