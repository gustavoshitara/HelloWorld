package br.com.digitalhouse;

public class Ex3 {
    public static void main(String[] args) {
        System.out.println(verificarNumeroImparMaior10(12));
    }

    public static boolean verificarNumeroImparMaior10(Integer a){
        return a % 2 != 0 && a > 10;
    }
}
