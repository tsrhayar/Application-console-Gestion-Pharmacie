package pharmacie;

public class Client extends Personne {

	int badge;
	int id;

	public Client(int id, String nom, String prenom, String numeroTelephone, String email, int badge) {
		super(nom, prenom, numeroTelephone, email);
		this.id = id;
		this.badge = badge;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBadge() {
		return badge;
	}

	public void setBadge(int badge) {
		this.badge = badge;
	}

	public void acheter(Medicament medicament) {
		int newBadge = getBadge() + 1;
		setBadge(newBadge);
		System.out.println(
				getNom() + " " + getPrenom() + " acheté " + medicament.nom + ", prix: " + medicament.prix + ".");
		if(badge >=3) {
			System.out.println(getNom() + " " + getPrenom() + " devenu un client fidèle");
		}
	}

	@Override
	public String toString() {
		return "Client: id: " + id + super.toString() + ", badge=" + badge + "]";
	}

}
