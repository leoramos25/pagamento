package com.leonardords.pagamento.core.usecase.dto.enuns;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum AceiteDigital {

  TRUE(0),
  FALSE(1);

  private final Integer valor;
}
