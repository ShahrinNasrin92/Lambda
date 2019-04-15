package Supplier;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Main {
  public static void main(String[] args) {
    Supplier<List<Trade>> supplier = () -> TradeUtil.createTrades();

    System.out.println("Supplier Result " + supplier.get());
  }
}

class TradeUtil {

  public static List<Trade> createTrades() {
    List<Trade> trades = new ArrayList<Trade>();

    Trade t = new Trade(1, "IBM", 1000, "NEW");
    trades.add(t);
    t = new Trade(2, "APPL", 2000, "NEW");
    trades.add(t);
    t = new Trade(3, "IBM", 3000, "NEW");
    trades.add(t);
    t = new Trade(4, "IBM", 4000, "PENDING");
    trades.add(t);

    return trades;
  }

  public static List<Trade> createTrades(int size) {
    List<Trade> trades = new ArrayList<>();

    for (int i = 0; i < size; i++) {
      Trade t = new Trade(i, "ISUER " + i, i + 1000, "NEW");
      trades.add(t);
    }

    return trades;
  }

}

class Trade {

  private int tradeId = 0;
  private String issuer = null;
  private int quantity = 0;
  private String status = null;

  public Trade(int id, String issuer, int quantity, String status) {
    this.tradeId = id;
    this.issuer = issuer;
    this.quantity = quantity;
    this.status = status;
  }

  public int getTradeId() {
    return tradeId;
  }

  public void setTradeId(int tradeId) {
    this.tradeId = tradeId;
  }

  public String getIssuer() {
    return issuer;
  }

  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  @Override
  public String toString() {
    return "Trade{" + "tradeId=" + tradeId + ", issuer=" + issuer
        + ", quantity=" + quantity + ", status=" + status + '}';
  }

}