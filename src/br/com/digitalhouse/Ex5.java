package br.com.digitalhouse;

public class Ex5 {
    public static void main(String[] args) {
        Integer[] numeros;
        numeros = new Integer[4];

        Integer soma;
        Integer i;

        numeros[0] = 20;
        numeros[1] = 5;
        numeros[2] = 10;
        numeros[3] = 0;

        for(Integer i = 0, i < 4, i++){
            if (numeros[i]%2 = 0){
                soma = soma + numeros[i];
            }
        }

        System.out.println(soma);
    }
}
