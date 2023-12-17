package com.leonardords.pagamento.interfaceadapter.http.dto;

import java.math.BigDecimal;
import java.time.LocalDate;
import lombok.Builder;

@Builder
public record GravarPagamentoData(
    BigDecimal premio,
    BigDecimal premioTotal,
    BigDecimal iof,
    String email,
    Integer aceiteDigitalExigido,
    Integer codigoBanco,
    String codigoAgencia,
    String numeroConta,
    String tipoConta,
    Integer periodicidade,
    Integer diaPagamento,
    Integer formaPagamento,
    Integer emissor,
    String numero,
    String nomeImpresso,
    Integer mesValidade,
    Integer anoValidade,
    String cpfTitular,
    String dgRef,
    LocalDate dataRegistro
) {

}
