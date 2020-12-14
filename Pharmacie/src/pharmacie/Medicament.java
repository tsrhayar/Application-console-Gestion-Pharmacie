package pharmacie;

import java.util.ArrayList;

public class Medicament {

	private static int count = 0;
	int id;
	String nom;
	String description;
	double prix;

	public Medicament(String nom, String description, double prix) {
		this.id = count++;
		this.nom = nom;
		this.description = description;
		this.prix = prix;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	@Override
	public String toString() {
		return "Medicament [id=" + id + ", nom=" + nom + ", description=" + description + ", prix=" + prix + "]";
	}

	// add Medicament
	public static void addMedicament(Medicament medicament, ArrayList<Medicament> MedicamentList) {
		MedicamentList.add(medicament);
	}

	// update Medicament
	public static void updateMedicament(ArrayList<Medicament> MedicamentList, int id, String nom, String description,
			double prix) {
		for (int i = 0; i < MedicamentList.size(); i++) {
			if (id == MedicamentList.get(i).getId()) {
				MedicamentList.get(i).setId(id);
				MedicamentList.get(i).setNom(nom);
				MedicamentList.get(i).setDescription(description);
				MedicamentList.get(i).setPrix(prix);
			}
		}
	}

	// delete Medicament
	public static void deleteMedicament(ArrayList<Medicament> MedicamentList, int id) {
		for (int i = 0; i < MedicamentList.size(); i++) {
			if (id == MedicamentList.get(i).getId()) {
				MedicamentList.remove(i);
			}
		}
	}

	public static void searchMedicament(ArrayList<Medicament> MedicamentList, String nom) {
		String result = "";

		for (int i = 0; i < MedicamentList.size(); i++) {
			if (nom.equals(MedicamentList.get(i).getNom())) {
				result = MedicamentList.get(i).toString();
				break;
			} else {
				result = "Ce medicament n'est pas disponible";
			}
		}
		System.out.println(result);
	}
}