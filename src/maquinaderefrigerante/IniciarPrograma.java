/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquinaderefrigerante;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author joaovvr
 */
public class IniciarPrograma {
    public static void main(String args[]){
        ArrayList<Refrigerante> refrigerantes = new ArrayList<>();
        ArrayList<Moeda> moedas = new ArrayList<>();   
        
        Refrigerante refri01 = new Refrigerante("Coca Cola", 5, 2);
        Refrigerante refri02 = new Refrigerante("Guaraná Jesus", 2, 2);
        Moeda moeda01 = new Moeda(1, 10);
        Moeda moeda02 = new Moeda(2, 10);
        Moeda moeda03 = new Moeda(5, 10);

        refrigerantes.add(refri01);
        refrigerantes.add(refri02);
        moedas.add(moeda03); moedas.add(moeda02); moedas.add(moeda01);
        Scanner sc = new Scanner(System.in);
        String sabor;
        
        Maquina maquina = new Maquina(refrigerantes, moedas);
        
        double troco = maquina.geraTroco(10, 5);
        System.out.println("Troco: R$"+troco);
        
    }
}