package Main;


public class Trade {

	  private int tradeId;
	  private String issuer;
	  private int quantity ;
	  private String status;

	

	  public Trade(int tradeId, String issuer, int quantity, String status) {
		super();
		this.tradeId = tradeId;
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
