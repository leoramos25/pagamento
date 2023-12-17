package com.leonardords.pagamento.interfaceadapter.gateway;

import com.leonardords.pagamento.core.domain.Pagamento;
import com.leonardords.pagamento.core.usecase.dto.CriarPagamentoData;
import com.leonardords.pagamento.core.usecase.gateway.PagamentoGateway;
import com.leonardords.pagamento.interfaceadapter.repository.PagamentoRepository;
import java.util.Map;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PagamentoGatewayImpl implements PagamentoGateway {

  @NonNull
  private final PagamentoRepository pagamentoRepository;

  @Override
  public Pagamento gravarPagamento(final @NonNull Map<String, String> headers, final @NonNull CriarPagamentoData data) {
    return pagamentoRepository.gravarPagamento(headers, data);
  }
}
