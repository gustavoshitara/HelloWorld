package br.com.digitalhouse;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Integer umNumeroA;
        Double umNumeroB;
        String umaCadeiaDeTexto;

        umNumeroA = 10;
        umNumeroB = 20.0;
        umaCadeiaDeTexto = "Cadeia de texto do Gustavo";

        System.out.println(umNumeroA);
        System.out.println(umNumeroB);
        System.out.println(umaCadeiaDeTexto);

        System.out.println("Soma de A + B = " + (umNumeroA + umNumeroB));
        System.out.println("Subtração de A - B = " + (umNumeroA - umNumeroB));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero:");
        umNumeroA = scanner.nextInt();
        System.out.println("Recebi: " + umNumeroA);
    }
}
