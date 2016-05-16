package br.edu.ifba.mobile.wmobile.mybyke.decorador;

public class Bicicleta implements Bike {

	private double valor;
	private String produto;

	Bicicleta() {
		this.valor = 0;
		this.produto = "Bicicleta";
	}

	@Override
	public double getValor() {
		return this.valor;
	}

	@Override
	public String getProduto() {
		return this.produto;
	}

	@Override
	public void setProduto(String produto) {
		this.produto = produto;
	}

	@Override
	public void setValor(double valor) {
		this.valor = valor;

	}

}
