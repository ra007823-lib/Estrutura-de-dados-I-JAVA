import java.util.*;

public class Exercicio08 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Informe o lado A: ");
        int a = scn.nextInt();

        System.out.print("Informe o lado B: ");
        int b = scn.nextInt();

        System.out.print("Informe o lado C: ");
        int c = scn.nextInt();

        if (a > 0 && b > 0 && c > 0) {

            if (a + b > c && a + c > b && b + c > a) {

                if (a != b && a != c && b != c) {
                    System.out.print("Escaleno!");
                } 
                else if (a == b && b == c) {
                    System.out.print("Equilátero!");
                } 
                else {
                    System.out.print("Isósceles!");
                }

            } 
            else {
                System.out.print("Não é um triângulo!");
            }

        } 
        else {
            System.out.print("Não é um triângulo!");
        }
    }
}