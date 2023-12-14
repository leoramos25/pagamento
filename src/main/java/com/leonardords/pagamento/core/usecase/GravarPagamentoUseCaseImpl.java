package com.leonardords.pagamento.core.usecase;

import com.leonardords.pagamento.core.domain.Pagamento;
import com.leonardords.pagamento.core.usecase.dto.CriarPagamentoData;
import com.leonardords.pagamento.core.usecase.gateway.PagamentoGateway;
import java.util.Map;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class GravarPagamentoUseCaseImpl implements GravarPagamentoUseCase {

  @NonNull
  private final PagamentoGateway pagamentoGateway;

  @Override
  public Pagamento gravarPagamento(final @NonNull Map<String, String> headers, final @NonNull CriarPagamentoData data) {
    return pagamentoGateway.gravarPagamento(headers, data);
  }
}
