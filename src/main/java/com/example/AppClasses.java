package com.example;

public class AppClasses {
  public static void main(String[] args) {
    Cliente cliente1 = new Cliente();
    cliente1.setRenda(9002.02);
    cliente1.setSexo('M');
    cliente1.setAnoNascimento(1996);

    System.out.println("Renda: R$" + cliente1.getRenda());
    System.out.println("Sexo: " + cliente1.getSexo());
    System.out.println("Ano Nascimento: " + cliente1.getAnoNascimento()); 
    System.out.println("Especial: " + cliente1.isEspecial());     
    
    Cliente cliente2 = new Cliente(3000, 'F');
    // cliente2.setRenda(7800.92);
    // cliente2.setSexo('F');
    cliente2.setAnoNascimento(1994);

    System.out.println("Renda: R$" + cliente2.getRenda());
    System.out.println("Sexo: " + cliente2.getSexo());
    System.out.println("Ano Nascimento: " + cliente2.getAnoNascimento());
    System.out.println("Especial: " + cliente2.isEspecial());
    //Fim  
  }
}