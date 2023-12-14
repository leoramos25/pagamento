package com.leonardords.pagamento.core.usecase.dto;

import com.leonardords.pagamento.core.usecase.dto.enuns.FormaPagamento;
import com.leonardords.pagamento.core.usecase.dto.enuns.Periodicidade;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode
public abstract class Pagamento {

  private PreAgendado preAgendado;
  @NotNull(message = "O campo periodicidade não pode ser vazio.")
  private Periodicidade periodicidade;
  @NotNull(message = "O campo diaPagamento não pode ser vazio.")
  private Integer diaPagamento;
  @NotNull(message = "O campo diaPagamento não pode ser vazio.")
  private FormaPagamento formaPagamento;
}