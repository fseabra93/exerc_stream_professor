import java.util.List;

public class Pedido {
  private List<Item> itens;
  private String formaDePagamento;

  public Pedido(String formaDePagamento, List<Item> itens) {
    this.formaDePagamento = formaDePagamento;
    this.itens = itens;
  }

  public List<Item> getItens() {
    return this.itens;
  }
  public String getFormaDePagamento() {
    return this.formaDePagamento;
  }
}