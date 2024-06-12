package br.com.papait.bruno.controleacesso_api.infra;

import br.com.papait.bruno.controleacesso_api.core.ports.UsuarioServicePort;
import br.com.papait.bruno.controleacesso_api.core.service.UsuarioService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {

  @Bean
  UsuarioServicePort usuarioServicePort() {
    return new UsuarioService();
  }
}
