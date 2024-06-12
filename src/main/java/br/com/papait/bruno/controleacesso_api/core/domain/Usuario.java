package br.com.papait.bruno.controleacesso_api.core.domain;

import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Usuario {
  private Long id;
  private String email;
  private String senha;
  private Boolean isAdministrador;
  private Pessoa pessoa;
}
