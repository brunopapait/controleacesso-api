package br.com.papait.bruno.controleacesso_api.core.ports;

import br.com.papait.bruno.controleacesso_api.core.domain.Usuario;
import org.springframework.stereotype.Component;

public interface UsuarioServicePort {
  Usuario create(Usuario usuario);
}
