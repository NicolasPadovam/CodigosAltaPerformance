package pilhas;

import java.sql.SQLOutput;

public class PilhaInt {

    final int N = 9;
    int[] dados = new int[N];
    int topo;

    public void init() {
        topo = 0;
    }

    public boolean isFull() {
        return (topo == N);
    }

    public void push(int elem) {
        if (isFull()) {
            System.out.println("Stack overflow");
        } else {
            dados[topo] = elem;
            topo++;
        }
    }

    public boolean isEmpty() {
        return (topo == 0);
    }

    public int pop() {
        topo--;
        return (dados[topo]);
    }


    public int top() {
        return dados[topo - 1];
    }

    public void esvazie() {
        while(!isEmpty()){
            System.out.print(pop()+ "\t");
        }
        System.out.println();
    }

}
