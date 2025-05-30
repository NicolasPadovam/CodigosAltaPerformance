package Fila.ex03;

import java.util.Scanner;

public class AtendimentoAlunos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("1 - Insere na fila");
            System.out.println("2 - Retira na fila");
            System.out.println("3 - Encerra atendimento");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("Encerrano atendimentp");
                    break;
                default:
                    System.out.println("opcao Invalida");
            }
        } while (opcao != 3);{
            sc.close();
        }


    }
}
