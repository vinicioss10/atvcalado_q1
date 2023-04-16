import java.util.Scanner;
import java.util.function.IntFunction;

public class App {
    /*
     * Nome do Aluno: Vinicios Santos de Sá
     * RA: 722313791
     * Nome do Programa: Estrutura de Operadores Logicos
     * Data: 16.04.23
     */

    // Faça um programa que leia dois números A e B e imprima o maior
    public static void main(String[] args) throws Exception {
        int n1;
        int n2;
        Scanner dig;

        dig = new Scanner(System.in);

        System.out.println("digite o primeiro numero :");
        n1 = dig.nextInt();
        System.out.println("digite o segundo numero :");
        n2 = dig.nextInt();

        if (n1 > n2) {
            System.out.println("o numero " + n1 + " é maior");
        }
        if (n1 < n2) {
            System.out.println("o numero " + n2 + " é maior");
        }

    }
}
