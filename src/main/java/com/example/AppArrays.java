package com.example;

import java.util.Arrays;

public class AppArrays {
  public static void main(String[] args) {
    double vetorDoble1[] = {10, 20, 30};
    // System.out.println("Valor posicao 0:" + vetor[0]);
    // System.out.println("Valor posicao 1:" + vetor[1]);
    // System.out.println("Valor posicao 2:" + vetor[2]);
    for(int i=0; i<vetorDoble1.length; i++) {
      System.out.println("Valor posicao "+ i + ": " + vetorDoble1[i]);
    }

    int vetor3[] = new int[4];
    vetor3[0] = 100;
    vetor3[1] = 200;
    vetor3[2] = 300;
    vetor3[3] = 400;
    System.out.println(Arrays.toString(vetor3));

    double matrix[][] = {{10, 20, 30}, {40, 50, 60}};
    System.out.println(Arrays.toString(matrix[0]));
    System.out.println(Arrays.toString(matrix[1]));
    
    matrix[0] = new double[]{1, 2, 3, 4, 5};
    System.out.println(Arrays.toString(matrix[0]));
    
    double matrix2[][] = new double[5][3];
    for (int i = 0; i < matrix2.length; i++) {
      for (int j = 0; j < matrix2[i].length; j++) {
        matrix2[i][j] = (i * matrix2[i].length + j+1) * 10; 
      }
    }
    System.out.println("********************");
    for (int i = 0; i < matrix2.length; i++) {
      for (int j = 0; j < matrix2[i].length; j++) {
        System.out.printf("%5.1f ", matrix2[i][j]); 
      }
      System.err.println();
    }
  } 
}
