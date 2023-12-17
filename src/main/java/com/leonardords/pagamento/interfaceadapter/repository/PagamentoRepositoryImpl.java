package com.leonardords.pagamento.interfaceadapter.repository;

import com.leonardords.pagamento.core.domain.Pagamento;
import com.leonardords.pagamento.core.usecase.dto.CriarPagamentoData;
import com.leonardords.pagamento.interfaceadapter.http.ApiResources;
import com.leonardords.pagamento.interfaceadapter.mapper.PagamentoMapper;
import java.util.Map;
import java.util.Objects;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PagamentoRepositoryImpl implements PagamentoRepository {

  @NonNull
  private final ApiResources resources;

  @Override
  public Pagamento gravarPagamento(final @NonNull Map<String, String> headers, final @NonNull CriarPagamentoData data) {
    final var gravarPagamentoData = PagamentoMapper.INSTANCE.toGravarPagamentoData(data);

    final var response = Objects.requireNonNull(resources.gravarPagamento(headers, gravarPagamentoData));

    return PagamentoMapper.INSTANCE.toPagamento(response);
  }
}
