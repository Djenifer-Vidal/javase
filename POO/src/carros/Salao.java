package carros;

public class Salao {
	
		public static void main(String[] args) {		
		Carro ferrari = new Carro();
		ferrari.ano = 2012;
		ferrari.cor = "vermelho";
		System.out.println("carro: ferrari");
		System.out.println("ano: " + ferrari.ano);
		System.out.println("cor: " + ferrari.cor);
		ferrari.ligar();
		ferrari.acelerar();		
		System.out.println("__________________________________");		
		Carro fusca = new Carro();
		fusca.ano = 1967;
		fusca.cor = "azul";
		System.out.println("carro: fusca");
		System.out.println("ano: " + fusca.ano);
		System.out.println("cor: " + fusca.cor);
		fusca.ligar();
		fusca.acelerar();
		fusca.acelerar();
		fusca.desligar();
	}

}
