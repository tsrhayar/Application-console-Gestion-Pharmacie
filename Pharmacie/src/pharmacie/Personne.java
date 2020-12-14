package pharmacie;

public class Personne {
	
	private String nom,prenom;
	private String numeroTelephone;
	private String email;
	
	public Personne(String nom, String prenom, String numeroTelephone, String email) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.numeroTelephone = numeroTelephone;
		this.email = email;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNumeroTelephone() {
		return numeroTelephone;
	}

	public void setNumeroTelephone(String numeroTelephone) {
		this.numeroTelephone = numeroTelephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "nom=" + nom + ", prenom=" + prenom + ", numeroTelephone=" + numeroTelephone + ", email="
				+ email;
	}
	
	

}
