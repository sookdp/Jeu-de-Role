import java.util.Scanner;

public class InOut {
	Scanner input = new Scanner (System.in);
	public void start (Scanner in) {
		boolean game = false;
		while (game == false) {
			game = true;
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
	
	//méthode playerChoice pour demander s'il veut se déplacer ou consulter son inventaire
	public void playerChoice(Scanner in, Hero hero, Game game){
		boolean playerChoice = false;
		while(!playerChoice) {
			boolean validInput;
			do{
				System.out.println("Que voulez vous faire ?\n" +
									"---------------------------------------------------------------------------------------\n"+
									"1  : Vous déplacer\n" + "2  : Consulter votre inventaire\n" +
									"---------------------------------------------------------------------------------------");
				int choice = in.nextInt();
				validInput = true;
				switch (choice) {
					case 1:
						playerChoice = true;
						game.playerMove(in, hero);
						break;
					case 2:
						playerChoice = true;
						hero.viewAll();
						break;
					default:
						System.out.println("---------------------------------------------------------------------------------------\n"+
											"Je n'ai pas bien saisi...\n" +
											"---------------------------------------------------------------------------------------");
						validInput = false;
						break;
				}
			}while(!validInput);
		}
	}
	// crossChest
	public void crossChest(Scanner in, Hero hero, Chest chest) {
		boolean playerChoice = false;
		while(!playerChoice) {
			boolean validInput;
			do{
				System.out.println("Que voulez vous faire ?\n" +
									"---------------------------------------------------------------------------------------\n"+
									"1  : Regarder le contenu du coffre\n" + "2  : Partir\n" +
									"---------------------------------------------------------------------------------------");
				int choice = in.nextInt();
				validInput = true;
				switch (choice) {
					case 1:
						playerChoice = true;
						chest.viewContent();
						System.out.println("Que voulez vous faire ?\n" +
									"---------------------------------------------------------------------------------------\n"+
									"1  : Prendre l'objet\n" + "2  : Le laisser\n" +
									"---------------------------------------------------------------------------------------");
						int takeChoice = in.nextInt();
						switch (takeChoice) {
							case 1:
								playerChoice = true;
								hero.takeObject(chest.getContentList(), chest);
								break;
							case 2:
								playerChoice = true;
								break;
						
							default:
								System.out.println("---------------------------------------------------------------------------------------\n"+
													"Je n'ai pas bien saisi...\n" +
													"---------------------------------------------------------------------------------------");
								validInput = false;
								break;
						}
						break;
					case 2:
						playerChoice = true;
						break;
					default:
						System.out.println("---------------------------------------------------------------------------------------\n"+
											"Je n'ai pas bien saisi...\n" +
											"---------------------------------------------------------------------------------------");
						validInput = false;
						break;
				}
			}while(!validInput);
		}
	}
	//takeWeapon
	public void takeWeapon(Scanner in, Hero hero){
		boolean choice = false;
		while (!choice) {
			boolean validInput;
			do {
				hero.viewWeapon();
				System.out.println("Quelle arme voulez-vous prendre ?\n" +
						"1  : Elément 1\n" + "2  : Elément 2\n");
				int weaponChoice = in.nextInt();
				validInput = true;
				switch (weaponChoice) {
				case 1 :
					choice = true;
					hero.takeWeapon(hero.weaponList.get(0));
					break;
				case 2 :
					choice = true;
					hero.takeWeapon(hero.weaponList.get(1));
					break;
				default :
					System.out.println("Merci de saisir une autre valeur");
					validInput = false;
					break;
				}
			}while(!validInput);
		}
	}
	//finish
}