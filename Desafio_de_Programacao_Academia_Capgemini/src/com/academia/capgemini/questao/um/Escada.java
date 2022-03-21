package com.academia.capgemini.questao.um;

public class Escada {
    public static void main(String[] args) {
        int lines = Integer.parseInt(args[0]);

        for (int i = 1; i <= lines; i++){
            createLine(i,lines);
        }
    }

    public static void createLine(int lineNumber, int totalLines){
        String result = "";
        int whiteSpaces = (totalLines - lineNumber);

        int count = 0;

        while (count < totalLines){
            String newCharacter = (whiteSpaces > count) ? " " : "*";
            result += newCharacter;
            count ++;
        }
        System.out.println(result);
    }
}
