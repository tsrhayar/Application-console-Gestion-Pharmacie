package pharmacie;

import java.util.ArrayList;

public class Pharmacien extends Personne {

	private static int count = 0;
	private int id;

	public Pharmacien(String nom, String prenom, String numeroTelephone, String email) {
		super(nom, prenom, numeroTelephone, email);
		this.id = count++;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Pharmacien [id=" + id + ", " + super.toString() + "]";
	}

	// add Pharmacien
	public static void addPharmacien(Pharmacien pharmacien, ArrayList<Pharmacien> PharmacienList) {
		PharmacienList.add(pharmacien);
	}

	// update Pharmacien
	public static void updatePharmacien(ArrayList<Pharmacien> PharmacienList, int id, String nom, String prenom,
			String numeroTelephone, String email) {
		for (int i = 0; i < PharmacienList.size(); i++) {
			if (id == PharmacienList.get(i).getId()) {
				PharmacienList.get(i).setId(id);
				PharmacienList.get(i).setNom(nom);
				PharmacienList.get(i).setPrenom(prenom);
				PharmacienList.get(i).setNumeroTelephone(numeroTelephone);
				PharmacienList.get(i).setEmail(email);
			}
		}
	}

	// delete Pharmacien
	public static void deletePharmacien(ArrayList<Pharmacien> PharmacienList, int id) {
		for (int i = 0; i < PharmacienList.size(); i++) {
			if (id == PharmacienList.get(i).getId()) {
				PharmacienList.remove(i);
			}
		}
	}
	
	public static void searchPharmacien(ArrayList<Pharmacien> PharmacienList, String nom) {
		String result = "";

		for (int i = 0; i < PharmacienList.size(); i++) {
			if (nom.equals(PharmacienList.get(i).getNom())) {
				result = PharmacienList.get(i).toString();
				break;
			} else {
				result = "Ce pharmacien n'est pas disponible";
			}
		}

		System.out.println(result);
	}

}
