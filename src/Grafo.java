import java.util.ArrayList;

public class Grafo<T> {
    public ArrayList<Vertice<T>> verticesList;
    public ArrayList<Aresta<T>> arestasList;

    public Grafo() {
        verticesList = new ArrayList<Vertice<T>>();
        arestasList = new ArrayList<Aresta<T>>();
    }

    public void adicionarVertice(T dado) {
        var newVertice = new Vertice<T>(dado);
        this.verticesList.add(newVertice);
    }

    public void adicionarAresta(Double peso, T dadoInicio, T dadoFim) {
        Vertice<T> inicio = this.obtemVertice(dadoInicio);
        Vertice<T> fim = this.obtemVertice(dadoFim);

        Aresta<T> aresta = new Aresta<>(peso, inicio, fim);

        inicio.adicionarArestaSaida(aresta);
        fim.adicionarArestaSaida(aresta);

        arestasList.add(aresta);

    }

    public Vertice<T> obtemVertice(T dado) {
        Vertice<T> vertice = null;
        for (int i = 0; i < this.verticesList.size(); i++) {
            if (this.verticesList.get(i).dado.equals(dado)) {
                vertice = this.verticesList.get(i);
                break;
            }
        }

        return vertice;
    }
}
