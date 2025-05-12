package ListasEncadeadasGenericas.lista;

public class ListaIntCrescente {

    private class NO {
        int dado;
        NO prox;
    }

    private NO lista = null;

    public void add(int elem) {
        //1º passo - alocar o no
        NO novo = new NO();
        novo.dado = elem;

        if (lista == null) {
            lista = novo;
            novo.prox = null;
        } else if (novo.dado < lista.dado) {
            novo.prox = lista;
            lista = novo;
        } else {
            NO aux = lista;
            boolean achou = false;

            while (aux.prox != null && !achou) {
                if (aux.prox.dado < novo.dado) {
                    aux = aux.prox;
                } else {
                    achou = true;
                }
            }
            novo.prox = aux.prox;
            aux.prox = novo;

        }
    }

    public void mostra() {
        System.out.println("---Elementos da lista---");
        NO aux = lista;
        while (aux != null) {
            System.out.print(aux.dado + "\t");
            aux = aux.prox;
        }
        System.out.println("\n-------------");
    }

    public boolean remove(int elem) {
        if (lista == null) {
            System.out.println("Lista vazia");
            return false;
        } else if (elem == lista.dado) {
            lista = lista.prox;
            return true;
        } else {
            NO aux = lista;
            boolean achou = false;

            while (aux.prox != null && !achou) {
                if (aux.prox.dado != elem) {
                    aux = aux.prox;
                } else
                    achou = true;
            }
            aux.prox = aux.prox.prox;
            return true;
        }

    }


}
