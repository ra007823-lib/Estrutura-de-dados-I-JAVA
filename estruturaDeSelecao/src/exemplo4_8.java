import java.util.Scanner;

public class exemplo4_8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a, b, c;

        System.out.print("Informe o lado A: ");
        a = Integer.parseInt(scanner.nextLine());

        System.out.print("Informe o lado B: ");
        b = Integer.parseInt(scanner.nextLine());

        System.out.print("Informe o lado C: ");
        c = Integer.parseInt(scanner.nextLine());

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