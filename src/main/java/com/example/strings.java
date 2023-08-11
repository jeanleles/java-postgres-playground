package com.example;

public class strings {
  public static void main(String[] args) {
    String nome = "Jean Leles";
    String cpf = "1234567890";
    String cpf2 = new String("1234567890");
    System.out.println(nome.toUpperCase());

    if (cpf.equals(cpf2)) {
      System.out.println("CPF repetido");
    }
    else {
       System.out.println("CPF OK!");
    }
  }
}
