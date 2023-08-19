package com.example;

import java.time.LocalDate;

public class Cidadao {
  private LocalDate dataNascimento;

  public LocalDate getDataNascimento() {
    return dataNascimento;
  }

  public void setDataNascimento(LocalDate dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  public int idade() {
    return LocalDate.now().getYear() - dataNascimento.getYear();
  }

  public String typeEleitor(){
    int idade = idade();
    if(idade > 15) {
      if(idade < 18 || idade > 70) {
        return "E eleitor facultativo";
      }
      return "E eleitor obrigatorio";
    }
    return "Nao e eleitor";    
  }
}
