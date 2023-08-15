package com.example;

public class Cliente {
  private String nome;
  private double renda;
  private char sexo;
  private int anoNascimento;
  private boolean especial;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public boolean isEspecial() {
    return especial;
  }

  public void setEspecial(boolean especial) {
    this.especial = especial;
  }

  //Constructor
  public Cliente(){
    System.out.println("Criando cliente com Construtor sem parametro...");
    double aleatorio = Math.random();
    if(aleatorio > 0.5)
      especial = true;
  }

  public Cliente(double renda, char sexo) {
    this();
    System.out.println("Criando cliente com Contrutor com parametro****");
    setRenda(renda);
    //this.renda = renda;
    this.sexo = sexo;
  }

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