package com.leonardords.pagamento.interfaceadapter.http;

import com.leonardords.pagamento.interfaceadapter.http.dto.GravarPagamentoData;
import com.leonardords.pagamento.interfaceadapter.http.dto.GravarPagamentoResponse;
import java.util.Map;

public interface ApiResources {

  GravarPagamentoResponse gravarPagamento(Map<String, String> headers, GravarPagamentoData data);
}
