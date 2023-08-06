package com.example;

public class AppClasses {
  public static void main(String[] args) {
    Cliente cliente = new Cliente();
    cliente.setRenda(9002.02);
    cliente.setSexo('M');
    cliente.setAnoNascimento(1996);

    System.out.println("Renda: R$" + cliente.getRenda());
    System.out.println("Sexo: " + cliente.getSexo());
    System.out.println("Ano Nascimento: " + cliente.getAnoNascimento());    
  }
}