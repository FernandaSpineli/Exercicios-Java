package com.academia.capgemini.questao.tres;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {

        //Variáveis
        String palavra;

        //Para ler a entrada de dados
        Scanner leia = new Scanner(System.in);

        //Lógica
        System.out.println("Digite o texto : ");
        palavra = leia.nextLine();

        //Vou chamar uma função para ficar melhor a compreensão
        anagrama(palavra);
    }


    //Criando uma função
    static void anagrama( String palavra ){

        //Armazena o valor dos caracteres colocados
        HashMap<String, Integer> mapa = new HashMap<>();

        //Lógica
        for(int i  = 0; i <= palavra.length(); i++){


            for( int j = i; j < palavra.length(); j++ ){

                //Variável para armazer os caracteres
                char[] caracter = palavra.substring(i, j+1).toCharArray();
                Arrays.sort(caracter);
                String subCaract = new String(caracter);

                //Verifica cada substring
                if(mapa.containsKey(subCaract)){
                    mapa.put(subCaract, mapa.get(subCaract) + 1);
                }
                else{
                    mapa.put(subCaract,1);
                }
            }
        }

        //Para fazer a verificação dos anagramas
        int contaPares = 0;

        for(String cont: mapa.keySet()) {

            int n = mapa.get(cont);
            contaPares += (n*(n-1))/2;
        }
        System.out.print("Quantidade de pares que são anagramas é de "
                + contaPares);
    }
}
