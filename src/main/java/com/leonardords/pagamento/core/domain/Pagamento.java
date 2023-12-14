package com.leonardords.pagamento.core.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Pagamento {

  private String mensagem;
  private Boolean sucesso;
}
