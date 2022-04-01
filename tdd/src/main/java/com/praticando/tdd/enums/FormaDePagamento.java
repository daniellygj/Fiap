package com.praticando.tdd.enums;

public enum FormaDePagamento {

    DINHEIRO {
        public double percentualDesconto() {
            return 0.1;
        }
    },

    DEBITO {
        public double percentualDesconto() {
            return 0.06;
        }
    },

    CREDITO {
        public double percentualDesconto() {
            return 0;
        }
    };

    public abstract double percentualDesconto();
}