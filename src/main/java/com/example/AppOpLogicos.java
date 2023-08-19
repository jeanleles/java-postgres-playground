package com.example;

public class AppOpLogicos {
  boolean a(boolean valor){
    System.out.println("A");
    return valor;
  }

  boolean b(boolean valor){
    System.out.println("B");
    return valor;
  }

  boolean c(boolean valor){
    System.out.println("C");
    return valor;
  }

  AppOpLogicos(){
    System.out.println(a(true) && b(true) || c(false));
  }
  public static void main(String[] args) {
    new AppOpLogicos();    
  }
}
