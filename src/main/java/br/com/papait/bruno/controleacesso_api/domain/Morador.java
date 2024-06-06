package br.com.papait.bruno.controleacesso_api.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Morador {
  private Long id;
  private String cpf;
  private String endereco;
  private String telefone;
  private Pessoa pessoa;
}
