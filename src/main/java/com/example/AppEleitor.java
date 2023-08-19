package com.example;

import java.time.LocalDate;

public class AppEleitor {
  public static void main(String[] args) {
     var cidado = new Cidadao();
     cidado.setDataNascimento(LocalDate.of(1940, 10, 1));
     System.out.println(cidado.idade());
     System.out.println(cidado.typeEleitor());
  }
}
