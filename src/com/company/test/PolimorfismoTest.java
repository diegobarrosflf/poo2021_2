package com.company.test;

import com.company.domain.Conta;
import com.company.domain.ContaCorrente;
import com.company.domain.ContaPoupanca;

public class PolimorfismoTest {
    public static void main(String[] args) {
        Conta conta = new Conta(1000.0);
        Conta contaCorrente = new ContaCorrente(1000.0);
        Conta contaPoupanca = new ContaPoupanca(1000.0);

        conta.atualiza(0.01);
        contaCorrente.atualiza(0.01);
        contaPoupanca.atualiza(0.01);

        System.out.println(conta.getSaldo());
        System.out.println(contaCorrente.getSaldo());
        System.out.println(contaPoupanca.getSaldo());
    }
}
