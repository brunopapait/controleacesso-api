package br.com.papait.bruno.controleacesso_api.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Visitante {
  private Long id;
  private String rg;
  private Pessoa pessoa;
}
