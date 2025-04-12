/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadoraemjava;

public class Calculadora {

    private double valorA;
    private double valorB;

    public Calculadora() {
        this(0, 0);
    }

    public Calculadora(double valorA, double valorB) {
        setValorA(valorA);
        setValorB(valorB);
    }

    public double getValorA() {
        return valorA;
    }

    public double getValorB() {
        return valorB;
    }

    public void setValorA(double valorA) {
        this.valorA = valorA;
    }

    public void setValorB(double valorB) {
        this.valorB = valorB;
    }

    public double getSoma() {
        return getValorA() + getValorB();
    }

    public double getDiferenca() {
        return getValorA() - getValorB();
    }

    public double getProduto() {
        return getValorA() * getValorB();
    }

    public double getQuociente() {
        if (valorB == 0) {
            throw new ArithmeticException("Divisão por zero");
        }
        return getValorA() / getValorB();
    }
}
