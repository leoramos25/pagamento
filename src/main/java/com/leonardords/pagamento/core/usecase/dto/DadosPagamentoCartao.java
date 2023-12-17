package com.leonardords.pagamento.core.usecase.dto;

import com.leonardords.pagamento.core.usecase.dto.enuns.Emissor;
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
public class DadosPagamentoCartao implements DadosPagamento {

  @NotNull(message = "O campo emissor não pode ser vazio.")
  private Emissor emissor;
  @NotNull(message = "O campo numero não pode ser vazio.")
  private String numero;
  @NotNull(message = "O campo nomeImpresso não pode ser vazio.")
  private String nomeImpresso;
  @NotNull(message = "O campo mesValidade não pode ser vazio.")
  private Integer mesValidade;
  @NotNull(message = "O campo anoValidade não pode ser vazio.")
  private Integer anoValidade;
  @NotNull(message = "O campo cpfTitular não pode ser vazio.")
  private String cpfTitular;
}
