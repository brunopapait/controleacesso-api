package br.com.papait.bruno.controleacesso_api.adapter.converter;

import br.com.papait.bruno.controleacesso_api.adapter.dto.UsuarioDTO;
import br.com.papait.bruno.controleacesso_api.core.domain.Usuario;
import org.springframework.stereotype.Component;

@Component
public class UsuarioConverter {

  public Usuario toDomain(final UsuarioDTO usuarioDTO) {
    return Usuario
        .builder()
        .id(usuarioDTO.id())
        .email(usuarioDTO.email())
        .senha(usuarioDTO.senha())
        .isAdministrador(usuarioDTO.isAdministrador())
        .build();
  }

  public UsuarioDTO toDTO(final Usuario usuario) {
    return UsuarioDTO
        .builder()
        .id(usuario.getId())
        .email(usuario.getEmail())
        .senha(usuario.getSenha())
        .isAdministrador(usuario.getIsAdministrador())
//        .nome(usuario.getPessoa().getNome())
        .build();
  }
}
