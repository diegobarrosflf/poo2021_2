package com.company.domain;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    @Override
    public void atualiza(double taxa) {
        super.atualiza(taxa*3);
    }

    @Override
    public void deposita(double valor) {
        super.deposita(valor-0.1);
    }
}
