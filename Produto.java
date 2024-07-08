public class Produto {
  String nome;
  String categoria;
  double preco;

  public Produto(String nome, String categoria, double preco) {
    this.nome = nome;
    this.categoria = categoria;
    this.preco = preco;
  }

  @Override
  public String toString() {
    return "(" + nome + ", " + preco + ")";
  }

  public String getNome() {
    return nome;
  }

  public String getCategoria() {
    return categoria;
  }

  public double getPreco() {
    return preco;
  }
}