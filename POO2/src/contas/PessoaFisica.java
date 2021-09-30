package contas;

public class PessoaFisica {

	public static void main(String[] args) {
		Conta cc1 = new Conta();
		cc1.setCliente("Djeniffer Vidal");
		cc1.setSaldo(10000.50);
		System.out.println("Cliente: " + cc1.getCliente());
		cc1.exibirSaldo();
		cc1.sacar(1000);
		cc1.exibirSaldo();
		cc1.deposito(500);
		cc1.exibirSaldo();
		System.out.println(" -----------------------------------------");

		Conta cc2 = new Conta();
		cc2.setCliente("Gabriel Santos");
		cc2.setSaldo(5000);
		System.out.println("Cliente:  " + cc2.getCliente());
		cc2.exibirSaldo();
		cc2.sacar(4000);
		cc2.exibirSaldo();
		cc2.deposito(20);
		cc2.exibirSaldo();
		System.out.println("----------------------------------------------");
		System.out.println("Tranferencia");
		System.out.println("Cliente: " + cc1.getCliente());
		cc1.exibirSaldo();
		System.out.println("  ");
		System.out.println("Favorecido");
		System.out.println("Cliente: " + cc2.getCliente());
		cc2.exibirSaldo();
		System.out.println("  ");
		cc1.transferir(cc2, 100);
		System.out.println("----------------------------------------------");

		int i = 10;
		System.out.println(i);
		i--;
		System.out.println(i);

	}
}
