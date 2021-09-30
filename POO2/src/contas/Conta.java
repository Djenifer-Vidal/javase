/**
 * POO2 - Encapsulamento
 * @author Djeniffer Vidal
 */

package contas;

public class Conta {
	/**
	 * Encapsulamento
	 */

	private double saldo;
	private String cliente;

	/**
	 * Obter o saldo
	 * 
	 * @return saldo6
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Atribuir um valor ao saldo
	 * 
	 * @param saldo
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Obter o nome do cliente
	 * 
	 * @return cliente
	 */
	public String getCliente() {
		return cliente;
	}

	/**
	 * Atribuir o valor a varievel cliente
	 * 
	 * @param cliente
	 */
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public Conta() {
		System.out.println("Agencia 0261");
	}

	/**
	 * Exibir o saldo da conta
	 */
	protected void exibirSaldo() {
		System.out.println("Saldo: R$ " + saldo);
	}

	/**
	 * debitar um valor da conta
	 * 
	 * @param valor
	 */
	protected void sacar(double valor) {
		saldo -= valor;
		System.out.println("Debito: R$" + valor);
	}

	protected void deposito(double valor) {
		saldo += valor;
		System.out.println("Deposito Realizado: R$" + valor);
	}

	protected void transferir(Conta destino, double valor) {
		this.sacar(valor);
		destino.deposito(valor);
		System.out.println("Transferecia R$" + valor);
	}
}
