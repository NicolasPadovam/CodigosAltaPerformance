package ListasEncadeadas;

public class ListaEncadeada {
    public static void main(String[] args) {
        NO lista = new NO();

        lista.dado = 1;
        lista.prox = null;

        NO novo = new NO();
        novo.dado = 2;
        novo.prox = null;

        //apontar a prox lista
        lista.prox = novo;

        NO novo2 = new NO();
        novo2.dado=3;
        novo2.prox=lista;

        //exercicio - 1
        System.out.println("\n\nApos inserir o 3o ListasEncadeadas.NO");
        System.out.println("novo2: "+novo2+"\t dado: "+novo2.dado+"\t prox: "+novo2.prox);
        System.out.println("Lista: "+lista+"\t dado: "+lista.dado+"\t prox: "+lista.prox);
        System.out.println("novo: "+novo+"\t dado: "+novo.dado+"\t prox: "+novo.prox);

        //exercicio - 2
        lista = novo;
        System.out.println("\nLista depois exercicio 2: "+lista);

        //exercicio - 3
        System.out.println("\nApresentacao dos dados contidos na lista");
        NO aux = lista;
        while (aux != null){
            System.out.println("aux dado: "+aux.dado);
            aux = aux.prox;
        }

        //exercicio - 4 (encaixe no meio da lista)
        // aux = lista.prox;
        //ListasEncadeadas.NO novo = new ListasEncadeadas.NO();
        //novo.dado = 4;
        //novo.prox = aux.prox;
        //aux.prox = novo;






    }
}

