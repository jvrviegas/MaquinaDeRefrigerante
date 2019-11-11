/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquinaderefrigerante;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class IniciarPrograma {
    // Função para exibir várias quebras de linha com o intuito de "limpar" o console
    public static void limpatela() { System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"); }
    
    public static void main(String args[]) throws IOException {
        ArrayList<Refrigerante> refrigerantes = new ArrayList<>();
        ArrayList<Moeda> moedas = new ArrayList<>();   
        Scanner sc = new Scanner(System.in);
        int opcao = -1, opc;
        double dinheiro;
        
        // Cria os refrigerantes e define seus valores e quantidades como sendo 0
        Refrigerante refri01 = new Refrigerante("Coca-Cola", 0, 0);
        Refrigerante refri02 = new Refrigerante("Guaraná Jesus", 0, 0);
        Refrigerante refri03 = new Refrigerante("Guaraná Antárctica", 0, 0);
        Refrigerante refri04 = new Refrigerante("Pepsi", 0, 0);
        Refrigerante refri05 = new Refrigerante("Sprite", 0, 0);
        Refrigerante refri06 = new Refrigerante("Fanta Laranja", 0, 0);
        
        // Cria as moedas e define suas quantidades como sendo 0
        Moeda moeda10 = new Moeda(10, 0);        
        Moeda moeda05 = new Moeda(5, 0);
        Moeda moeda02 = new Moeda(2, 0);
        Moeda moeda01 = new Moeda(1, 0);
        Moeda moeda050 = new Moeda(0.5, 0);
   
        // Laço para iterar o menu principal enquanto o usuário não digitar 0
        while(opcao != 0){
            System.out.println("------------------ MÁQUINA DE REFRIGERANTE ---------------------\n");
            System.out.println("Menu:\n1. Gerenciar refrigerantes \n2. Gerenciar moedas \n3. Iniciar máquina \n0. Sair");
            System.out.println("Opção:");
            opcao = sc.nextInt();
            opc = -1;
            switch(opcao){
                // Opção para acesso ao menu de gerenciar refrigerantes
                case 1:
                    // Laço para iterar o menu de gerenciamento de refrigerantes
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
                        
                        // Switch para realizar a alteração da quantidade e preço do refrigerante conforme a opção escolhida
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
                    
                // Opção para acesso ao menu de gerenciar moedas
                case 2:
                    // Laço para iterar o menu de gerenciamento de moedas
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
                        
                        // Switch para realizar a alteração da quantidade da moeda conforme a opção escolhida
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
                    
                // Opção para iniciar a máquina de refrigerante    
                case 3:
                    Refrigerante escolhido;
                    limpatela();
                    
                    // Prepara os refrigerantes para serem adicionados à máquina, adicionando-os primeiro a um array
                    refrigerantes.add(refri01);
                    refrigerantes.add(refri02);
                    refrigerantes.add(refri03);
                    refrigerantes.add(refri04);
                    refrigerantes.add(refri05);
                    refrigerantes.add(refri06);
                    
                    // Prepara as moedas para serem adicionadas à máquina, adicionando-as primeiro a um array
                    moedas.add(moeda10);
                    moedas.add(moeda05);
                    moedas.add(moeda02);
                    moedas.add(moeda01);
                    moedas.add(moeda050);
                    
                    // Cria a máquina e atribui os arrays de refrigerantes e moedas à ela
                    Maquina maquina = new Maquina(refrigerantes, moedas);
                    
                    // Laço para iterar o menu da máquina de refrigerante - OBS: o código 999 retorna ao menu administrativo
                    while(opc != 999){
                        double troco;
                        System.out.println("------------------ MÁQUINA DE REFRIGERANTE ---------------------\n");
                        System.out.println("Selecione o refrigerante:");
                        System.out.println("1. Coca-Cola - R$"+maquina.buscarRefrigerante("Coca-Cola").getPreco()+
                                "\n2. Guaraná Jesus - R$"+maquina.buscarRefrigerante("Guaraná Jesus").getPreco()+
                                "\n3. Guaraná Antárctica - R$"+maquina.buscarRefrigerante("Guaraná Antárctica").getPreco()+
                                "\n4. Pepsi - R$"+maquina.buscarRefrigerante("Pepsi").getPreco()+
                                "\n5. Sprite - R$"+maquina.buscarRefrigerante("Sprite").getPreco()+
                                "\n6. Fanta Laranja - R$"+maquina.buscarRefrigerante("Fanta Laranja").getPreco()
                        );

                        // Recebe a opção de refrigerante e o dinheiro
                        System.out.println("Opção:");
                        opc = sc.nextInt();
                        System.out.println("\nInsira o dinheiro: R$");
                        dinheiro = sc.nextDouble();
                        
                        // Switch para realizar as operações conforme a escolha do refrigerante
                        switch(opc){
                            case 1:
                                escolhido = maquina.buscarRefrigerante("Coca-Cola");
                                // Verifica se o dinheiro recebido é maior que o valor do refrigerante
                                if(dinheiro >= escolhido.getPreco()){
                                    // Verifica se existe quantidade disponível do refrigerante
                                    if(escolhido.getQtd() > 0){
                                        troco = maquina.geraTroco(dinheiro, escolhido.getPreco());
                                        // Verifica se há troco disponível
                                        if(troco > -1){
                                            // Retorna o refrigerante escolhido e o troco
                                            maquina.buscarRefrigerante("Coca-Cola").decrementaQtd();
                                            System.out.println("Refrigerante: "+escolhido.getSabor()+"\nTroco: R$"+troco);
                                            System.out.println("\nAperte enter para continuar");
                                            System.in.read();
                                        }
                                        else{
                                            System.out.println("Não há troco disponível, por favor insira uma quantida menor.");
                                            System.out.println("\nAperte enter para continuar");
                                            System.in.read();
                                        }
                                    }
                                    else{
                                        System.out.println("Refrigerante indisponível no momento!");
                                        System.out.println("\nAperte enter para continuar");
                                        System.in.read();
                                    }
                                }
                                else{
                                    System.out.println("Dinheiro insuficiente");
                                    System.out.println("\nAperte enter para continuar");
                                    System.in.read();
                                }
                                break;
                            case 2:
                                escolhido = maquina.buscarRefrigerante("Guaraná Jesus");
                                // Verifica se o dinheiro recebido é maior que o valor do refrigerante
                                if(dinheiro >= escolhido.getPreco()){
                                    // Verifica se existe quantidade disponível do refrigerante
                                    if(escolhido.getQtd() > 0){
                                        troco = maquina.geraTroco(dinheiro, escolhido.getPreco());
                                        // Verifica se há troco disponível
                                        if(troco > -1){
                                            // Retorna o refrigerante escolhido e o troco
                                            maquina.buscarRefrigerante("Guaraná Jesus").decrementaQtd();
                                            System.out.println("Refrigerante: "+escolhido.getSabor()+"\nTroco: R$"+troco);
                                            System.out.println("\nAperte enter para continuar");
                                            System.in.read();
                                        }
                                        else{
                                            System.out.println("Não há troco disponível, por favor insira uma quantida menor.");
                                            System.out.println("\nAperte enter para continuar");
                                            System.in.read();
                                        }
                                    }
                                    else{
                                        System.out.println("Refrigerante indisponível no momento!");
                                        System.out.println("\nAperte enter para continuar");
                                        System.in.read();
                                    }
                                }
                                else{
                                    System.out.println("Dinheiro insuficiente");
                                    System.out.println("\nAperte enter para continuar");
                                    System.in.read();
                                }
                                break;
                            case 3:
                                escolhido = maquina.buscarRefrigerante("Guaraná Antárctica");
                                // Verifica se o dinheiro recebido é maior que o valor do refrigerante
                                if(dinheiro >= escolhido.getPreco()){
                                    // Verifica se existe quantidade disponível do refrigerante
                                    if(escolhido.getQtd() > 0){
                                        troco = maquina.geraTroco(dinheiro, escolhido.getPreco());
                                        // Verifica se há troco disponível
                                        if(troco > -1){
                                            // Retorna o refrigerante escolhido e o troco
                                            maquina.buscarRefrigerante("Guaraná Antárctica").decrementaQtd();
                                            System.out.println("Refrigerante: "+escolhido.getSabor()+"\nTroco: R$"+troco);
                                            System.out.println("\nAperte enter para continuar");
                                            System.in.read();
                                        }
                                        else{
                                            System.out.println("Não há troco disponível, por favor insira uma quantida menor.");
                                            System.out.println("\nAperte enter para continuar");
                                            System.in.read();
                                        }
                                    }
                                    else{
                                        System.out.println("Refrigerante indisponível no momento!");
                                        System.out.println("\nAperte enter para continuar");
                                        System.in.read();
                                    }
                                }
                                else{
                                    System.out.println("Dinheiro insuficiente");
                                    System.out.println("\nAperte enter para continuar");
                                    System.in.read();
                                }
                                break;
                            case 4:
                                escolhido = maquina.buscarRefrigerante("Pepsi");
                                // Verifica se o dinheiro recebido é maior que o valor do refrigerante
                                if(dinheiro >= escolhido.getPreco()){
                                    // Verifica se existe quantidade disponível do refrigerante
                                    if(escolhido.getQtd() > 0){
                                        troco = maquina.geraTroco(dinheiro, escolhido.getPreco());
                                        // Verifica se há troco disponível
                                        if(troco > -1){
                                            // Retorna o refrigerante escolhido e o troco
                                            maquina.buscarRefrigerante("Pepsi").decrementaQtd();
                                            System.out.println("Refrigerante: "+escolhido.getSabor()+"\nTroco: R$"+troco);
                                            System.out.println("\nAperte enter para continuar");
                                            System.in.read();
                                        }
                                        else{
                                            System.out.println("Não há troco disponível, por favor insira uma quantida menor.");
                                            System.out.println("\nAperte enter para continuar");
                                            System.in.read();
                                        }
                                    }
                                    else{
                                        System.out.println("Refrigerante indisponível no momento!");
                                        System.out.println("\nAperte enter para continuar");
                                        System.in.read();
                                    }
                                }
                                else{
                                    System.out.println("Dinheiro insuficiente");
                                    System.out.println("\nAperte enter para continuar");
                                    System.in.read();
                                }
                                break;
                            case 5:
                                escolhido = maquina.buscarRefrigerante("Sprite");
                                // Verifica se o dinheiro recebido é maior que o valor do refrigerante
                                if(dinheiro >= escolhido.getPreco()){
                                    // Verifica se existe quantidade disponível do refrigerante
                                    if(escolhido.getQtd() > 0){
                                        troco = maquina.geraTroco(dinheiro, escolhido.getPreco());
                                        // Verifica se há troco disponível
                                        if(troco > -1){
                                            // Retorna o refrigerante escolhido e o troco
                                            maquina.buscarRefrigerante("Sprite").decrementaQtd();
                                            System.out.println("Refrigerante: "+escolhido.getSabor()+"\nTroco: R$"+troco);
                                            System.out.println("\nAperte enter para continuar");
                                            System.in.read();
                                        }
                                        else{
                                            System.out.println("Não há troco disponível, por favor insira uma quantida menor.");
                                            System.out.println("\nAperte enter para continuar");
                                            System.in.read();
                                        }
                                    }
                                    else{
                                        System.out.println("Refrigerante indisponível no momento!");
                                        System.out.println("\nAperte enter para continuar");
                                        System.in.read();
                                    }
                                }
                                else{
                                    System.out.println("Dinheiro insuficiente");
                                    System.out.println("\nAperte enter para continuar");
                                    System.in.read();
                                }
                                break;
                            case 6:
                                escolhido = maquina.buscarRefrigerante("Fanta Laranja");
                                // Verifica se o dinheiro recebido é maior que o valor do refrigerante
                                if(dinheiro >= escolhido.getPreco()){
                                    // Verifica se existe quantidade disponível do refrigerante
                                    if(escolhido.getQtd() > 0){
                                        troco = maquina.geraTroco(dinheiro, escolhido.getPreco());
                                        // Verifica se há troco disponível
                                        if(troco > -1){
                                            // Retorna o refrigerante escolhido e o troco
                                            maquina.buscarRefrigerante("Fanta Laranja").decrementaQtd();
                                            System.out.println("Refrigerante: "+escolhido.getSabor()+"\nTroco: R$"+troco);
                                            System.out.println("\nAperte enter para continuar");
                                            System.in.read();
                                        }
                                        else{
                                            System.out.println("Não há troco disponível, por favor insira uma quantida menor.");
                                            System.out.println("\nAperte enter para continuar");
                                            System.in.read();
                                        }
                                    }
                                    else{
                                        System.out.println("Refrigerante indisponível no momento!");
                                        System.out.println("\nAperte enter para continuar");
                                        System.in.read();
                                    }
                                }
                                else{
                                    System.out.println("Dinheiro insuficiente");
                                    System.out.println("\nAperte enter para continuar");
                                    System.in.read();
                                }
                                break;
                            default:
                                if(opc != 999)
                                    System.out.println("Opção inválida");
                                    System.out.println("\nAperte enter para continuar");
                                    System.in.read();
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