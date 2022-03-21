package teste.dio;

import java.util.Scanner;

public class AMudanca {
    public static void main(String[] args) {
        calculaGraos();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            long peso = 0;
            peso = (long) (Math.pow(2, x - 1) / 12000);
            System.out.println(peso + " kg");
        }
        sc.close();
    }

// 9.223.372.036.854.775.807 Valor máximo de um long

    private static void calculaGraos() {
        for (int i = 0; i < 64; i++) {
            System.out.println("Casa" + (i + 1) + ": "
                    + ((long) Math.pow(2, i)) + " grãos dividido por 12000 = "
                    + ((long) Math.pow(2, i) / 12000) + " Kg");
        }
    }
}
