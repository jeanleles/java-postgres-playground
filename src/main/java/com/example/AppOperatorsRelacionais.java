package com.example;

public class AppOperatorsRelacionais {
  public static void main(String[] args) {
    var cliente1 = new Cliente();
    cliente1.setAnoNascimento(1999); 
    var cliente2 = new Cliente();
    cliente2.setAnoNascimento(1991);

    if (cliente1.getAnoNascimento() == cliente2.getAnoNascimento()) {
      System.out.println("Clientes 1 e 2 nasceram no mesmo ano!");
    }
    else {
      System.out.println("Clientes 1 e 2 nasceram em anos diferntes.");
    }
    
    boolean cliente1MaisJovem = cliente1.getAnoNascimento() > cliente2.getAnoNascimento();
    boolean cliente1MaisVelho = cliente1.getAnoNascimento() < cliente2.getAnoNascimento();
    System.out.println("------------------------");
    if(cliente1MaisJovem) {
      System.out.println("Cliente1 eh mais jovem");
    }
    else if (cliente1MaisVelho) {
      System.out.println("Cliente1 eh mais velho");
    }
    else System.out.println("Clientes 1 e 2 tem a mesma idade!");
  }
}
