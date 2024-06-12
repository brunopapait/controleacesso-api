package br.com.papait.bruno.controleacesso_api.adapter.dto;

import lombok.Builder;

@Builder
public record UsuarioDTO(
    Long id,
    String email,
    String senha,
    Boolean isAdministrador,
    String nome
) {}
