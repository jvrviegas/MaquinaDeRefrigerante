/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquinaderefrigerante;

import Interface.TelaInicial;
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
        Scanner sc = new Scanner(System.in);
        int opcao;
        
        Refrigerante refri01 = new Refrigerante("Coca Cola", 0, 0);
        Refrigerante refri02 = new Refrigerante("Guaraná Jesus", 0, 0);
        Refrigerante refri03 = new Refrigerante("Guaraná Antárctica", 0, 0);
        Refrigerante refri04 = new Refrigerante("Pepsi", 0, 0);
        Refrigerante refri05 = new Refrigerante("Sprite", 0, 0);
        Refrigerante refri06 = new Refrigerante("Fanta Laranja", 0, 0);
        
        Moeda moeda04 = new Moeda(10, 0);        
        Moeda moeda03 = new Moeda(5, 0);
        Moeda moeda02 = new Moeda(2, 0);
        Moeda moeda01 = new Moeda(1, 0);
       
        System.out.println("------------------ MÁQUINA DE REFRIGERANTE ---------------------\n");
        System.out.println("Menu:\n1. Adicionar refrigerantes \n2. Adicionar moedas \n3. Iniciar máquina");
        System.out.println("Opção:");
        opcao = sc.nextInt();

        refrigerantes.add(refri01);
        refrigerantes.add(refri02);
        moedas.add(moeda03); moedas.add(moeda02); moedas.add(moeda01);
        String sabor = null;
        
        Maquina maquina = new Maquina(refrigerantes, moedas);
        /*
        double troco = maquina.geraTroco(10, 3);
        if(troco >= 0){
            if(maquina.verificaQtdRefri(sabor) > 0){
                Refrigerante refriCliente = maquina.buscarRefrigerante(sabor);

            }
        }
        else{
            System.out.println("Troco insuficiente!");
        }
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });*/
    }
}