
public class Main {

	public static void main(String[] args) {
		
		Carro c1= new Carro(2022,"Verde",100,1,"Sedan");
		Seguro s1= new Seguro("2",c1);	
		System.out.print(c1.calcValorVenda()+"\n");
		System.out.print(s1.calcValorVenda()+"\n");
		
		Moto m1= new Moto(2020,"vermelha",100,2,true);
		Seguro s2= new Seguro("2",m1);
		System.out.print(m1.calcValorVenda()+"\n");
		System.out.print(s2.calcValorVenda()+"\n");
		
		Caminhao cm1= new Caminhao(2020,"Azul",100,2,3);
		Seguro s3= new Seguro("2",cm1);
		System.out.print(cm1.calcValorVenda()+"\n");
		System.out.print(s3.calcValorVenda()+"\n");
				
	}

}
