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
@EqualsAndHashCode
public class DebitoConta {

  @NotNull(message = "O campo codigoBanco não pode ser vazio.")
  private Integer codigoBanco;
  @NotNull(message = "O campo codigoAgencia não pode ser vazio.")
  private String codigoAgencia;
  @NotNull(message = "O campo numeroConta não pode ser vazio.")
  private String numeroConta;
  @NotNull(message = "O campo tipoConta não pode ser vazio.")
  private TipoConta tipoConta;
}
