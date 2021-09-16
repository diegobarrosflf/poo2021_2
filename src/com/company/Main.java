package com.company;

import com.company.domain.*;
import com.company.services.ControleDeBonificacoes;

public class Main {

    public static void main(String[] args) {

        ControleDeBonificacoes controle = new ControleDeBonificacoes();

        System.out.println("Projeto Banco");
        Cliente cliente1 = new Cliente("Bruno", "Av. Dominfos Olímpio, 123");
        Cliente cliente2 = new Cliente("Diego", "Rua A, 12");

        Conta conta1 = new Conta(cliente1,"1235-7","6546-8");
        Conta conta2 = new Conta(cliente2,"4322-2","6546-8");

        Gerente gerente = new Gerente(
                "Jose",
                "654987321-98",
                3500.0,
                123,
                120);
        Funcionario funcionario = new Funcionario(
                "Diegp","321645987-98",2000.0);

        System.out.println("Bonificação funcionario: " + funcionario.getBonificacao());
        controle.registra(funcionario);
        System.out.println("Bonificação Gerente: " + gerente.getBonificacao());
        controle.registra(gerente);

        Funcionario f1 = new Funcionario(
                "Samuel", "312564987-95", 3000.0);

        System.out.println("Bonificação f1: " + f1.getBonificacao());

        f1 = new Gerente(
                "João",
                "321645978-63",
                5000.0,
                3215,
                150);

        System.out.println("Bonificação f1: " + f1.getBonificacao());



    }
}
