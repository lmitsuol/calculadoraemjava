/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadoraemjava;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        String opcao = "";
        Calculadora calculadora = new Calculadora();

        while (!opcao.equals("9")) {
            opcao = JOptionPane.showInputDialog(
                    "1 - Leitura\n"
                    + "2 - Adição\n"
                    + "3 - Subtração\n"
                    + "4 - Multiplicação\n"
                    + "5 - Divisão\n"
                    + "9 - Sair"
            );

            switch (opcao) {
                case "1":
                    double valorA = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor A:"));
                    double valorB = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor B:"));
                    calculadora.setValorA(valorA);
                    calculadora.setValorB(valorB);
                    break;
                case "2":
                    JOptionPane.showMessageDialog(null, "Soma: " + calculadora.getSoma());
                    break;
                case "3":
                    JOptionPane.showMessageDialog(null, "Diferença: " + calculadora.getDiferenca());
                    break;
                case "4":
                    JOptionPane.showMessageDialog(null, "Produto: " + calculadora.getProduto());
                    break;
                case "5":
                    try {
                        JOptionPane.showMessageDialog(null, "Quociente: " + calculadora.getQuociente());
                    } catch (ArithmeticException e) {
                        JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
                    }
                    break;
                case "9":
                    JOptionPane.showMessageDialog(null, "Encerrando a calculadora...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        }
    }
}
