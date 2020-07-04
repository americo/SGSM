package com.isutc;

import java.io.*;
import java.util.Scanner;

public class Arranque {

    public static void criarCliente() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("NOME: ");
        String clienteNome = teclado.next();
        System.out.print("IDADE: ");
        int clienteIdade = teclado.nextInt();
        System.out.print("MORADA: ");
        String clienteMorada = teclado.next();
        System.out.print("ID: ");
        int clienteId = teclado.nextInt();

        Cliente cl1 = new Cliente(clienteNome, clienteIdade, clienteMorada, clienteId);
    }

    public static void criarProduto() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("NOME: ");
        String produtoNome = teclado.next();
        System.out.print("TIPO: ");
        String produtoTipo = teclado.next();
        System.out.print("PREÇO: ");
        double produtoPreco = teclado.nextDouble();
        System.out.print("Quantidade: ");
        int produtoQuantidade = teclado.nextInt();
        System.out.print("ID: ");
        int produtoId = teclado.nextInt();

        Produto pr1 = new Produto(produtoNome, produtoTipo, (float) produtoPreco, produtoQuantidade, produtoId);
    }

    public static void vendaDinheiro() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("ID do Cliente: ");
        int clienteId = teclado.nextInt();
        System.out.print("Quantidade de produtos comprados: ");
        int quantidadeProdutosComprados = teclado.nextInt();
        for (int i=0; i < quantidadeProdutosComprados; i++) {
            System.out.print("Nome do Produto: ");
            String produtoNome = teclado.next();
        }
    }

    public static void inventarioCliente() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("ID do Cliente: ");
        int clienteId = teclado.nextInt();
        System.out.println("\nINVENTÁRIO DO CLIENTE\n");
    }

    public static void relatorioStock() {
        System.out.println("Stock Negativo: ");
        System.out.println("Produtos abaixo de 5 unidades: ");
        System.out.println("Produtos mais vendidos: ");
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("-- MENU --" +
                "\n1. Clientes" +
                "\n2. Produtos" +
                "\n3. Inventarios" +
                "\n4. Venda a Dinheiro" +
                "\n5. Relatorios");
        System.out.print("\nOpcao > ");
        int opcao = teclado.nextInt();
        if (opcao == 1) {
            System.out.println("\n1. Criar Cliente" +
                    "\n2. Actualizar Cliente" +
                    "\n3. Remover Cliente");
            int opcaoCliente = teclado.nextInt();
                    if (opcaoCliente == 1) {
                        criarCliente();
                    }
        } else if (opcao == 2) {
            System.out.println("\n1.1. Criar Produto" +
                    "\n1.2. Actualizar Produto" +
                    "\n1.3. Remover Produto");

            int opcaoProduto = teclado.nextInt();
                    if (opcaoProduto == 1) {
                        criarProduto();
                    }
        } else if (opcao == 3) {
            inventarioCliente();
        } else if (opcao == 4) {
            vendaDinheiro();
        } else if (opcao == 5) {
            relatorioStock();
        }


    }
}
