package br.edu.ifba.mobile.wmobile.mybyke.decorador;

public abstract class BikeDecorador implements Bike {

	protected String produto;
	protected double valor;
	protected Bike bikeDecorada;

	public BikeDecorador(Bike bikeDecorada) {
		this.bikeDecorada = bikeDecorada;
	}

	@Override
	public double getValor() {
		return bikeDecorada.getValor() + this.valor;
	}

	@Override
	public String getProduto() {
		return bikeDecorada.getProduto() + this.produto;
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
