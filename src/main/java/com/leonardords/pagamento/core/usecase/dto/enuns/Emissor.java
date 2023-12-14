package com.leonardords.pagamento.core.usecase.dto.enuns;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Emissor {

  VISA(0),
  MASTERCARD(1);

  private final Integer value;
}
