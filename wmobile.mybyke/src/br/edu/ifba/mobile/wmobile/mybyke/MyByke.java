package br.edu.ifba.mobile.wmobile.mybyke;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean(name = "mb")
@SessionScoped
public class MyByke {

	private static List<String> pecas = new ArrayList<>();

	private static List<InQuadro> mQuadro = new ArrayList<>();
	private static List<InGarfo> mGarfo = new ArrayList<>();
	private static List<InFreio> mFreio = new ArrayList<>();
	private static List<InMarcha> mMarcha = new ArrayList<>();
	private static List<InPneu> mPneu = new ArrayList<>();
	
	private InQuadro quadro;
	/*private InGarfo garfo;
	private InFreio freio;
	private InMarcha marcha;
	private InPneu pneu;*/
	
	

	static {

		pecas.add("Quadro");
		pecas.add("Garfo");
		pecas.add("Freio");
		pecas.add("Marcha");
		pecas.add("Pneu");

		mQuadro.add(new InQuadro("Mosso", 1200));
		mQuadro.add(new InQuadro("Caloi",500));
		mQuadro.add(new InQuadro("Proshock",1000));

		mGarfo.add(new InGarfo("Kodi",800));
		mGarfo.add(new InGarfo("Caloi",600));
		mGarfo.add(new InGarfo("ProTork",1200));

		mFreio.add(new InFreio("Shimano",500));
		mFreio.add(new InFreio("Caloi",250));
		mFreio.add(new InFreio("GTS",400));

		mMarcha.add(new InMarcha("Shimano",500));
		mMarcha.add(new InMarcha("Caloi",200));
		mMarcha.add(new InMarcha("Yamada",350));

		mPneu.add(new InPneu("Pirelli",100));
		mPneu.add(new InPneu("CST ",70));
		mPneu.add(new InPneu("Maxxis",80));
		
	}

	public InQuadro getQuadro() {
		return quadro;
	}

	public void setQuadro(InQuadro quadro) {
		this.quadro = quadro;
	}

	public int getTotalPecas() {
		return pecas.size();
	}

	public String getNomePeca(int numero) {		
		return pecas.get(numero - 1);
	}

	public int getTotalQuadro() {
		return mQuadro.size();
	}
	public String getNomeQuadro(int numero) {		
		return mQuadro.get(numero - 1).getNome();
		
	}

	public int getTotalGarfo() {
		return mGarfo.size();
	}
	public String getNomeGarfo(int numero) {
		return mGarfo.get(numero - 1).getNome();
	}

	public int getTotalFreio() {
		return mFreio.size();
	}
	public String getNomeFreio(int numero) {
		return mFreio.get(numero - 1).getNome();
	}

	public int getTotalMarcha() {
		return mMarcha.size();
	}
	public String getNomeMarcha(int numero) {
		return mMarcha.get(numero - 1).getNome();
	}

	public int getTotalPneu() {
		return mPneu.size();
	}
	public String getNomePneu(int numero) {
		return mPneu.get(numero - 1).getNome();
	}

	public static class InQuadro{
		public String nome;
		public double valor;
		
		public InQuadro(String nome, double valor){
			this.nome=nome;
			this.valor=valor;
		}
		public String getNome() {
			return nome;
		}
		
		public double getValor() {
			return valor;
		}
		
	}
	public static class InGarfo{
		public String nome;
		public double valor;
		
		public InGarfo(String nome, double valor){
			this.nome=nome;
			this.valor=valor;
		}
		public String getNome() {
			return nome;
		}
		
		public double getValor() {
			return valor;
		}
		
	}
	public static class InFreio{
		public String nome;
		public double valor;
		
		public InFreio(String nome, double valor){
			this.nome=nome;
			this.valor=valor;
		}
		public String getNome() {
			return nome;
		}
		
		public double getValor() {
			return valor;
		}
		
	}
	public static class InPneu{
		public String nome;
		public double valor;
		
		public InPneu(String nome, double valor){
			this.nome=nome;
			this.valor=valor;
		}
		public String getNome() {
			return nome;
		}
		
		public double getValor() {
			return valor;
		}
		
	}
	public static class InMarcha{
		public String nome;
		public double valor;
		
		public InMarcha(String nome, double valor){
			this.nome=nome;
			this.valor=valor;
		}
		public String getNome() {
			return nome;
		}
		
		public double getValor() {
			return valor;
		}
		
	}
	
	public String getDelay() throws InterruptedException {
		Thread.sleep(3000);
		return "";

	}

	/*
	 * private String quadro; private String marcha; private String garfo;
	 * private String pneu; private String freio;
	 */
}
