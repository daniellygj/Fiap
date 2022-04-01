package com.praticando.tdd.service;


import com.praticando.tdd.enums.FormaDePagamento;

public class DescontoService {

    public double calcularDesconto(double valorDaCompra, FormaDePagamento formaDePagamento) {
        if (formaDePagamento == FormaDePagamento.DINHEIRO) {
            return valorDaCompra * 0.1;
        }  else if (formaDePagamento == FormaDePagamento.DEBITO) {
            return valorDaCompra * 0.06;
        }
        return 0;
    }
}