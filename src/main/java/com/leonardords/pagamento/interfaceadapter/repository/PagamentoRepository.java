package com.leonardords.pagamento.interfaceadapter.repository;

import com.leonardords.pagamento.core.domain.Pagamento;
import com.leonardords.pagamento.core.usecase.dto.CriarPagamentoData;
import java.util.Map;

public interface PagamentoRepository {

  Pagamento gravarPagamento(Map<String, String> headers, CriarPagamentoData data);
}
