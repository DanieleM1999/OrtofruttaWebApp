package it.dstech.ortofrutta;

import java.util.ArrayList;
import java.util.List;

public class Utente {
	
	private String username;
	private int eta;
	private List<Scontrino> listaScontrini;
	
	public Utente(String username, int eta) {
		super();
		this.username = username;
		this.eta = eta;
		this.listaScontrini = new ArrayList<Scontrino>();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	public List<Scontrino> getListaScontrini() {
		return listaScontrini;
	}

	public void setListaScontrini(List<Scontrino> listaScontrini) {
		this.listaScontrini = listaScontrini;
	}
	
	
	
}
