package com.dio.bootcamp.projeto.banco.digital;

import java.util.Scanner;

public class Conta {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        while (leitor.hasNext()) {
            int graus = leitor.nextInt();
            if (graus == 360 || graus >= 0 && graus < 90 ) System.out.println("Bom Dia!!");
            else if (graus >= 90 && graus < 180) System.out.println ("Boa Tarde!!");
            else if (graus >= 180 && graus < 270) System.out.println ( "Boa Noite!!");
            else System.out.println("Bom Dia!!");
        }
        leitor.close();
    }
}
