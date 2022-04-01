package com.praticando.tdd.service;

import com.praticando.tdd.enums.FormaDePagamento;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class DescontoServiceTest {

    @Test
    void deveConcederDescontoQuandoPagamentoAVistaEmDinheiro() {

        DescontoService descontoService = new DescontoService();
        double desconto = descontoService.calcularDesconto(1000.00, FormaDePagamento.DINHEIRO);
        double descontoEsperado = 100.00;
        Assertions.assertThat(desconto).isEqualTo(descontoEsperado);
    }

    @Test

    void deveConcederDescontoQuandoPagamentoAVistaNoDebito() {
        DescontoService descontoService = new DescontoService();
        double desconto = descontoService.calcularDesconto( 1000.00, FormaDePagamento.DEBITO);
        double descontoEsperado = 60.00;
        Assertions.assertThat(desconto).isEqualTo(descontoEsperado);
    }
}
