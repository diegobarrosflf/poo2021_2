package com.company.domain;

public class Conta {

    private Cliente cliente;
    private String numero;
    private String agencia;
    private double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public Conta(Cliente cliente, String numero, String agencia) {
        this.cliente = cliente;
        this.numero = numero;
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public void saca(double valor) {
        this.saldo -= valor;
    }

    public void atualiza(double taxa) {
        this.saldo += this.saldo*taxa;
    }
}
