package br.gov.sp.fatec;

public class Soma implements Calculadora{

	public double calcular(Produto produto,int number) {
		return produto.getPreco()+number;
	}
}
