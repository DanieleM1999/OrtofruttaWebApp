package it.dstech.ortofrutta;

import java.util.ArrayList;
import java.util.List;

public class Utente {
	
	private String username;
	private String name;
	private String cognome;
	private String eta;
	private List<Scontrino> listaScontrini;
	
	public Utente(String username,String name,String cognome, String eta) {
		super();
		this.username = username;
		this.name = name;
		this.cognome = cognome;
		this.eta = eta;
		this.listaScontrini = new ArrayList<Scontrino>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEta() {
		return eta;
	}

	public void setEta(String eta) {
		this.eta = eta;
	}

	public List<Scontrino> getListaScontrini() {
		return listaScontrini;
	}

	public void setListaScontrini(List<Scontrino> listaScontrini) {
		this.listaScontrini = listaScontrini;
	}
	
	
	
}
