package com.alineselle;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Collection<Produto> produtos = new HashSet();//esssa coleção HashSet não permite adicionar dois produtos iguais
        System.out.println("######### Cadastro de Produtos ##########\n");

        Scanner entrada = new Scanner(System.in);

        String continuar = "s";

        while ("s".equalsIgnoreCase(continuar)) {
            System.out.println("SKU: ");
            String sku = entrada.nextLine();

            System.out.println("Nome: ");
            String nome = entrada.nextLine();

            Produto produto = new Produto(sku, nome);
            if (produtos.contains(produto)) {
                System.err.println("Esse produto já foi adicionado. Utilize outro SKU!");
                System.err.flush();
            } else {

                produtos.add(produto);
                System.out.println("Produto adicionado.");
            }

            System.out.println("Deseja adicionar mais algum produto? (s/n)");
            continuar = entrada.nextLine();
        }
        for (Produto produto: produtos){

            System.out.println(produto);

        }

        System.out.println("Fim");
    }
}

