/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquinaderefrigerante;

import java.util.ArrayList;

/**
 *
 * @author joaovvr
 */
public class Maquina {

    private ArrayList<Refrigerante> refrigerantes = new ArrayList<>();
    private ArrayList<Moeda> moedas = new ArrayList<>();

    public Maquina(ArrayList<Refrigerante> refrigerantes, ArrayList<Moeda> moedas) {
        this.refrigerantes = refrigerantes;
        this.moedas = moedas;
    }

    public Refrigerante buscarRefrigerante(String sabor) {
        for (int i = 0; i < this.refrigerantes.size(); i++) {
            if (refrigerantes.get(i).getSabor().equals(sabor)) {
                return refrigerantes.get(i);
            }
        }
        return null;
    }

    public int verificaQtdRefri(String sabor) {
        Refrigerante refri = this.buscarRefrigerante(sabor);
        if (refri != null && refri.getQtd() > 0) {
            return refri.getQtd();
        }
        return -1;
    }

    public Moeda buscarMoeda(double valor) {
        for (int i = 0; i < this.moedas.size(); i++) {
            if (moedas.get(i).getValor() == valor) {
                return moedas.get(i);
            }
        }
        return null;
    }

    public int verificaQtdMoeda(double valor) {
        Moeda moeda = this.buscarMoeda(valor);
        if (moeda != null && moeda.getQtd() > 0) {
            return moeda.getQtd();
        }
        return -1;
    } 
    
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
