package aeroporto;

import avioes.Aviao;

public class Hagar {

	public static void main(String[] args) {
		Aviao boeing777 = new Aviao();
		boeing777.ano = 2016;
		boeing777.cor = "Branco";
		boeing777.envergadura = 64.8;
		boeing777.tremPouso = false;
		System.out.println("Avião: Boeing 777");
		System.out.println("Ano: " + boeing777.ano);
		System.out.println("Cor: " + boeing777.cor);
		System.out.println("Envergadura: " + boeing777.envergadura);
		boeing777.ligar();
		boeing777.acelerar();
		boeing777.aterrizar();
		if (boeing777.tremPouso == true) {
			boeing777.aterrizar();
		} else {
			System.out.println("Arremeter!!!!!!!!!!!!");
		}
		Aviao AirbusA320 = new Aviao();
		AirbusA320.ano = 2016;
		AirbusA320.cor = "Azul e Branco";
		AirbusA320.envergadura = 34.10;
		AirbusA320.comprimento = 37.57;
		AirbusA320.altura = 11.76;
		AirbusA320.capacidade = 174;
		System.out.println("Avião: Airbus A320");
		System.out.println("Ano: " + AirbusA320.ano);
		System.out.println("Cor: " + AirbusA320.cor);
		System.out.println("Envergadura: " + AirbusA320.envergadura);
		System.out.println("Comprimento: " + AirbusA320.comprimento);
		System.out.println("Altura: " + AirbusA320.altura);
		System.out.println("Capacidade de Passageiros: " + AirbusA320.capacidade);
		AirbusA320.ligar();
		AirbusA320.acelerar();
		AirbusA320.acelerar();
		AirbusA320.aterrizar();

	}

}
