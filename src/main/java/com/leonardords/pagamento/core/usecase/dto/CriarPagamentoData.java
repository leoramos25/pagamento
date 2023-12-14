package com.leonardords.pagamento.core.usecase.dto;

import com.leonardords.pagamento.core.usecase.dto.enuns.AceiteDigital;
import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;
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
@EqualsAndHashCode
public class CriarPagamentoData {

  @NotNull(message = "O campo premio não pode ser vazio.")
  private BigDecimal premio;
  @NotNull(message = "O campo premioTotal não pode ser vazio.")
  private BigDecimal premioTotal;
  @NotNull(message = "O campo iof não pode ser vazio.")
  private BigDecimal iof;
  @NotNull(message = "O campo email não pode ser vazio.")
  private String email;
  @NotNull(message = "O campo aceiteDigitalExigido não pode ser vazio.")
  private AceiteDigital aceiteDigitalExigido;
  @NotNull(message = "O campo pagamento não pode ser vazio.")
  private Pagamento pagamento;
}