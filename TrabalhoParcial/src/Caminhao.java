
public class Caminhao extends Veiculo{
 private double carga;
 
 public Caminhao(int anoFab, String cor, float valor, int quant, double carga) {
	 super(anoFab,cor,valor,quant);
	 this.carga=carga;
 }

 public double calcValorVenda() {
		double valorVenda=0;
		if(this.carga>=3) {
			valorVenda=((this.getValor()*107)/(100)+this.getValor());
		}
		else {
			valorVenda=((this.getValor()*105)/(100)+this.getValor());
		}
		
		return valorVenda;
		
	}
 
public double getCarga() {
	return carga;
}

public void setCarga(double carga) {
	this.carga = carga;
}
 
}
