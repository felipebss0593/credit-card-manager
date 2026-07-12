package com.felipe.creditcardmanager;
import com.felipe.creditcardmanager.model.Card;
import com.felipe.creditcardmanager.model.Customer;
import com.felipe.creditcardmanager.service.Bank;

import java.util.Scanner;

/**
 * Ponto de entrada do sistema de cartão de crédito.
 * Exibe o menu interativo e direciona para as operações do sistema.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();

        int option = 1;

        while(option != 0){
            System.out.println("=== SISTEMA DE CARTÃO DE CRÉDITO ===");
            System.out.println("1 - Cadastrar cliente");
            System.out.println("2 - Cadastrar cartão para um cliente");
            System.out.println("3 - Cadastrar compra");
            System.out.println("4 - Ver compras aprovadas");
            System.out.println("5 - Ver compras recusadas");
            System.out.println("6 - Ver histórico completo (ordenado por data)");
            System.out.println("7 - Ver maior compra");
            System.out.println("8 - Ver menor compra");
            System.out.println("9 - Ver valor total gasto por cliente");
            System.out.println("10 - Ver limite disponível de um cartão");
            System.out.println("0 - Sair");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1: {
                    System.out.println("Digite o nome do cliente:");
                    String name = scanner.nextLine();
                    Customer customer = bank.addCustomer(name);
                    System.out.println("Cliente cadastrado com sucesso!");
                    System.out.println(customer);
                    break;
                }
                case 2: {
                    System.out.println("Qual o Id do cliente:");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    Customer customer = bank.findCustomerById(id);
                    if(customer == null){
                        System.out.println("Cliente não existe.");
                    }else{
                        Card card = new Card(customer);
                        System.out.println("Cartão criado com sucesso.");
                        System.out.println(card);
                    }
                    break;
                }
                case 3: {
                    //tres
                    break;
                }
                case 4: {
                    //quatro
                    break;
                }
                case 5: {
                    //cinco
                    break;
                }
                case 6: {
                    //seis
                    break;
                }
                case 7: {
                    //sete
                    break;
                }
                case 8: {
                    //oito
                    break;
                }
                case 9: {
                    //nove
                    break;
                }
                case 10: {
                    //dez
                    break;
                }
                default: {
                    //erro
                    break;
                }
            }

        }


    }
}
