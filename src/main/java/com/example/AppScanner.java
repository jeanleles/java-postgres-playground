package com.example;

import java.util.Scanner;

public class AppScanner {
  public static void main(String[] args) {
    Cliente cliente = new Cliente();

    Scanner scanner = new Scanner(System.in); 
    System.out.println("Digite o nome: ");
    cliente.setNome(scanner.nextLine());

    System.out.println("Digite o Sexo (M/F): ");
    String sexo = scanner.nextLine();
    cliente.setSexo(sexo.charAt(0));

    System.out.println("Ano Nascimento: ");
    cliente.setAnoNascimento(scanner.nextInt());

    System.out.println("Digite a Renda: ");
    cliente.setRenda(scanner.nextDouble());


    // cliente.setRenda(9002.02);
    // cliente.setSexo('M');
    // cliente.setAnoNascimento(1996);

    System.out.println("Nome: " + cliente.getNome());
    System.out.println("Renda: R$" + cliente.getRenda());
    System.out.println("Sexo: " + cliente.getSexo());
    System.out.println("Ano Nascimento: " + cliente.getAnoNascimento()); 
    System.out.println("Especial: " + cliente.isEspecial());     
    
    
  }
}