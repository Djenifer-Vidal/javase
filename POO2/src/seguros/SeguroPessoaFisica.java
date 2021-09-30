package seguros;

import contas.Conta;

public class SeguroPessoaFisica extends Conta {

	public static void main(String[] args) {
		SeguroPessoaFisica cc3 = new SeguroPessoaFisica();
		cc3.setCliente("Pedro Victor");
		cc3.setSaldo(10);
		System.out.println("Cliente: " + cc3.getCliente());
		cc3.exibirSaldo();
		cc3.sacar(4000);
		cc3.exibirSaldo();
		cc3.deposito(20);
		cc3.exibirSaldo();
		System.out.println("----------------------------------------------");

	}
}
