package br.com.papait.bruno.controleacesso_api.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
