// package com.example;

// import java.beans.Statement;
// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.SQLException;

// public class App {
//     public static void main(String[] args) {
//         try {
//             Class. forName ("org.postgresql.Driver");
//         } catch (ClassNotFoundException e) {
//             System.err.println("Nao foi possivel carregar a biblioteca para acesso ao banco de dados: " + e.getMessage());
//         }

//         Statement statement = null;
//         try(var conn = DriverManager.getConnection("jdbc:postgresql://localhost/postgres", "gitpod", "")){
//             System.out.println("Conexao com banco de dados realiazada com sucesso 😍");
            
//             statement = conn.createStatement()
//             var result = statement.executeQuery("select * from estado");

//         }
//     }
// }
