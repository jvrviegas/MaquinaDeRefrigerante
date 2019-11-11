/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquinaderefrigerante;

import java.util.ArrayList;


public class Maquina {

    private ArrayList<Refrigerante> refrigerantes = new ArrayList<>();
    private ArrayList<Moeda> moedas = new ArrayList<>();

    public Maquina(ArrayList<Refrigerante> refrigerantes, ArrayList<Moeda> moedas) {
        this.refrigerantes = refrigerantes;
        this.moedas = moedas;
    }

    // Método para buscar e retornar o refrigerante com base no nome (sabor)
    public Refrigerante buscarRefrigerante(String sabor) {
        for (int i = 0; i < this.refrigerantes.size(); i++) {
            if (refrigerantes.get(i).getSabor().equals(sabor)) {
                return refrigerantes.get(i);
            }
        }
        return null;
    }

    // Método para buscar e retornar a moeda com base no seu valor
    public Moeda buscarMoeda(double valor) {
        for (int i = 0; i < this.moedas.size(); i++) {
            if (moedas.get(i).getValor() == valor) {
                return moedas.get(i);
            }
        }
        return null;
    }
    
    // Método para verificar se é possível gerar troco, caso seja, retorna o valor do troco, do contrário retorna -1
    public double geraTroco(double dinheiro, double valor) {
        double troco = dinheiro - valor;
        double valorTroco = 0;
        int i = 0;
        while (troco > 0) {
            if (troco >= moedas.get(i).getValor() && moedas.get(i).getQtd() > 0) {
                moedas.get(i).decrementaQtd();
                valorTroco += moedas.get(i).getValor();
                troco -= moedas.get(i).getValor();
            }
            else if (troco < moedas.get(i).getValor()) {
                i++;
            }
            else{
                return -1;
            }
        }
        return valorTroco;
    }
}
