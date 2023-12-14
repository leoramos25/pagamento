package com.leonardords.pagamento.core.usecase.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class PagamentoCartaoCredito extends Pagamento {

  @NotNull(message = "Os dados do cartão não podem estar vazios.")
  private Cartao cartao;
}
