package controller;

import java.util.Scanner;

public class AlunoController {
    
  public void calc() {
  Scanner scanner = new Scanner(System.in);
  
  int Opcao;
          double Valor1;
          double Valor2;
          double Resultado;
          System.out.println();
          System.out.println("Calculadora em Java");
          System.out.println();
          System.out.println("Adição");
          System.out.println("Subtração");
          System.out.println("Multiplicação");
          System.out.println("Divisão");
          System.out.println();
          System.out.println("Escolha a opção:");
          Opcao = scanner.nextInt();

          switch (Opcao) {
              case 1 -> {
                  System.out.println("Adição");
                  System.out.println("Entre com o primeiro valor");
                  Valor1 = scanner.nextDouble();
                  System.out.println("Entre com o segundo valor");
                  Valor2 = scanner.nextDouble();
                  Resultado = Valor1 + Valor2;
                  System.out.println("O Resultado é:" +Resultado);
                  break;
          }
              case 2 -> {
                  System.out.println("Subtração");
                  System.out.println("Entre com o primeiro valor");
                  Valor1 = scanner.nextDouble();
                  System.out.println("Entre com o segundo valor");
                  Valor2 = scanner.nextDouble();
                  Resultado = Valor1 - Valor2;
                  System.out.println("O Resultado é:" +Resultado);
                  break;
          }
              case 3 -> {
                  System.out.println("Multiplicação");
                  System.out.println("Entre com o primeiro valor");
                  Valor1 = scanner.nextDouble();
                  System.out.println("Entre com o segundo valor");
                  Valor2 = scanner.nextDouble();
                  Resultado = Valor1 * Valor2;
                  System.out.println("O Resultado é:" +Resultado);
                  break;
          }
               case 4 -> {
                   System.out.println("Divisão");
                   System.out.println("Entre com o primeiro valor");
                   Valor1 = scanner.nextDouble();
                   System.out.println("Entre com o segundo valor");
                   Valor2 = scanner.nextDouble();
                   Resultado = Valor1 / Valor2;
                   System.out.println("O Resultado é:" +Resultado);
                   break;
               
          }

          }
          
  }

    public void conta() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}