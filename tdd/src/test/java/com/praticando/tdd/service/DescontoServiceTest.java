package com.praticando.tdd.service;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class DescontoServiceTest {

    @Test

    @Test

    void deveConcederDescontoQuandoPagamentoAVistaEmDinheiro() {

        DescontoService descontoService = new DescontoService();
        double desconto = descontoService.calcularDesconto(1000.00, FormaDePagamento.DINHEIRO);
        double descontoEsperado = 100.00;
        Assertions.assertThat(desconto).isEqualTo(descontoEsperado);
    }
}
