
public class Carro extends Veiculo {
 
	private String tipo;

	public Carro(int anoFab, String cor, float valor, int quant, String tipo){
		super(anoFab,cor,valor,quant);
		this.tipo= tipo;
	}
	
	public double calcValorVenda() {
		double valorVenda=0;
		if(this.getAnoFab()<2018 && this.tipo=="Sedan") {
			valorVenda=((this.getValor()*130)/(100)+this.getValor());
		}
		else {
			valorVenda=((this.getValor()*115)/(100)+this.getValor());
		}
		
		return valorVenda;
		
	}
	public String getTipo() {
		return tipo;
}

	public void setTipo(String tipo) {
		this.tipo = tipo;
}
 
 
}
