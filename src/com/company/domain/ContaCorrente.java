package com.company.domain;

public class ContaCorrente extends Conta{

    public ContaCorrente(double saldo) {
        super(saldo);
    }

    @Override
    public void atualiza(double taxa) {
        super.atualiza(taxa*2);
    }
}
