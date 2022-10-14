
public abstract class Veiculo implements CalcVenda {

	private int anoFab;
	private String cor;
	private float valor;
	private int quant;
	private Seguro seguro;
	
	
	public Veiculo(int anoFab, String cor, float valor, int quant) {
		this.anoFab = anoFab;
		this.cor = cor;
		this.valor = valor;
		this.quant = quant;
	}
	
	public int getAnoFab() {
		return anoFab;
	}
	public void setAnoFab(int anoFab) {
		this.anoFab = anoFab;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public int getQuant() {
		return quant;
	}
	public void setQuant(int quant) {
		this.quant = quant;
	}

	public Seguro getSeguro() {
		return seguro;
	}

	public void setSeguro(Seguro seguro) {
		this.seguro = seguro;
	}
	
	
}
