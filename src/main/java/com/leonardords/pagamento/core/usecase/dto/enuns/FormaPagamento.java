package com.leonardords.pagamento.core.usecase.dto.enuns;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum FormaPagamento {

  DEBITO_EM_CONTA(0),
  CARTAO_DE_CREDITO(1);

  private final Integer valor;
}
