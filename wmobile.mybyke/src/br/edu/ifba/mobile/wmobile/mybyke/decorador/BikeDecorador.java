package br.edu.ifba.mobile.wmobile.mybyke.decorador;


import java.util.List;

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
	public List<String> getProduto() {
		List<String> produtos = bikeDecorada.getProduto();
		produtos.add(this.produto);
		 
		return produtos;
		
	}


}
