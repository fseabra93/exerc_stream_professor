
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Map;
import java.time.Month;

public class Main {
  public static List<Pescaria> getPescarias() {
    return new ArrayList<>() {{
        add(new Pescaria(LocalDate.parse("2023-08-05"), new ArrayList<>() {{
            add(new Peixe("Tucunare", 5.0));
            add(new Peixe("Baiacu", 7.0));
            add(new Peixe("Piranha", 2.7));
            add(new Peixe("Tilapia", 3.5));
        }}));
        add(new Pescaria(LocalDate.parse("2023-12-09"), new ArrayList<>() {{
            add(new Peixe("Tucunare", 6.0));
            add(new Peixe("Baiacu", 6.0));
            add(new Peixe("Piranha", 3.0));
            add(new Peixe("Tilapia", 4.0));
        }}));
        add(new Pescaria(LocalDate.parse("2024-01-05"), new ArrayList<>() {{
            add(new Peixe("Piaba", 3.0));
            add(new Peixe("Tucunare", 5.0));
            add(new Peixe("Piranha", 2.7));
            add(new Peixe("Baiacu", 4.2));
            add(new Peixe("Tilapia", 3.2));
        }}));
        add(new Pescaria(LocalDate.parse("2024-01-18"), new ArrayList<>() {{
            add(new Peixe("Baiacu", 8.0));
            add(new Peixe("Tilapia", 8.0));
            add(new Peixe("Piranha", 1.6));
            add(new Peixe("Piaba", 2.0));
        }}));
        add(new Pescaria(LocalDate.parse("2024-08-06"), new ArrayList<>() {{
            add(new Peixe("Tucunare", 8.4));
            add(new Peixe("Baiacu", 7.0));
            add(new Peixe("Piaba", 4.9));
            add(new Peixe("Tilapia", 5.5));
        }}));
        add(new Pescaria(LocalDate.parse("2023-03-15"), new ArrayList<>() {{
            add(new Peixe("Dourado", 9.0));
            add(new Peixe("Traira", 4.0));
            add(new Peixe("Pacu", 5.5));
        }}));
        add(new Pescaria(LocalDate.parse("2023-05-20"), new ArrayList<>() {{
            add(new Peixe("Tucunare", 7.5));
            add(new Peixe("Baiacu", 6.3));
            add(new Peixe("Piranha", 3.8));
            add(new Peixe("Tilapia", 4.4));
        }}));
        add(new Pescaria(LocalDate.parse("2023-07-10"), new ArrayList<>() {{
            add(new Peixe("Piaba", 3.1));
            add(new Peixe("Tucunare", 5.2));
            add(new Peixe("Piranha", 2.9));
            add(new Peixe("Baiacu", 4.7));
        }}));
        add(new Pescaria(LocalDate.parse("2023-09-25"), new ArrayList<>() {{
            add(new Peixe("Tilapia", 3.8));
            add(new Peixe("Dourado", 8.5));
            add(new Peixe("Traira", 4.1));
        }}));
        add(new Pescaria(LocalDate.parse("2024-02-14"), new ArrayList<>() {{
            add(new Peixe("Tucunare", 6.7));
            add(new Peixe("Piranha", 3.3));
            add(new Peixe("Tilapia", 5.0));
            add(new Peixe("Piaba", 2.6));
        }}));
        add(new Pescaria(LocalDate.parse("2024-03-22"), new ArrayList<>() {{
            add(new Peixe("Baiacu", 7.5));
            add(new Peixe("Dourado", 8.0));
            add(new Peixe("Pacu", 6.0));
        }}));
        add(new Pescaria(LocalDate.parse("2024-04-30"), new ArrayList<>() {{
            add(new Peixe("Traira", 4.8));
            add(new Peixe("Piranha", 2.5));
            add(new Peixe("Tilapia", 3.9));
        }}));
        add(new Pescaria(LocalDate.parse("2024-05-18"), new ArrayList<>() {{
            add(new Peixe("Tucunare", 5.5));
            add(new Peixe("Piaba", 3.4));
            add(new Peixe("Baiacu", 6.2));
        }}));
        add(new Pescaria(LocalDate.parse("2024-06-12"), new ArrayList<>() {{
            add(new Peixe("Tilapia", 4.7));
            add(new Peixe("Pacu", 6.3));
            add(new Peixe("Dourado", 7.8));
        }}));
        add(new Pescaria(LocalDate.parse("2024-07-23"), new ArrayList<>() {{
            add(new Peixe("Traira", 4.4));
            add(new Peixe("Piaba", 2.8));
            add(new Peixe("Piranha", 3.0));
        }}));
        add(new Pescaria(LocalDate.parse("2024-09-09"), new ArrayList<>() {{
            add(new Peixe("Baiacu", 7.2));
            add(new Peixe("Tilapia", 5.3));
            add(new Peixe("Tucunare", 6.9));
        }}));
        add(new Pescaria(LocalDate.parse("2024-10-16"), new ArrayList<>() {{
            add(new Peixe("Pacu", 5.7));
            add(new Peixe("Dourado", 9.1));
            add(new Peixe("Piranha", 3.6));
        }}));
        add(new Pescaria(LocalDate.parse("2024-11-28"), new ArrayList<>() {{
            add(new Peixe("Traira", 4.9));
            add(new Peixe("Piaba", 3.3));
            add(new Peixe("Tilapia", 4.5));
        }}));
        add(new Pescaria(LocalDate.parse("2024-12-20"), new ArrayList<>() {{
            add(new Peixe("Tucunare", 5.8));
            add(new Peixe("Baiacu", 6.4));
            add(new Peixe("Piranha", 2.9));
        }}));
    }};
  }
  
