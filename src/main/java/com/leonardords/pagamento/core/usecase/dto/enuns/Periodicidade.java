package com.leonardords.pagamento.core.usecase.dto.enuns;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Periodicidade {

  PAMENTO_UNICO(0),
  MENSAL(1),
  ANUAL(2),
  BIMESTRAL(3),
  TRIMESTRAL(4),
  QUADRIMESTRAL(5),
  SEMESTRAL(6);

  private final Integer valor;
}
