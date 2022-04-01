package com.praticando.tdd.service;


import com.praticando.tdd.enums.FormaDePagamento;

public class DescontoService {

    public double calcularDesconto(double valorDaCompra, FormaDePagamento formaDePagamento) {
        if (formaDePagamento == FormaDePagamento.DINHEIRO) {
            return valorDaCompra * 0.1;
        }
        return 0;
    }
}