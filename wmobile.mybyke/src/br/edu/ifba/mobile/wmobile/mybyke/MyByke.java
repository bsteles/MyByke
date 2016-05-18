package br.edu.ifba.mobile.wmobile.mybyke;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.swing.JOptionPane;

import br.edu.ifba.mobile.wmobile.mybyke.decorador.*;

@ManagedBean(name = "mb")
@SessionScoped
public class MyByke {

	private Bike bike;
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
			bike = new QuadroMosso(bike);
		else if (marca.equals("Proshok"))
			bike = new QuadroProshock(bike);
	}

	public void marcaGarfo(String marca) {
		if (marca.equals("Kodi"))
			bike = new GarfoKodi(bike);
		else if (marca.equals("Protork"))
			bike = new GarfoProtork(bike);
	}

	public void marcaMarcha(String marca) {
		if (marca.equals("Yamada"))
			bike = new KitDeMarchasYamada(bike);
		else if (marca.equals("Shimano"))
			bike = new KitMarchasShimano(bike);
	}

	public void marcaFreio(String marca) {
		if (marca.equals("GTS"))
			bike = new JogoDeFreioGTS(bike);
		else if (marca.equals("Shimano"))
			bike = new JogoDeFreioShimano(bike);
	}

	public void marcaPneu(String marca) {
		if (marca.equals("Maxxis"))
			bike = new PneusMaxxis(bike);
		else if (marca.equals("Pirelli"))
			bike = new PneusPirelli(bike);
	}

	public String getMontador() {
		marcaQuadro(quadro);
		marcaGarfo(garfo);
		marcaMarcha(marcha);
		marcaFreio(freio);
		marcaPneu(pneu);
		return "";
	}

	public void setQuadroEscolhido(String quadro) {
		this.quadro = quadro;
		JOptionPane.showMessageDialog(null, "Quadro " + quadro + " selecionado.");

	}

	public int getTotalListaProdutos() {
		return getListaProdutos().size();
	}

	public String getQuadro() {
		return quadro;
	}

	public void setGarfo(String garfo) {
		this.garfo = garfo;
		JOptionPane.showMessageDialog(null, "Garfo " + garfo + " selecionado.");

	}

	public void setMarcha(String marcha) {
		this.marcha = marcha;
		JOptionPane.showMessageDialog(null, "Marcha " + marcha + " selecionado.");
	}

	public void setFreio(String freio) {
		this.freio = freio;
		JOptionPane.showMessageDialog(null, "Freio " + freio + " selecionado.");
	}

	public void setPneu(String pneu) {
		this.pneu = pneu;
		JOptionPane.showMessageDialog(null, "Pneu " + pneu + " selecionado.");
	}

}
