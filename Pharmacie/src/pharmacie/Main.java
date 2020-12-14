package pharmacie;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		ArrayList<Pharmacien> PharmacienList = new ArrayList<Pharmacien>();
		ArrayList<Medicament> MedicamentList = new ArrayList<Medicament>();
		ArrayList<Client> ClientList = new ArrayList<Client>();

		Pharmacien nPharmacien = new Pharmacien(null, null, null, null);
		Medicament nMedicament = new Medicament(null, null, 0);
		Medicament nclient = new Medicament(null, null, 0);
		Client c1 = new Client(1, "Ali", "Mohammed", "0662553344", "aaee@mail.com", 0);
		Client c2 = new Client(2, "Salah", "Mobarik", "0662553344", "samo@mail.com", 0);
		Client c3 = new Client(3, "Ayoub", "Sanbouli", "0662553344", "a.sanboli@mail.com", 0);
		Client c4 = new Client(4, "Hamza", "Mtahri", "0662553344", "h.mthri@mail.com", 0);
		ClientList.add(c1);
		ClientList.add(c2);
		ClientList.add(c3);
		ClientList.add(c4);

		PharmacienList.add(new Pharmacien("Taha", "Srhayar", "0655443322", "taha@gg.cc"));
		PharmacienList.add(new Pharmacien("Taha1", "Srhayar1", "0655333322", "taha1@gg.cc"));
		MedicamentList.add(new Medicament("Medicament1", "Description1", 20));
		MedicamentList.add(new Medicament("Medicament2", "Description2", 120));
		MedicamentList.add(new Medicament("Medicament3", "Description3", 80));
		MedicamentList.add(new Medicament("Medicament4", "Description4", 10));
		MedicamentList.add(new Medicament("Medicament5", "Description5", 60));

		while (true) {
			System.out.println("La liste de pharmaciens" + PharmacienList);
			System.out.println("La liste de medicaments" + MedicamentList);
			System.out.println("La liste de clients" + ClientList);

			System.out.println(
					"Taper \n 1 pour gérer pharmaciens : \n 2 pour gérer medicaments: \n 3 pour chercher un pharmacien ou un medicament \n 4 pour acheter un medicament");
			String input = scanner.next();
			String input2;

			switch (input) {
			case "1":
				System.out.println(
						"Taper \n aj pour ajouter pharmacien: \n mo pour modifier pharmacien: \n su pour supprimer pharmacien:");
				input2 = scanner.next();
				switch (input2) {
				case "aj":
					System.out.println("Nom de pharmacien");
					String nom = scanner.next();
					System.out.println("Prenom de pharmacien");
					String prenom = scanner.next();
					System.out.println("Numéro téléphone de pharmacien");
					String numeroTelephone = scanner.next();
					System.out.println("Email de pharmacien");
					String email = scanner.next();

					nPharmacien = new Pharmacien(nom, prenom, email, numeroTelephone);

					Pharmacien.addPharmacien(nPharmacien, PharmacienList);

					System.out.println("Ajouté avec success");
					System.out.println(PharmacienList);
					System.out.println("<<--------------------------------------->>");
					break;
				case "mo":
					if (PharmacienList.size() > 0) {
						System.out.println(PharmacienList);
						System.out.println("Taper id pharmacien qui vous voulez modifier:");

						int id = scanner.nextInt();
						System.out.println("Taper le nouveau nom");
						nom = scanner.next();
						System.out.println("Taper le nouveau prenom");
						prenom = scanner.next();
						System.out.println("Taper le nouveau numéro téléphone");
						numeroTelephone = scanner.next();
						System.out.println("Taper le nouveau email");
						email = scanner.next();

						Pharmacien.updatePharmacien(PharmacienList, id, nom, prenom, numeroTelephone, email);

						System.out.println("Modifié avec sucess");
						System.out.println(PharmacienList);
					} else {
						System.out.println("Liste de pharmaciens est vide!");
					}
					break;
				case "su":

					if (PharmacienList.size() > 0) {
						System.out.println(PharmacienList);
						System.out.println("Taper id de pharmacien qui vous voulez supprimer:");
						int id = scanner.nextInt();

						Pharmacien.deletePharmacien(PharmacienList, id);
					} else {
						System.out.println("La liste de pharmaciens est vide !");
					}
					break;
				}
				break;

			case "2":
				System.out.println(
						"Taper \n aj pour ajouter medicament: \n mo pour modifier medicament: \n su pour supprimer medicament: \n che pour chercher medicament:");
				input2 = scanner.next();
				switch (input2) {
				case "aj":
					System.out.println("Nom de medicament");
					String nom = scanner.next();
					System.out.println("Prenom de description");
					String description = scanner.next();
					System.out.println("Email de medicament");
					double prix = scanner.nextDouble();

					nMedicament = new Medicament(nom, description, prix);

					Medicament.addMedicament(nMedicament, MedicamentList);

					System.out.println("Ajouté avec success");
					System.out.println(MedicamentList);
					System.out.println("<<--------------------------------------->>");
					break;
				case "mo":
					if (MedicamentList.size() > 0) {
						System.out.println(MedicamentList);
						System.out.println("Taper id pharmacien qui vous voulez modifier:");
						int id = scanner.nextInt();

						System.out.println("Taper le nouveau nom");
						nom = scanner.next();
						System.out.println("Taper le nouveau nom");
						description = scanner.next();
						System.out.println("Taper le nouveau prenom");
						prix = scanner.nextDouble();

						Medicament.updateMedicament(MedicamentList, id, nom, description, prix);

						System.out.println("Modifié avec sucess");
						System.out.println(MedicamentList);
					} else {
						System.out.println("Liste de medicaments est vide!");
					}
					break;
				case "su":

					if (MedicamentList.size() > 0) {
						System.out.println(MedicamentList);
						System.out.println("Taper id de medicament qui vous voulez supprimer:");
						int id = scanner.nextInt();

						Medicament.deleteMedicament(MedicamentList, id);
					} else {
						System.out.println("La liste de medicaments est vide !");
					}
					break;

				}
			case "3":

				System.out.println("Taper \n med pour charcher un medicament: \n pha pour charcher un pharmacien:");
				input2 = scanner.next();
				switch (input2) {
				case "med":

					if (MedicamentList.size() > 0) {
						System.out.println(MedicamentList);
						System.out.println("Taper le nom de medicament qui vous voulez chercher:");
						String nomMedicament = scanner.next();

						Medicament.searchMedicament(MedicamentList, nomMedicament);

					} else {
						System.out.println("La liste de medicaments est vide !");
					}
					break;
				case "pha":

					if (PharmacienList.size() > 0) {
						System.out.println(PharmacienList);
						System.out.println("Taper le nom de medicament qui vous voulez chercher:");
						String nomPharmacien = scanner.next();

						Pharmacien.searchPharmacien(PharmacienList, nomPharmacien);

					} else {
						System.out.println("La liste de medicaments est vide !");
					}
					break;
				}

				break;
			case "4":
				System.out.println("Choisir votre clientId");
				int clientId = scanner.nextInt();
				if (clientId > ClientList.size()) {
					System.out.println("ce clientId pas trouvé!");
				} else {
					System.out.println("Choisir l'id d'un medicament");
					System.out.println(MedicamentList);
					int medicamentId = scanner.nextInt();
					if (medicamentId > MedicamentList.size()) {
						System.out.println("ce medicamentId pas trouvé!");
					} else {
						ClientList.get(clientId).acheter(MedicamentList.get(medicamentId));
					}
				}

				break;

			}
				System.out.println(" ");
				System.out.println(" ");
				System.out.println("--------------------");
				System.out.println("Nouvelle operation: ");
		}
	}
}