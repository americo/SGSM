package com.isutc;

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
        System.out.println("TIPO: ");
        String produtoTipo = teclado.next();
        System.out.print("PREÇO: ");
        double produtoPreco = teclado.nextDouble();
        System.out.print("Quantidade: ");
        int produtoQuantidade = teclado.next();
        System.out.print("ID: ");
        int produtoId = teclado.next();

        Produto pr1 = new Produto(produtoNome, produtoTipo, produtoPreco, produtoQuantidade, produtoId);

    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("-- MENU --" +
                "\n1. Clientes" +
                "\n2. Produtos" +
                "\n3. Inventarios" +
                "\n4. Relatorios");

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
        } else {
            System.out.println("Opcao Invalida");
        }

        // Cliente cl1 = new Cliente("Carlos", 18, "Matola", 1);
        // Produto pr1 = new Produto("Lord Gin", "Bebida", 150, 6, 1);

        // System.out.println(cl1);

    }
}
