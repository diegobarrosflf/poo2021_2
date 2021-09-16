package com.company.domain;

public class Gerente extends Funcionario{

    private int senha;
    private int numeroDeFuncionariosGerenciados;

    public Gerente(String nome, String cpf, double salario, int senha, int numeroDeFuncionariosGerenciados) {
        super(nome, cpf, salario);
        this.senha = senha;
        this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
    }

    public boolean autentica(int senha) {
        if (this.senha == senha) {
            System.out.println("Acesso permitido");
            return true;
        } else {
            System.out.println("Acesso negado!!");
            return false;
        }
    }

    @Override
    public double getBonificacao() {
        /*return super.getBonificacao() + this.getSalario()*0.05;*/
        return this.getSalario() * 0.15;
    }
}
