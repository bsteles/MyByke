
package br.edu.ifba.mobile.wmobile.mybyke.decorador;


import java.util.List;

public abstract class BikeDecorador implements Bike {

	protected String produto;
	protected double valor;
	protected Bike bikeDecorada;

	public BikeDecorador(Bike bikeDecorada, String produto, double valor) {
		
		this.bikeDecorada = bikeDecorada;
		this.produto=produto;
		this.valor=valor;
	}

	@Override
	public double getValor() {
		return bikeDecorada.getValor() + this.valor;
	}

	@Override
	public List<String> getProdutos() {
		List<String> produtos = bikeDecorada.getProdutos();
		produtos.add(this.produto);
		 
		return produtos;
		
	}


}
