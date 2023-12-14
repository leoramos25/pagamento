package com.leonardords.pagamento.core.usecase.gateway;


import com.leonardords.pagamento.core.domain.Pagamento;
import com.leonardords.pagamento.core.usecase.dto.CriarPagamentoData;
import java.util.Map;

public interface PagamentoGateway {

  Pagamento gravarPagamento(Map<String, String> headers, CriarPagamentoData data);
}
