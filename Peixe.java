public class Peixe {
  private String nome;
  private double peso;
  public Peixe(String nome, double peso) {
    this.nome = nome;
    this.peso = peso;
  }

  public String getNome() {
    return this.nome;
  }
  public double getPeso() {
    return this.peso;
  }

  @Override
  public String toString() {
    return "Peixe("+this.nome+", "+this.peso+")";
  }
}
