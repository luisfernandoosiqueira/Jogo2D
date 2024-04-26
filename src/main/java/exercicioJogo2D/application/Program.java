/*
 * Copyright (C) 2024 Luís Fernando Siqueira <luisfernandosqueiraadv@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package exercicioJogo2D.application;

/**
 *
 * @author Luís Fernando Siqueira <luisfernandosqueiraadv@gmail.com>
 * @date 26/04/2024
 * @brief Class Program
 */
import exercicioJogo2D.entities.Jogo2D;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int opcao;

        // Loop principal do programa. Executa repetidamente até que o usuário escolha sair (opção 0).
        do {
            // Apresentação do menu de opções para o usuário.
            System.out.println("\nMenu - JOGO 2D:");
            System.out.println("1. Inserir valores (6 números)");
            System.out.println("2. Sair");

            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt(); // Captura a opção escolhida pelo usuário.
            sc.nextLine();

            // Estrutura switch para tratar a opção escolhida pelo usuário.
            switch (opcao) {

                case 1:

                    System.out.print("Informe o valor de x1: ");
                    double x1 = sc.nextDouble();
                    System.out.print("Informe o valor de y1: ");
                    double y1 = sc.nextDouble();

                    System.out.print("Informe o valor de x2: ");
                    double x2 = sc.nextDouble();
                    System.out.print("Informe o valor de y2: ");
                    double y2 = sc.nextDouble();

                    System.out.print("Informe o valor de x3: ");
                    double x3 = sc.nextDouble();
                    System.out.print("Informe o valor de y3: ");
                    double y3 = sc.nextDouble();

                    Jogo2D jogo = new Jogo2D(x1, y1, x2, y2, x3, y3);

                    jogo.calcularDet();
                    jogo.verificarDistancia();

                    break;
                    
                case 2:

                    System.out.println("Saindo..."); // Mensagem de saída do programa.
                    break;
                    
                default:
                    System.out.println("Opção inválida!"); // Mensagem para opção inválida.
                    
            }
            
        } while (opcao != 2); // Condição para continuar no loop. O programa termina quando o usuário escolhe a opção 2.

        sc.close();
    }

}
