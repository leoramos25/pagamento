package com.leonardords.pagamento.interfaceadapter.http.dto;

import lombok.Builder;

@Builder
public record GravarPagamentoResponse(
    String mensagem,
    String origem
) {

}
