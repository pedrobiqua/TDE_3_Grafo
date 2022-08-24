import java.util.ArrayList;

//Trabalho TDE para Grafos
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("ESTUDOS DE GRAFO");

        ArrayList<Integer> adj = new ArrayList<Integer>();

        Grafo<String> grafo = new Grafo<String>();
        grafo.adicionarVertice("A");
        grafo.adicionarVertice("B");
        grafo.adicionarVertice("C");
        grafo.adicionarVertice("D");
        
        grafo.cria_adj(2.0, "A", "B");
        grafo.cria_adj(2.0, "A", "C");
        grafo.cria_adj(1.0, "D", "A");

        //grafo.imprime_adjacencias();

        grafo.adjacentes("A", adj);
        grafo.adjacentes("B", adj);

        
        //Mostra adjacentes
        /*
        for (int i = 0; i < adj.size(); i++) {
            System.out.print(adj.get(i) + " ");
        }
        */

        //grafo.print();
        
        
    }
}
