package it.polito.tdp.lab04.model;

public class Corso {
	
	private String codins;
	private int crediti;
	private String nome;
	private int pd;
	
	public Corso() {
		
	}
	
	public Corso(String codins) {
		this.codins = codins;
	}
	
	public Corso(String codins, int crediti, String nome, int pd) {
		this.codins = codins;
		this.crediti = crediti;
		this.nome = nome;
		this.pd = pd;
	}

	
	// Getters and setters

	public String getCodins() {
		return codins;
	}


	public int getNumeroCrediti() {
		return crediti;
	}


	public String getNome() {
		return nome;
	}


	public int getPeriodoDidattico() {
		return pd;
	}


	public void setCodins(String codins) {
		this.codins = codins;
	}


	public void setCrediti(int crediti) {
		this.crediti = crediti;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public void setPd(int pd) {
		this.pd = pd;
	}


	//Hash Code e Equals
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codins == null) ? 0 : codins.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Corso other = (Corso) obj;
		if (codins == null) {
			if (other.codins != null)
				return false;
		} else if (!codins.equals(other.codins))
			return false;
		return true;
	}
	
	// Ordinare alfabeticamente in  ordine crescente i nomi dei corsi
	
	//@Override
	public int compareTo(Corso corsoInput) {
		return this.nome.compareTo(corsoInput.nome);
	}

	@Override
	public String toString() {
		return nome;
	}
	
	

	
}
