package com.example;

public class AppOperatorsRelacionais {
  public static void main(String[] args) {
    var cliente1 = new Cliente();
    cliente1.setAnoNascimento(1990); 
    var cliente2 = new Cliente();
    cliente2.setAnoNascimento(1990);

    if (cliente1.getAnoNascimento() == cliente2.getAnoNascimento()) {
      System.out.println("Clientes 1 e 2 nasceram no mesmo ano!");
    }
    else {
      System.out.println("Clientes 1 e 2 nasceram em anos diferntes.");
    } 
  }
}
