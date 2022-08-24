//Trabalho TDE para Grafos
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("ESTUDOS DE GRAFO");

        Grafo<String> grafo = new Grafo<String>();
        grafo.adicionarVertice("A");
        grafo.adicionarVertice("B");
        grafo.adicionarVertice("C");

        

        
        grafo.cria_adj(2.0, "A", "B");
        grafo.cria_adj(2.0, "A", "C");

        grafo.imprime_adjacencias();

        /*
        for (int i = 0; i < grafo.arestasList.size(); i++) {
            System.out.println(grafo.arestasList.get(i).inicio.dado);
            System.out.println(grafo.arestasList.get(i).fim.dado);
        }
        */

        //grafo.print();
        
        
    }
}
