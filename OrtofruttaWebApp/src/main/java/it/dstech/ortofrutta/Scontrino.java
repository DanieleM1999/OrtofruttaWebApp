package it.dstech.ortofrutta;

import java.util.ArrayList;
import java.util.List;

public class Scontrino {
	
	private String proprietario;
	private String dataEsecuzione;
	private double spesa;
	private List<Prodotto> listaProdotti;
	
	public Scontrino(String proprietario, String dataEsecuzione, double spesa) {
		super();
		this.proprietario = proprietario;
		this.dataEsecuzione = dataEsecuzione;
		this.spesa = spesa;
		this.listaProdotti = new ArrayList<Prodotto>();
	}

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}

	public String getDataEsecuzione() {
		return dataEsecuzione;
	}

	public void setDataEsecuzione(String dataEsecuzione) {
		this.dataEsecuzione = dataEsecuzione;
	}

	public double getSpesa() {
		return spesa;
	}

	public void setSpesa(double spesa) {
		this.spesa = spesa;
	}

	public List<Prodotto> getListaProdotti() {
		return listaProdotti;
	}

	public void setListaProdotti(List<Prodotto> listaProdotti) {
		this.listaProdotti = listaProdotti;
	}
	
	
	
}
