package com.leonardords.pagamento.interfaceadapter.delegate;

import com.leonardords.pagamento.core.domain.Pagamento;
import com.leonardords.pagamento.core.usecase.dto.CriarPagamentoData;
import java.util.Map;

public interface PagamentoDelegate {

  Pagamento gravarPagamento(Map<String, String> headers, CriarPagamentoData data);
}