  public static List<Pedido> getPedidos() {
      Produto alocasia = new Produto("Alocasia", "Jardinagem", 150.0);
      Produto piranha = new Produto("Piranha", "Pescados", 2.7);
      Produto escovaDeDentes = new Produto("Escova de dentes", "Higiene", 8.0);
      Produto papelHigienico = new Produto("Papel higienico", "Higiene", 2.0);
      Produto notebook = new Produto("Notebook", "Eletrônicos", 2500.0);
      Produto smartphone = new Produto("Smartphone", "Eletrônicos", 1200.0);
      Produto camiseta = new Produto("Camiseta", "Roupas", 30.0);
      Produto calcaJeans = new Produto("Calça Jeans", "Roupas", 90.0);
      Produto tenis = new Produto("Tênis", "Calçados", 120.0);
      Produto sandalia = new Produto("Sandália", "Calçados", 80.0);
      Produto arroz = new Produto("Arroz", "Alimentos", 20.0);
      Produto feijao = new Produto("Feijão", "Alimentos", 7.0);
      Produto leite = new Produto("Leite", "Alimentos", 5.0);
      Produto cereal = new Produto("Cereal", "Alimentos", 15.0);
      Produto detergente = new Produto("Detergente", "Limpeza", 3.0);
      Produto desinfetante = new Produto("Desinfetante", "Limpeza", 4.0);
      Produto ventilador = new Produto("Ventilador", "Eletrodomésticos", 150.0);
      Produto liquidificador = new Produto("Liquidificador", "Eletrodomésticos", 200.0);
      Produto sofa = new Produto("Sofá", "Móveis", 900.0);
      Produto mesaDeJantar = new Produto("Mesa de Jantar", "Móveis", 600.0);

      return new ArrayList<>() {{
          add(new Pedido("Pix", new ArrayList<>() {{
              add(new Item(alocasia, 2));
              add(new Item(piranha, 1));
          }}));
          add(new Pedido("Cartão", new ArrayList<>() {{
              add(new Item(papelHigienico, 2));
              add(new Item(escovaDeDentes, 2));
              add(new Item(alocasia, 1));
          }}));
          add(new Pedido("Cartão", new ArrayList<>() {{
              add(new Item(piranha, 1));
              add(new Item(escovaDeDentes, 4));
          }}));
          add(new Pedido("Dinheiro", new ArrayList<>() {{
              add(new Item(notebook, 1));
              add(new Item(smartphone, 2));
          }}));
          add(new Pedido("Pix", new ArrayList<>() {{
              add(new Item(camiseta, 3));
              add(new Item(calcaJeans, 2));
              add(new Item(tenis, 1));
          }}));
          add(new Pedido("Cartão", new ArrayList<>() {{
              add(new Item(sandalia, 2));
              add(new Item(arroz, 10));
          }}));
          add(new Pedido("Dinheiro", new ArrayList<>() {{
              add(new Item(feijao, 5));
              add(new Item(leite, 6));
              add(new Item(cereal, 3));
          }}));
          add(new Pedido("Pix", new ArrayList<>() {{
              add(new Item(detergente, 4));
              add(new Item(desinfetante, 2));
          }}));
          add(new Pedido("Cartão", new ArrayList<>() {{
              add(new Item(ventilador, 1));
              add(new Item(liquidificador, 1));
          }}));
          add(new Pedido("Dinheiro", new ArrayList<>() {{
              add(new Item(sofa, 1));
              add(new Item(mesaDeJantar, 1));
          }}));
          add(new Pedido("Pix", new ArrayList<>() {{
              add(new Item(papelHigienico, 10));
              add(new Item(leite, 12));
          }}));
          add(new Pedido("Cartão", new ArrayList<>() {{
              add(new Item(escovaDeDentes, 5));
              add(new Item(smartphone, 1));
          }}));
          add(new Pedido("Dinheiro", new ArrayList<>() {{
              add(new Item(ventilador, 2));
              add(new Item(sandalia, 1));
          }}));
          add(new Pedido("Pix", new ArrayList<>() {{
              add(new Item(arroz, 5));
              add(new Item(feijao, 8));
          }}));
          add(new Pedido("Cartão", new ArrayList<>() {{
              add(new Item(cereal, 2));
              add(new Item(detergente, 3));
          }}));
          add(new Pedido("Dinheiro", new ArrayList<>() {{
              add(new Item(desinfetante, 1));
              add(new Item(sofa, 1));
          }}));
          add(new Pedido("Pix", new ArrayList<>() {{
              add(new Item(mesaDeJantar, 1));
              add(new Item(escovaDeDentes, 2));
          }}));
          add(new Pedido("Cartão", new ArrayList<>() {{
              add(new Item(camiseta, 4));
              add(new Item(calcaJeans, 3));
          }}));
          add(new Pedido("Dinheiro", new ArrayList<>() {{
              add(new Item(tenis, 2));
              add(new Item(notebook, 1));
          }}));
          add(new Pedido("Pix", new ArrayList<>() {{
              add(new Item(smartphone, 1));
              add(new Item(liquidificador, 2));
          }}));
      }};
  }

