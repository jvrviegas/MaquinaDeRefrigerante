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
    public static void limpatela() { System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"); }
    
    public static void main(String args[]) {
        ArrayList<Refrigerante> refrigerantes = new ArrayList<>();
        ArrayList<Moeda> moedas = new ArrayList<>();   
        Scanner sc = new Scanner(System.in);
        int opcao = -1, opc = -1;
        double dinheiro;
        
        Refrigerante refri01 = new Refrigerante("Coca-Cola", 0, 0);
        Refrigerante refri02 = new Refrigerante("Guaraná Jesus", 0, 0);
        Refrigerante refri03 = new Refrigerante("Guaraná Antárctica", 0, 0);
        Refrigerante refri04 = new Refrigerante("Pepsi", 0, 0);
        Refrigerante refri05 = new Refrigerante("Sprite", 0, 0);
        Refrigerante refri06 = new Refrigerante("Fanta Laranja", 0, 0);
        
        Moeda moeda10 = new Moeda(10, 0);        
        Moeda moeda05 = new Moeda(5, 0);
        Moeda moeda02 = new Moeda(2, 0);
        Moeda moeda01 = new Moeda(1, 0);
        Moeda moeda050 = new Moeda(0.5, 0);
   
        while(opcao != 0){
            System.out.println("------------------ MÁQUINA DE REFRIGERANTE ---------------------\n");
            System.out.println("Menu:\n1. Gerenciar refrigerantes \n2. Gerenciar moedas \n3. Iniciar máquina \n0. Sair");
            System.out.println("Opção:");
            opcao = sc.nextInt();
            opc = -1;
            switch(opcao){
                case 1:
                    while(opc != 0){
                        System.out.println("------------------- GERENCIAR REFRIGERANTES -------------------\n");
                        System.out.println("Selecione qual refrigerante deseja alterar:");
                        System.out.println("1. Coca-Cola - Quantidade disponível: "+refri01.getQtd()+" | Preço: R$"+refri01.getPreco()+
                                "\n2. Guaraná Jesus - Quantidade disponível: "+refri02.getQtd()+" | Preço: R$"+refri02.getPreco()+
                                "\n3. Guaraná Antárctica - Quantidade disponível: "+refri03.getQtd()+" | Preço: R$"+refri03.getPreco()+
                                "\n4. Pepsi - Quantidade disponível: "+refri04.getQtd()+" | Preço: R$"+refri04.getPreco()+
                                "\n5. Sprite - Quantidade disponível: "+refri05.getQtd()+" | Preço: R$"+refri05.getPreco()+
                                "\n6. Fanta Laranja - Quantidade disponível: "+refri06.getQtd()+" | Preço: R$"+refri06.getPreco()+
                                "\n0. Voltar");
                        System.out.println("Opção:");
                        opc = sc.nextInt();
                        switch(opc){
                            case 1:
                                System.out.println("------------ ALTERAR COCA-COLA --------------\n");
                                System.out.println("Informe a quantidade que deseja inserir:");
                                refri01.setQtd(sc.nextInt());
                                System.out.println("Informe o preço do refrigerante:");
                                refri01.setPreco(sc.nextDouble());
                                break;
                            case 2:
                                System.out.println("------------ ALTERAR GUARANÁ JESUS --------------\n");
                                System.out.println("Informe a quantidade que deseja inserir:");
                                refri02.setQtd(sc.nextInt());
                                System.out.println("Informe o preço do refrigerante:");
                                refri02.setPreco(sc.nextDouble());
                                break;
                            case 3:
                                System.out.println("------------ ALTERAR GUARANÁ ANTÁRCTICA --------------\n");
                                System.out.println("Informe a quantidade que deseja inserir:");
                                refri03.setQtd(sc.nextInt());
                                System.out.println("Informe o preço do refrigerante:");
                                refri03.setPreco(sc.nextDouble());
                                break;
                            case 4:
                                System.out.println("------------ ALTERAR PEPSI --------------\n");
                                System.out.println("Informe a quantidade que deseja inserir:");
                                refri04.setQtd(sc.nextInt());
                                System.out.println("Informe o preço do refrigerante:");
                                refri04.setPreco(sc.nextDouble());
                                break;
                            case 5:
                                System.out.println("------------ ALTERAR SPRITE --------------\n");
                                System.out.println("Informe a quantidade que deseja inserir:");
                                refri05.setQtd(sc.nextInt());
                                System.out.println("Informe o preço do refrigerante:");
                                refri05.setPreco(sc.nextDouble());
                                break;
                            case 6:
                                System.out.println("------------ ALTERAR FANTA LARANJA --------------\n");
                                System.out.println("Informe a quantidade que deseja inserir:");
                                refri06.setQtd(sc.nextInt());
                                System.out.println("Informe o preço do refrigerante:");
                                refri06.setPreco(sc.nextDouble());
                                break;
                            default:
                                if(opc != 0)
                                    System.out.println("Opção inválida, tente novamente!");
                        }
                    }
                    break;
                case 2:
                    while(opc != 0){
                        System.out.println("------------------- GERENCIAR MOEDAS -------------------\n");
                        System.out.println("Selecione qual moeda deseja alterar a quantidade:");
                        System.out.println("1. R$0,50 - Quantidade disponível: "+moeda050.getQtd()+
                                "\n2. R$1,00 - Quantidade disponível: "+moeda01.getQtd()+
                                "\n3. R$2,00 - Quantidade disponível: "+moeda02.getQtd()+
                                "\n4. R$5,00 - Quantidade disponível: "+moeda05.getQtd()+
                                "\n5. R$10,00 - Quantidade disponível: "+moeda10.getQtd()+
                                "\n0. Voltar");
                        System.out.println("Opção:");
                        opc = sc.nextInt();
                        switch(opc){
                            case 1:
                                System.out.println("------------ ALTERAR R$0,50 --------------\n");
                                System.out.println("Informe a quantidade que deseja inserir:");
                                moeda050.setQtd(sc.nextInt());
                                break;
                            case 2:
                                System.out.println("------------ ALTERAR R$1,00 --------------\n");
                                System.out.println("Informe a quantidade que deseja inserir:");
                                moeda01.setQtd(sc.nextInt());
                                break;
                            case 3:
                                System.out.println("------------ ALTERAR R$2,00 --------------\n");
                                System.out.println("Informe a quantidade que deseja inserir:");
                                moeda02.setQtd(sc.nextInt());
                                break;
                            case 4:
                                System.out.println("------------ ALTERAR R$5,00 --------------\n");
                                System.out.println("Informe a quantidade que deseja inserir:");
                                moeda05.setQtd(sc.nextInt());
                                break;
                            case 5:
                                System.out.println("------------ ALTERAR R$10,00 --------------\n");
                                System.out.println("Informe a quantidade que deseja inserir:");
                                moeda10.setQtd(sc.nextInt());
                                break;
                            default:
                                if(opc != 0)
                                    System.out.println("Opção inválida, tente novamente!");
                        }
                    }
                    break;
                case 3:
                    Refrigerante escolhido;
                    limpatela();
                    refrigerantes.add(refri01);
                    refrigerantes.add(refri02);
                    refrigerantes.add(refri03);
                    refrigerantes.add(refri04);
                    refrigerantes.add(refri05);
                    refrigerantes.add(refri06);

                    moedas.add(moeda10);
                    moedas.add(moeda05);
                    moedas.add(moeda02);
                    moedas.add(moeda01);
                    moedas.add(moeda050);
                    Maquina maquina = new Maquina(refrigerantes, moedas);
                    
                    // Código 999 - Acesso área administrativa
                    while(opc != 999){
                        double troco = 0;
                        System.out.println("------------------ MÁQUINA DE REFRIGERANTE ---------------------\n");
                        System.out.println("Selecione o refrigerante:");
                        System.out.println("1. Coca-Cola - R$"+maquina.buscarRefrigerante("Coca-Cola").getPreco()+
                                "\n2. Guaraná Jesus - R$"+maquina.buscarRefrigerante("Guaraná Jesus").getPreco()+
                                "\n3. Guaraná Antárctica - R$"+maquina.buscarRefrigerante("Guaraná Antárctica").getPreco()+
                                "\n4. Pepsi - R$"+maquina.buscarRefrigerante("Pepsi").getPreco()+
                                "\n5. Sprite - R$"+maquina.buscarRefrigerante("Sprite").getPreco()+
                                "\n6. Fanta Laranja - R$"+maquina.buscarRefrigerante("Fanta Laranja").getPreco()
                        );                        
                        System.out.println("Opção:");
                        opc = sc.nextInt();
                        System.out.println("\nInsira o dinheiro: R$");
                        dinheiro = sc.nextDouble();
                        switch(opc){
                            case 1:
                                escolhido = maquina.buscarRefrigerante("Coca-Cola");
                                if(dinheiro >= escolhido.getPreco()){
                                    if(escolhido.getQtd() > 0){
                                        troco = maquina.geraTroco(dinheiro, escolhido.getPreco());
                                        if(troco > -1){
                                            System.out.println("Refrigerante: "+escolhido.getSabor()+"\nTroco: R$"+troco);
                                        }
                                        else{
                                            System.out.println("Não há troco disponível, por favor insira uma quantida menor.");
                                        }
                                    }
                                    else{
                                        System.out.println("Refrigerante indisponível no momento!");
                                    }
                                }
                                else{
                                    System.out.println("Dinheiro insuficiente");
                                }
                                break;
                            case 2:
                                escolhido = maquina.buscarRefrigerante("Guaraná Jesus");
                                if(dinheiro >= escolhido.getPreco()){
                                    if(escolhido.getQtd() > 0){
                                        troco = maquina.geraTroco(dinheiro, escolhido.getPreco());
                                        if(troco > -1){
                                            System.out.println("Refrigerante: "+escolhido.getSabor()+"\nTroco: R$"+troco);
                                        }
                                        else{
                                            System.out.println("Não há troco disponível, por favor insira uma quantida menor.");
                                        }
                                    }
                                    else{
                                        System.out.println("Refrigerante indisponível no momento!");
                                    }
                                }
                                else{
                                    System.out.println("Dinheiro insuficiente");
                                }
                                break;
                            case 3:
                                escolhido = maquina.buscarRefrigerante("Guaraná Antárctica");
                                if(dinheiro >= escolhido.getPreco()){
                                    if(escolhido.getQtd() > 0){
                                        troco = maquina.geraTroco(dinheiro, escolhido.getPreco());
                                        if(troco > -1){
                                            System.out.println("Refrigerante: "+escolhido.getSabor()+"\nTroco: R$"+troco);
                                        }
                                        else{
                                            System.out.println("Não há troco disponível, por favor insira uma quantida menor.");
                                        }
                                    }
                                    else{
                                        System.out.println("Refrigerante indisponível no momento!");
                                    }
                                }
                                else{
                                    System.out.println("Dinheiro insuficiente");
                                }
                                break;
                            case 4:
                                escolhido = maquina.buscarRefrigerante("Pepsi");
                                if(dinheiro >= escolhido.getPreco()){
                                    if(escolhido.getQtd() > 0){
                                        troco = maquina.geraTroco(dinheiro, escolhido.getPreco());
                                        if(troco > -1){
                                            System.out.println("Refrigerante: "+escolhido.getSabor()+"\nTroco: R$"+troco);
                                        }
                                        else{
                                            System.out.println("Não há troco disponível, por favor insira uma quantida menor.");
                                        }
                                    }
                                    else{
                                        System.out.println("Refrigerante indisponível no momento!");
                                    }
                                }
                                else{
                                    System.out.println("Dinheiro insuficiente");
                                }
                                break;
                            case 5:
                                escolhido = maquina.buscarRefrigerante("Sprite");
                                if(dinheiro >= escolhido.getPreco()){
                                    if(escolhido.getQtd() > 0){
                                        troco = maquina.geraTroco(dinheiro, escolhido.getPreco());
                                        if(troco > -1){
                                            System.out.println("Refrigerante: "+escolhido.getSabor()+"\nTroco: R$"+troco);
                                        }
                                        else{
                                            System.out.println("Não há troco disponível, por favor insira uma quantida menor.");
                                        }
                                    }
                                    else{
                                        System.out.println("Refrigerante indisponível no momento!");
                                    }
                                }
                                else{
                                    System.out.println("Dinheiro insuficiente");
                                }
                                break;
                            case 6:
                                escolhido = maquina.buscarRefrigerante("Fanta Laranja");
                                if(dinheiro >= escolhido.getPreco()){
                                    if(escolhido.getQtd() > 0){
                                        troco = maquina.geraTroco(dinheiro, escolhido.getPreco());
                                        if(troco > -1){
                                            System.out.println("Refrigerante: "+escolhido.getSabor()+"\nTroco: R$"+troco);
                                        }
                                        else{
                                            System.out.println("Não há troco disponível, por favor insira uma quantida menor.");
                                        }
                                    }
                                    else{
                                        System.out.println("Refrigerante indisponível no momento!");
                                    }
                                }
                                else{
                                    System.out.println("Dinheiro insuficiente");
                                }
                                break;
                            default:
                                if(opc != 999)
                                    System.out.println("Opção inválida");
                        }
                    }
                    
                    break;
                default:
                    if(opcao != 0)
                        System.out.println("Opção inválida, tente novamente!");
            }
        }
    }
}