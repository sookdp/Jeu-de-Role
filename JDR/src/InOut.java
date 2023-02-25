import java.util.Scanner;

enum Position_Choice {
	HAUT, BAS, GAUCHE, DROITE;
}

public class InOut {
	public void start () {
		boolean game = false;
		Scanner input = new Scanner (System.in);
		while (game == false) {
			System.out.println("--------------------------------------------------------------------------------------------\n"+
								"Bonjour à toi ! Nous avons besoin de toi pour affronter des monstres et ennemies.\n"+
								"-------------------------------------------------------------------------------------------\n");
			System.out.println("Es-tu prêt à les affronter ? Oui ou Non ?");
			String answer = input.next();
			if (answer.equals("Oui")) {
				System.out.println("-----------------------------------------------------------------------------------------\n" + 
									"Tu as fait le bon choix ! Je vais maintenant de t'expliquer le principe du jeu.\n"+
									"----------------------------------------------------------------------------------------\n"+
									"Le principe est simple, tu as une carte su laquelle tu peux te déplacer.\n"
									+ "Tu croisera sur ton chemin des monstres et des ennemies que tu devras combattre\n"+
									"Tu auras aussi à ta dispostion des armes, potions et artefacts que tu pourras récupérer.\n"+
									"Un ou plusieurs coffres seront disposés partout et dedans tu pourras y trouver des armes\n"
									+ "et artefacts. À l'aide des potion tu pourras gagner des points de vie, de l'expérience\n"
									+ "et pleins d'autres choses\n"
									+ "---------------------------------------------------------------------------------------\n");
				game = true;
			}
			if (answer.equals ("Non")) {
				System.out.println("-----------------------------------------------------------------------------------------\n"
								+ "Oh non ! Dommage que tu n'aies pas voulu relever le défi... On espère tout de même de te"
								+ "revoir un prochain fois !"
								+ "---------------------------------------------------------------------------------------\n");
				break;
			}
		}
			
	}
	public void playerMove(Scanner in, Hero hero) {
		boolean choiceMove = false;
		Position_Choice positionChoice;
		while (!choiceMove) {
			boolean validInput;
			do {
				System.out.println("Où voulez-vous aller ?\n" +
						"1  : En haut\n" + "2  : En bas\n" + "3  : À gauche\n" + "4  : À droite\n");
				int move = in.nextInt();
				validInput = true;
				switch (move) {
				case 1 : 
					hero.up();
					positionChoice = Position_Choice.HAUT;
					validInput = true;
					break;
				case 2 :
					hero.down();
					positionChoice = Position_Choice.BAS;
					validInput = true;
					break;
				case 3 :
					hero.left();
					positionChoice = Position_Choice.GAUCHE;
					validInput = true;
					break;
				case 4 :
					hero.right();
					positionChoice = Position_Choice.DROITE;
					validInput = true;
					break;
				default :
					System.out.println("Merci de saisir une autre valeur");
					validInput = false;
					break;
				}
			}while(!validInput);
		}
	}
		
}