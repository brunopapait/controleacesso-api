package br.com.papait.bruno.controleacesso_api.core.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Visita {
  private Long id;
  private String dataHora;
  private Visitante visitante;
  private Morador morador;
}
