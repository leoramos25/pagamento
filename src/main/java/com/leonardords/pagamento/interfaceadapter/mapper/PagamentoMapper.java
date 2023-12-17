package com.leonardords.pagamento.interfaceadapter.mapper;

import com.leonardords.pagamento.core.domain.Pagamento;
import com.leonardords.pagamento.core.usecase.dto.CriarPagamentoData;
import com.leonardords.pagamento.core.usecase.dto.DadosPagamentoCartao;
import com.leonardords.pagamento.core.usecase.dto.DadosPagamentoDebitoConta;
import com.leonardords.pagamento.core.usecase.dto.enuns.AceiteDigital;
import com.leonardords.pagamento.core.usecase.dto.enuns.Emissor;
import com.leonardords.pagamento.core.usecase.dto.enuns.FormaPagamento;
import com.leonardords.pagamento.core.usecase.dto.enuns.Periodicidade;
import com.leonardords.pagamento.core.usecase.dto.enuns.TipoConta;
import com.leonardords.pagamento.interfaceadapter.http.dto.GravarPagamentoData;
import com.leonardords.pagamento.interfaceadapter.http.dto.GravarPagamentoResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface PagamentoMapper {

  PagamentoMapper INSTANCE = Mappers.getMapper(PagamentoMapper.class);

  Pagamento toPagamento(GravarPagamentoResponse response);

  @Mapping(target = "aceiteDigitalExigido", source = "aceiteDigitalExigido", qualifiedByName = "toAceiteDigital")
  @Mapping(target = ".", source = ".", qualifiedByName = "toPagamento")
  GravarPagamentoData toGravarPagamentoData(CriarPagamentoData data);

  @Named("toPagamento")
  default GravarPagamentoData toPagamento(com.leonardords.pagamento.core.usecase.dto.Pagamento pagamento) {
    if (pagamento == null) {
      return null;
    }

    var builder = GravarPagamentoData.builder()
        .dgRef(pagamento.getPreAgendado().getDgRef())
        .dataRegistro(pagamento.getPreAgendado().getDataRegistro())
        .periodicidade(toPeriodicidade(pagamento.getPeriodicidade()))
        .diaPagamento(pagamento.getDiaPagamento())
        .formaPagamento(toFormaPagamento(pagamento.getFormaPagamento()));

    switch (pagamento.getFormaPagamento()) {
      case DEBITO_EM_CONTA:
        var dadosConta = (DadosPagamentoDebitoConta) pagamento.getDadosPagamento();
        builder
            .codigoBanco(dadosConta.getCodigoBanco())
            .codigoAgencia(dadosConta.getCodigoAgencia())
            .numeroConta(dadosConta.getNumeroConta())
            .tipoConta(toTipoConta(dadosConta.getTipoConta()));
        break;
      case CARTAO_DE_CREDITO:
        var dadosCartao = (DadosPagamentoCartao) pagamento.getDadosPagamento();
        builder
            .emissor(toEmissor(dadosCartao.getEmissor()))
            .numero(dadosCartao.getNumero())
            .nomeImpresso(dadosCartao.getNomeImpresso())
            .mesValidade(dadosCartao.getMesValidade())
            .anoValidade(dadosCartao.getAnoValidade())
            .cpfTitular(dadosCartao.getCpfTitular());
        break;
    }

    return builder.build();
  }

  default Integer toEmissor(Emissor emissor) {
    if (emissor == null) {
      return null;
    }

    return emissor.getValue();
  }

  @Named("toAceiteDigital")
  default Integer toAceiteDigital(AceiteDigital aceiteDigital) {
    if (aceiteDigital == null) {
      return null;
    }
    return aceiteDigital.getValor();
  }

  default String toTipoConta(TipoConta tipoConta) {
    if (tipoConta == null) {
      return null;
    }
    return tipoConta.getValor();
  }

  default Integer toPeriodicidade(Periodicidade periodicidade) {
    if (periodicidade == null) {
      return null;
    }
    return periodicidade.getValor();
  }

  default Integer toFormaPagamento(FormaPagamento formaPagamento) {
    if (formaPagamento == null) {
      return null;
    }
    return formaPagamento.getValor();
  }
}