  public static void exerciciosPescarias() {
    List<Pescaria> pescarias = getPescarias();

    //Quantas pescarias foram realizadas no ano de 2024?
    //Tipo de retorno: long
    System.out.println(
      pescarias.stream()
        .filter(pescaria -> pescaria.getData().getYear() == 2024)
        .count()
    );

    //Qual foi o peixe mais pesado pescado?
    //Tipo de retorno: String (nome do peixe)
    System.out.println(
      pescarias.stream()
        .flatMap(pescaria -> pescaria.getPeixes().stream())
        .max(
          (peixe1, peixe2) -> Double.compare(peixe1.getPeso(), peixe2.getPeso())
        )
        .map(peixe -> peixe.getNome())
        .orElse("Nenhum peixe encontrado")
    );

    //Quantas pescarias foram realizadas por ano?
    //Tipo de retorno: Map<Integer, Long> (a chave é o ano, o valor é a quantidade de pescarias))
    System.out.println(
      pescarias.stream()
        .collect(Collectors.groupingBy(
          pescaria -> pescaria.getData().getYear(),
          Collectors.counting()
        ))
    );

    //Quantos kg de peixe foram pescados por mes em 2024
    //Tipo de retorno: Map<Month, Double> (a chave é o mes, o valor é o peso total do mes)
    System.out.println(
      pescarias.stream()
        .filter(pescaria -> pescaria.getData().getYear() == 2024)
        .collect(Collectors.groupingBy(
          pescaria -> pescaria.getData().getMonth(),
          Collectors.summingDouble(pescaria -> {
            return pescaria.getPeixes().stream()
              .collect(Collectors.summingDouble(peixe -> peixe.getPeso()));
          })
        ))
    );

    //Quantos kg de cada peixe foi pescado em 2024?
    //Tipo de retorno: Map<String, Double> (a chave é o nome do peixe, o valor é o peso total do peixe)
    System.out.println(
      pescarias.stream()
        .filter(pescaria -> pescaria.getData().getYear() == 2024)
        .flatMap(pescaria -> pescaria.getPeixes().stream())
        .collect(Collectors.groupingBy(
          peixe -> peixe.getNome(),
          Collectors.summingDouble(
            peixe -> peixe.getPeso()
          )
        ))
    );

    //Qual foi a pescaria com maior variedade de peixes?
    //Tipo de retorno: Pescaria
    System.out.println(
      pescarias.stream()
        .max((p1, p2) -> {
          Long p1Qty = p1.getPeixes().stream()
            .map(peixe -> peixe.getNome())
            .distinct()
            .count();
          Long p2Qty = p2.getPeixes().stream()
            .map(peixe -> peixe.getNome())
            .distinct()
            .count();
          return p1Qty.compareTo(p2Qty);
        }).orElse(null)
    );
  }

