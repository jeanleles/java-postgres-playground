package com.example;

import java.util.ArrayList;
import java.util.List;

public class AppListas {
  public static void main(String[] args) {
    List<Cliente> listaClientes = new ArrayList<>();
    var cliente1 = new Cliente();
    cliente1.setNome("Jean");
    cliente1.setSexo('M');

    var cliente2 = new Cliente();
    cliente2.setNome("Maria");
    cliente2.setSexo('F');

    listaClientes.add(cliente1);
    listaClientes.add(cliente2);  
    listaClientes.add(cliente1);
    listaClientes.add(cliente2);
    listaClientes.add(cliente1);

    for (var cliente : listaClientes) {
      System.out.println(cliente);
    }
    listaClientes.remove(cliente2);

    System.out.println("**********************");
    for (var cliente : listaClientes) {
      System.out.println(cliente);
    }

    int tamanho = listaClientes.size() - 1;
    listaClientes.remove(tamanho);

    System.out.println("+++++++++++++++++++");
    for (var cliente : listaClientes) {
      System.out.println(cliente);
    }
  }
}
