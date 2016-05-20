package br.edu.ifba.mobile.wmobile.mybyke;

import java.util.ArrayList;
import java.util.List;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import javax.swing.JOptionPane;

import br.edu.ifba.mobile.wmobile.mybyke.decorador.Bicicleta;
import br.edu.ifba.mobile.wmobile.mybyke.decorador.Bike;
import br.edu.ifba.mobile.wmobile.mybyke.decorador.Garfo;
import br.edu.ifba.mobile.wmobile.mybyke.decorador.JogoDeFreio;
import br.edu.ifba.mobile.wmobile.mybyke.decorador.KitDeMarchas;
import br.edu.ifba.mobile.wmobile.mybyke.decorador.Pneus;
import br.edu.ifba.mobile.wmobile.mybyke.decorador.Quadro;

@ManagedBean(name = "mb")
@SessionScoped
public class MyByke {

	private List<Bike> lBike = new ArrayList<>();
	private Bike bike = new Bicicleta();
	private String quadro = "";
	private String garfo = "";
	private String marcha = "";
	private String freio = "";
	private String pneu = "";

	public List<String> getListaProdutos() {
		List<String> tipos = new ArrayList<String>();
		tipos.add("Quadro");
		tipos.add("Garfo");
		tipos.add("Marcha");
		tipos.add("Freio");
		tipos.add("Pneu");
		return tipos;
	}

	public List<String> getMarcasQuadro() {
		List<String> tipos = new ArrayList<String>();
		tipos.add("Mosso");
		tipos.add("Proshock");
		return tipos;
	}

	public List<String> getMarcasGarfo() {
		List<String> tipos = new ArrayList<String>();
		tipos.add("Kodi");
		tipos.add("Protork");

		return tipos;
	}

	public List<String> getMarcasMarcha() {
		List<String> tipos = new ArrayList<String>();
		tipos.add("Yamada");
		tipos.add("Shimano");
		return tipos;
	}

	public List<String> getMarcasFreio() {
		List<String> tipos = new ArrayList<String>();
		tipos.add("GTS");
		tipos.add("Shimano");
		return tipos;
	}

	public List<String> getMarcasPneu() {
		List<String> tipos = new ArrayList<String>();
		tipos.add("Maxxis");
		tipos.add("Pirelli");
		return tipos;
	}

	public void marcaQuadro(String marca) {
		
		if (marca.equals("Mosso")) 
			bike = new Quadro(bike, "Mosso", 900);
		 else  if (marca.equals("Proshok"))
			bike = new Quadro(bike, "Proshok", 1200);

	}

	public void marcaGarfo(String marca) {
		if (marca.equals("Kodi"))
			bike = new Garfo(bike, "Kodi", 700);
		else  if (marca.equals("Protork"))
			bike = new Garfo(bike, "Protork", 500);

	}

	public void marcaMarcha(String marca) {
		if (marca.equals("Yamada"))
			bike = new KitDeMarchas(bike, "Yamada", 95);
		else if (marca.equals("Shimano"))
			bike = new KitDeMarchas(bike, "Shimano", 150);

	}

	public void marcaFreio(String marca) {
		if (marca.equals("GTS"))
			bike = new JogoDeFreio(bike, "GTS", 200);
		else if (marca.equals("Shimano"))
			bike = new JogoDeFreio(bike, "Shimano", 200);

	}

	public void marcaPneu(String marca) {
		if (marca.equals("Maxxis"))
			bike = new Pneus(bike, "Maxxis", 60);
		else if (marca.equals("Pirelli"))
			bike = new Pneus(bike, "Pirelli", 100);

	}

	public void getMontador() {

		marcaQuadro(quadro);
		lBike.add(bike);
		marcaGarfo(garfo);
		lBike.add(bike);
		marcaMarcha(marcha);
		lBike.add(bike);
		marcaFreio(freio);
		lBike.add(bike);
		marcaPneu(pneu);
		lBike.add(bike);

	}

	public List<String> getBike() {
		if (bike.getProdutos().size() > 0)
			bike = new Bicicleta();
		this.getMontador();
		return bike.getProdutos();
	}

	public void setQuadro(String quadro) {
		this.quadro = quadro;		
	}

	public void setGarfo(String garfo) {
		this.garfo = garfo;
	}

	public void setMarcha(String marcha) {
		this.marcha = marcha;
	}

	public void setFreio(String freio) {
		this.freio = freio;
	}

	public void setPneu(String pneu) {
		this.pneu = pneu;
	}

	

}