  public static void exerciciosPedidos() {
    List<Pedido> pedidos = getPedidos();

    //Quantos pedidos foram feitos no cartão?
    //Tipo de retorno: long
    System.out.println(
      pedidos.stream()
        .filter(pedido -> pedido.getFormaDePagamento().equals("Cartão"))
        .count()
    );

    //Quantos pedidos foram feitos para cada forma de pagamento?
    //Tipo de retorno: Map<String, Long> (a chave é a forma de pagamento, o valor é o total de pedidos)
    System.out.println(
      pedidos.stream()
        .collect(Collectors.groupingBy(
          pedido -> pedido.getFormaDePagamento(),
          Collectors.counting()
        ))
    );

    //Qual foi o metodo de pagamento do pedido mais caro?
    //Tipo de retorno: String
    System.out.println(
      pedidos.stream()
        .max((p1, p2) -> {
          Double p1Total = p1.getItens().stream()
            .map(item -> item.getProduto().getPreco() * item.getQuantidade())
            .reduce(0.0, Double::sum);
          Double p2Total = p2.getItens().stream()
            .map(item -> item.getProduto().getPreco() * item.getQuantidade())
            .reduce(0.0, Double::sum);
          return p1Total.compareTo(p2Total);
        }).map(pedido -> pedido.getFormaDePagamento())
        .orElse("Nenhum pedido")
    );

    //Qual foi a categoria mais comprada?
    //Tipo de retorno: String
    System.out.println(
      pedidos.stream()
        .flatMap(pedido -> pedido.getItens().stream())
        .collect(Collectors.groupingBy(
          item -> item.getProduto().getCategoria(),
          Collectors.summingDouble(item -> item.getQuantidade())
        )).entrySet().stream()
        .max((e1, e2) -> e1.getValue().compareTo(e2.getValue()))
        .map(e -> e.getKey())
        .orElse("Nenhuma categoria")
    );

    //Qual foi o produto mais comprado?
    //Tipo de retorno: Produto
    System.out.println(
      pedidos.stream()
       .flatMap(pedido -> pedido.getItens().stream())
       .collect(Collectors.groupingBy(
         item -> item.getProduto().getNome(),
         Collectors.summingInt(item -> item.getQuantidade())
       )).entrySet().stream()
       .max((e1, e2) -> e1.getValue().compareTo(e2.getValue()))
       .map(Map.Entry::getKey)
       .orElse("Nenhum produto comprado")
    );

    //Quanto custou a compra mais cara?
    //Tipo de retorno: double
    System.out.println(
      pedidos.stream()
        .map(pedido -> pedido.getItens().stream()
          .map(item -> item.getProduto().getPreco() * item.getQuantidade())
          .reduce(0.0, Double::sum)      
        )
        .max(Double::compare)
        .orElse(0.0)
    );

    //Qual foi a forma de pagamento mais utilizada?
    //Tipo de retorno: String
    System.out.println(
      pedidos.stream()
        .collect(Collectors.groupingBy(
          pedido -> pedido.getFormaDePagamento(),
          Collectors.counting()
        ))
        .entrySet().stream()
        .max((e1, e2) -> e1.getValue().compareTo(e2.getValue()))
        .map(e -> e.getKey())
        .orElse("Nenhuma forma de pagamento utilizada")
    );

    //Qual foi a forma de pagamento que mais arrecadou dinheiro?
    //Tipo de retorno: String
    System.out.println(
      pedidos.stream()
        .collect(Collectors.groupingBy(
          pedido -> pedido.getFormaDePagamento(),
          Collectors.summingDouble(pedido -> {
            return pedido.getItens().stream()
              .collect(Collectors.summingDouble(
                item -> item.getProduto().getPreco() * item.getQuantidade()
              ));
          })
        ))
        .entrySet().stream()
        .max((e1, e2) -> e1.getValue().compareTo(e2.getValue()))
        .map(e -> e.getKey())
        .orElse("Nenhum pedido feito")
    );
  }
  
  public static void main(String[] args) {
    exerciciosPescarias();
    exerciciosPedidos();
  }
}