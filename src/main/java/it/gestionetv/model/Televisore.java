package it.gestionetv.model;

public class Televisore {
	
	private Long id; 
	private String marca; 
	private String modello;
	private Integer prezzo;
	private Integer numeroPollici;
	private String codice;
	
	public Televisore() {
		
	}
	
	public Televisore(String marca, String modello, Integer prezzo, Integer numeroPollici, String codice) {
		super();
		this.marca = marca;
		this.modello = modello;
		this.prezzo = prezzo;
		this.numeroPollici = numeroPollici;
		this.codice = codice;
	}
	
	

	public Televisore(Long id, String marca, String modello, Integer prezzo, Integer numeroPollici, String codice) {
		super();
		this.id = id;
		this.marca = marca;
		this.modello = modello;
		this.prezzo = prezzo;
		this.numeroPollici = numeroPollici;
		this.codice = codice;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public Integer getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(Integer prezzo) {
		this.prezzo = prezzo;
	}

	public Integer getNumeroPollici() {
		return numeroPollici;
	}

	public void setNumeroPollici(Integer numeroPollici) {
		this.numeroPollici = numeroPollici;
	}

	public String getCodice() {
		return codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}
	
	
	
	
	

}
