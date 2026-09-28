import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int n1 = sc.nextInt();
        System.out.print("Digite o segundo numero: ");
        int n2 = sc.nextInt();

        int menor = Math.min(n1, n2);
        int maior = Math.max(n1, n2);
        int contImpares = 0;

        for (int i = menor; i <= maior; i++) {
            if (i % 2 != 0) {
                contImpares++;
            }
        }

        System.out.println("Quantidade de numeros impares: " + contImpares);
        sc.close();
    }
}
