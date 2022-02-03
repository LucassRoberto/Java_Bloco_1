package herancaEx;

public class Estoque {
	
	private String produto;
	private int quant;
	
	public Estoque(String produto, int quant) {
		this.produto = produto;
		this.quant = quant;
	}
	
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public int getQuant() {
		return quant;
	}
	public void setQuant(int quant) {
		this.quant = quant;
	}

	public String toString() {
		return this.produto
				+ this.quant;
	}
	
	

}
