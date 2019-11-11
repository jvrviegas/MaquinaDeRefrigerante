/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquinaderefrigerante;


/**
 *
 * @author joaovvr
 */
public class Refrigerante {
    private String sabor;
    private double preco;
    private int qtd;

    public Refrigerante(String sabor, double preco, int quantidade) {
        this.sabor = sabor;
        this.preco = preco;
        this.qtd = quantidade;
    }
    
    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int quantidade) {
        this.qtd = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public void decrementaQtd(){
        this.qtd--;
    }
    
}
