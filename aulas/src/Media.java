import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n1, n2, n3;

        System.out.println("Digite o primeiro número:");
        n1 = sc.nextFloat();

        System.out.println("Digite o segundo número:");
        n2 = sc.nextFloat();

        System.out.println("Digite o terceiro número:");
        n3 = sc.nextFloat();

        float media = (n1 + n2 + n3) / 3;

        System.out.printf("A média é: %.2f", media);

        sc.close();
    }
}
