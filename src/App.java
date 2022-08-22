//Trabalho TDE para Grafos
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("ESTUDOS DE GRAFO");

        Grafo<String> grafo = new Grafo<String>();
        grafo.adicionarVertice("Pedro");
        grafo.adicionarVertice("Lukas");
        //grafo.adicionarVertice("Thiago");

        grafo.adicionarAresta(2.0, "Pedro", "Lukas");
    }
}
