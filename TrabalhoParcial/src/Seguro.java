
public class Seguro implements CalcVenda {

private String tipo;
private Veiculo v;

 
  
public Seguro(String tipo, Veiculo v) {
	super();
	this.tipo = tipo;
	this.v = v;
}

public String getTipo() {
	return tipo;
}

public void setTipo(String tipo) {
	this.tipo = tipo;
}

public Veiculo getV() {
	return v;
}


public void setV(Veiculo v) {
	this.v = v;
}


public double calcValorVenda() {
	double valorVenda;
	double preco;
	if((this.v instanceof Carro || this.v instanceof Caminhao) && this.tipo=="2") {
		preco=this.v.calcValorVenda();
		valorVenda=(preco*3)/(100);
	}
	else {
		preco=this.v.calcValorVenda();
		valorVenda=(preco*2)/(100);
	}
	return valorVenda;


}


  
  
}
