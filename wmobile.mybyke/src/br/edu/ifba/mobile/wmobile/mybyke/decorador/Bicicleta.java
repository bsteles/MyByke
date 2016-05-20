package br.edu.ifba.mobile.wmobile.mybyke.decorador;

import java.util.ArrayList;
import java.util.List;

public class Bicicleta implements Bike {

	private double valor;
	//private String produto;

	public Bicicleta() {
		this.valor = 0;
		//this.produto = "Bicicleta personalizada";
	}

	@Override
	public double getValor() {
		return this.valor;
	}

	@Override
	public List<String> getProdutos() {
		List<String> produtos = new ArrayList<String>();
		//produtos.add(produto);
		return produtos;
	}


}
