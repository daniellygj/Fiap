package com.praticando.tdd.service;


import com.praticando.tdd.enums.FormaDePagamento;

public class DescontoService {

    public double calcularDesconto(double valorDaCompra, FormaDePagamento formaDePagamento) {
        return valorDaCompra * formaDePagamento.percentualDesconto();
    }

}