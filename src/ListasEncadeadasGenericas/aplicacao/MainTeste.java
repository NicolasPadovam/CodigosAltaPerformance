package ListasEncadeadasGenericas.aplicacao;

import ListasEncadeadasGenericas.lista.ListaIntCrescente;

import java.util.Scanner;

public class MainTeste {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ListaIntCrescente lista = new ListaIntCrescente();

        System.out.println("Informe valor positivo para  inserir (negativo para sair)");
        int valor = sc.nextInt();

        while (valor >= 0){
            lista.add(valor);
            lista.mostra();
            System.out.println("Informe valor positivo para  inserir (negativo para sair)");
            valor = sc.nextInt();
        }

        System.out.println("Informe valor positivo para remover (negativo para sair)");
        valor = sc.nextInt();

        while (valor >= 0){
            lista.remove(valor);
            lista.mostra();
            System.out.println("Informe valor positivo para remover (negativo para sair)");
            valor = sc.nextInt();
        }








        sc.close();
    }
}
