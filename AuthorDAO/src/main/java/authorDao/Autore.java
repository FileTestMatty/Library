package authorDao;


import java.io.Serializable;
import java.util.Objects;

public class Autore implements Serializable {
	
	private Integer idAutore;
	private String nomeAutore;
	private String cognomeAutore;

	public Autore() {

	}
	
	public Autore( String nomeAutore, String cognomeAutore ) {
	
		this.nomeAutore = nomeAutore;
		this.cognomeAutore = cognomeAutore;
	}

	public Autore(Integer idAutore, String nomeAutore, String cognomeAutore) {
		this.idAutore = idAutore;
		this.nomeAutore = nomeAutore;
		this.cognomeAutore = cognomeAutore;
	}


	public Integer getIdAutore() {
		return idAutore;
	}

	public void setIdAutore(Integer idAutore) {
		this.idAutore = idAutore;
	}

	public String getNomeAutore() {
		return nomeAutore;
	}

	public void setNomeAutore(String nomeAutore) {
		this.nomeAutore = nomeAutore;
	}

	public String getCognomeAutore() {
		return cognomeAutore;
	}

	public void setCognomeAutore(String cognomeAutore) {
		this.cognomeAutore = cognomeAutore;
	}

	@Override
	public String toString() {
		
		return getIdAutore() + "  " + getNomeAutore() + "  " + getCognomeAutore();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Autore autore = (Autore) o;
		return Objects.equals(idAutore, autore.idAutore) && Objects.equals(nomeAutore, autore.nomeAutore) && Objects.equals(cognomeAutore, autore.cognomeAutore);
	}

	@Override
	public int hashCode() {
		return Objects.hash(idAutore, nomeAutore, cognomeAutore);
	}
}