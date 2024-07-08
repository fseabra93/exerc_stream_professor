import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
public class Pescaria {
  private LocalDate data;
  private List<Peixe> peixes;

  public Pescaria(LocalDate data) {
    this.data = data;
    this.peixes = new ArrayList<>();
  }
  public Pescaria(LocalDate data, List<Peixe> peixes) {
    this.data = data;
    this.peixes = peixes;
  }
  public void addPeixe(Peixe peixe) {
    this.peixes.add(peixe);
  }
  public LocalDate getData() {
    return this.data;
  }
  public List<Peixe> getPeixes() {
    return this.peixes;
  }

  @Override
  public String toString() {
    return "Pescaria("+this.data.toString()+", "+this.peixes.toString()+")";
  }
}