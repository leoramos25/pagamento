package com.leonardords.pagamento.core.usecase.dto.enuns;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum TipoConta {

  INDIVIDUAL("I"),
  CONJUNTA("C"),
  SALARIO("S"),
  APOSENTADO_OU_PENSIONISTA("A");

  private final String valor;
}
