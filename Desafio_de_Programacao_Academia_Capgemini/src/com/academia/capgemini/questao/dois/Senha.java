package com.academia.capgemini.questao.dois;


public class Senha {
    public static void main(String[] args) {
        Senha a = new Senha("jzdnkvdu");
        a.ValidarNumero();
        a.ValidarMaiuscula();
        a.ValidarMinuscula();
        a.ValidarSimbolo();
        a.ValidarSenha();

    }
   String senha;
   int count;
   boolean achouNumero;
   boolean achouMaiuscula;
   boolean achouMinuscula;
   boolean achouSimbolo;

    public Senha(String senha) {
        this.senha = senha;
    }

    public int ValidarNumero(){
       if(senha.contains("0") || senha.contains("1") ||
               senha.contains("2") || senha.contains("3") ||
               senha.contains("4") || senha.contains("5") ||
               senha.contains("6") || senha.contains("7") ||
               senha.contains("8") || senha.contains("9")){
           achouNumero = true;
       }else{
           count ++;
       }
       return count;
   }
    public int ValidarMinuscula(){
        if(senha.contains("a") || senha.contains("b") ||
                senha.contains("c") || senha.contains("d") ||
                senha.contains("e") || senha.contains("f") ||
                senha.contains("g") || senha.contains("h") ||
                senha.contains("i") || senha.contains("j") ||
                senha.contains("k") || senha.contains("l") ||
                senha.contains("m") || senha.contains("n") ||
                senha.contains("o") || senha.contains("p") ||
                senha.contains("q") || senha.contains("r") ||
                senha.contains("s") || senha.contains("t") ||
                senha.contains("u") || senha.contains("v") ||
                senha.contains("w") || senha.contains("x") ||
                senha.contains("y") || senha.contains("z")){
            achouMinuscula= true;
        }else{
            count ++;
        }
        return count;
    }
    public int ValidarMaiuscula(){
        if(senha.contains("A") || senha.contains("b") ||
                senha.contains("C") || senha.contains("D") ||
                senha.contains("E") || senha.contains("F") ||
                senha.contains("G") || senha.contains("H") ||
                senha.contains("I") || senha.contains("J") ||
                senha.contains("K") || senha.contains("L") ||
                senha.contains("M") || senha.contains("N") ||
                senha.contains("O") || senha.contains("P") ||
                senha.contains("Q") || senha.contains("R") ||
                senha.contains("S") || senha.contains("T") ||
                senha.contains("U") || senha.contains("V") ||
                senha.contains("W") || senha.contains("X") ||
                senha.contains("Y") || senha.contains("Z")) {
            achouMaiuscula = true;
        } else{
            count ++;
        }
        return count;
    }
    public int ValidarSimbolo(){
        if(senha.contains("(") || senha.contains("@") ||
                senha.contains("2") || senha.contains("#") ||
                senha.contains("-") || senha.contains("$") ||
                senha.contains("+") || senha.contains("%") ||
                senha.contains(")") || senha.contains("^") ||
                senha.contains("*") || senha.contains("&")){
            achouSimbolo = true;
        } else{
            count ++;
        }
        return count;
    }

    public void ValidarSenha(){
       if(senha.length() < 6){
           count = 6 - senha.length();
           System.out.println(count);
       }else{
           System.out.println(count);
       }
    }

}