package com.leonardords.pagamento.core.usecase.dto;

import com.leonardords.pagamento.core.usecase.dto.enuns.TipoConta;
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
public class PagamentoDebitoConta extends Pagamento {

  private DebitoConta debitoConta;
}
