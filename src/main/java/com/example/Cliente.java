package com.example;

public class Cliente {
  private double renda;
  private char sexo;
  private int anoNascimento;

  public double getRenda(){
    return renda;
  }

  public char getSexo() {
    return sexo;
  }

  public int getAnoNascimento() {
    return anoNascimento;
  }

  public void setRenda(double renda) {
    if(renda < 0)
      System.out.println("A renda nao pode ser menor do que zero.");
    else this.renda = renda;
  }

  public void setSexo(char sexo) {
    if(sexo == 'M' || sexo == 'F')
      this.sexo = sexo;
    else System.out.println("O sexo deve ser M ou F.");
  }

  public void setAnoNascimento(int anoNascimento) {
    this.anoNascimento = anoNascimento;
  }
}