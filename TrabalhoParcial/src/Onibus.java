
public class Onibus extends Veiculo {
	private int qntAssentos;
	
	public Onibus(int anoFab, String cor, float valor, int quant,int qntAssentos) {
		super(anoFab,cor,valor,quant);
		this.qntAssentos=qntAssentos;
	}
	
	public double calcValorVenda() {
		double valorVenda=0;
		if(this.qntAssentos>50){
			valorVenda=((this.getValor()*160)/(100)+this.getValor());
		}
		else {
			valorVenda=((this.getValor()*108)/(100)+this.getValor());
		}
		
		return valorVenda;
		
	}


	public int getQntAssentos() {
		return qntAssentos;
	}

	public void setQntAssentos(int qntAssentos) {
		this.qntAssentos = qntAssentos;
	}
	
}
