
public class Moto extends Veiculo {
	
	private boolean esportiva;
	
	public Moto(int anoFab, String cor, float valor, int quant, boolean esportiva){
		super(anoFab,cor,valor,quant);
		this.esportiva=esportiva;
	}
	public double calcValorVenda() {
		double valorVenda=0;
		if(this.esportiva==true && ( this.getCor()=="vermelha" || this.getCor()=="verde")) {
			valorVenda=((this.getValor()*140)/(100)+this.getValor());
		}
		else {
			valorVenda=((this.getValor()*110)/(100)+this.getValor());
		}
		
		return valorVenda;
		
	}

	public boolean isEsportiva() {
		return esportiva;
	}

	public void setEsportiva(boolean esportiva) {
		this.esportiva = esportiva;
	}
	
}
