package br.com.papait.bruno.controleacesso_api.adapter.controller;

import br.com.papait.bruno.controleacesso_api.adapter.converter.UsuarioConverter;
import br.com.papait.bruno.controleacesso_api.adapter.dto.UsuarioDTO;
import br.com.papait.bruno.controleacesso_api.core.ports.UsuarioServicePort;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
@RequiredArgsConstructor
public class UsuarioController {

  private final UsuarioServicePort usuarioServicePort;
  private final UsuarioConverter usuarioConverter;

  @PostMapping
  @Transactional
  public ResponseEntity<UsuarioDTO> create(@RequestBody final UsuarioDTO usuario) {
    var usuarioDomain = this.usuarioConverter.toDomain(usuario);
    return ResponseEntity.ok(this.usuarioConverter.toDTO(this.usuarioServicePort.create(usuarioDomain)));
  }
}
