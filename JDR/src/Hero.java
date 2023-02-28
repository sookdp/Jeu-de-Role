import java.util.*;
public class Hero extends Character{
	List<Object> weaponList = new ArrayList<Object>();
	List<Object> potionList = new ArrayList<Object>();
	List<Object> artifactList = new ArrayList<Object>();
	private Object weapon;
	private boolean hold;
	
	public Hero (String name, int posX, int posY, int velocity, int life, int defense, int attack, int exp) {
		 super (name, posX, posY, velocity, life, defense, attack, exp);
	}

	public Object getWeapon() {
		return weapon;
	}
	public void setWeapon(Object weapon) {
		this.weapon = weapon;
	}
	public boolean isHold() {
		return hold;
	}
	public void setHold(boolean hold) {
		this.hold = hold;
	}
	
	public void up() {
		 this.setY(this.getY() -1);
	 }
	public void down() {
		this.setY(this.getY() +1);
			 
		 }
	public void left() {
		this.setX(this.getX() -1);
	}
	public void right() {
		this.setX(this.getY() +1);
	}
	
	public void takeObject (Object object, Chest chest) {
		String selection = object.getName();
		switch (selection) {
			case "Weapon":
				chest.take();
				if (weaponList.size() < 2 ) {
					weaponList.add(object);
				}
				else
					System.out.println ("--------------------------------------------------------------------------------------------\n"+
										"Vous avez trop d'armes...\n"+
										"-------------------------------------------------------------------------------------------\n");
				break;
			case "Potion":
				chest.take();
				if (potionList.size() < 2 ) {
					potionList.add(object);
				}
				else
					System.out.println ("--------------------------------------------------------------------------------------------\n"+
										"Vous avez trop de potions...\n"+
										"-------------------------------------------------------------------------------------------\n");
			
				break;
			case "Artifact":
				chest.take();
				if (artifactList.size() < 2 ) {
					artifactList.add(object);
				}
				else
					System.out.println ("--------------------------------------------------------------------------------------------\n"+
										"Vous avez trop d'atefacts...\n"+
										"-------------------------------------------------------------------------------------------\n");
				break;
		}
	}
	public void layObject (Object object, Chest chest) {
		String selection = object.getName();
		switch (selection) {
			case "Weapon":
				chest.lay(object);
				if (weaponList.size() > 0 ) {
					weaponList.remove(object);
				}
				else
					System.out.println ("--------------------------------------------------------------------------------------------\n"+
										"Vous n'avez plus d'armes dans votre sac...\n"+
										"-------------------------------------------------------------------------------------------\n");
				break;
			case "Potion":
				chest.lay(object);
				if (potionList.size() > 0 ) {
					potionList.remove(object);
				}
				else
					System.out.println ("--------------------------------------------------------------------------------------------\n"+
										"Vous n'avez plus de potion dans votre sac...\n"+
										"-------------------------------------------------------------------------------------------\n");
			
				break;
			case "Artifact":
				chest.lay(object);
				if (artifactList.size() > 0 ) {
					artifactList.remove(object);
				}
				else
					System.out.println ("--------------------------------------------------------------------------------------------\n"+
										"Vous n'avez plus d'artefact dans votre sac...\n"+
										"-------------------------------------------------------------------------------------------\n");
				break;
		}
	}

	public void viewWeapon() {
		for (int i = 0; i < weaponList.size(); i++) {
			// affichage à gérer 
			System.out.println( "---------------------------------------------------------------------------------------\n"+
								"Vous avez en votre possession :\n" + weaponList.get(i).getDescription() +"\n" +
								"---------------------------------------------------------------------------------------\n");
		}
	}
	public void viewPotion() {
		for (int i = 0; i < potionList.size(); i++) {
			System.out.println( "---------------------------------------------------------------------------------------\n"+
								"Vous avez en votre possession :\n" + potionList.get(i).getDescription() +"\n" +
								"---------------------------------------------------------------------------------------\n");
		}
	}
	public void viewArtifact() {
		for (int i = 0; i < artifactList.size(); i++) {
			System.out.println( "---------------------------------------------------------------------------------------\n"+
								"Vous avez en votre possession :\n" + artifactList.get(i).getDescription() +"\n" +
								"---------------------------------------------------------------------------------------\n");
		}
	}
	public void viewAll () {
		viewWeapon();
		viewPotion();
		viewArtifact();
	}
	
	public void takePotion(Scanner in) {
		int choice;
		viewPotion();
		System.out.println("Quelle potion voulez-vous prendre ?\n" +
		"---------------------------------------------------------------------------------------\n"+
		"1  : Element 1\n" + "2  : Element 2\n" + "3  : Element 3\n" + "4  : Element 4\n" + "5  : Element 5\n" +
		"---------------------------------------------------------------------------------------");
		choice = in.nextInt();
		switch (choice) {
			case 1:
				if (potionList.size() >= 1) {
					potionList.remove(potionList.get(0));
				}
				else 
					System.out.println ("--------------------------------------------------------------------------------------------\n"+
										"Vous n'avez plus de potion dans votre sac...\n"+
										"--------------------------------------------------------------------------------------------\n");
					setVelocity(getVelocity() + 1 );
					System.out.println ("--------------------------------------------------------------------------------------------\n"+
										"Votre nouvelle vélocité est égal à : \n"+ this.getVelocity()+
										"--------------------------------------------------------------------------------------------\n");
				break;
			case 2:
				if (potionList.size() >= 2) {
					potionList.remove(potionList.get(1));
				}
				else 
					System.out.println ("--------------------------------------------------------------------------------------------\n"+
										"Vous n'avez plus de potion dans votre sac...\n"+
										"--------------------------------------------------------------------------------------------\n");
					setVelocity(getLife() + 1 );
					System.out.println ("--------------------------------------------------------------------------------------------\n"+
										"Vous avez : \n"+ this.getLife()+ " points de vie." +
										"--------------------------------------------------------------------------------------------\n");
				break;
			case 3:
				if (potionList.size() >= 3) {
					potionList.remove(potionList.get(2));
				}
				else 
					System.out.println ("--------------------------------------------------------------------------------------------\n"+
										"Vous n'avez plus de potion dans votre sac...\n"+
										"--------------------------------------------------------------------------------------------\n");
					setVelocity(getDefense() + 1 );
					System.out.println ("--------------------------------------------------------------------------------------------\n"+
										"Vos nouveaux points de défense sont : \n"+ this.getDefense()+
										"--------------------------------------------------------------------------------------------\n");
				break;
			case 4:
				if (potionList.size() >= 4) {
					potionList.remove(potionList.get(3));
				}
				else 
					System.out.println ("--------------------------------------------------------------------------------------------\n"+
										"Vous n'avez plus de potion dans votre sac...\n"+
										"--------------------------------------------------------------------------------------------\n");
					setVelocity(getAttack() + 1 );
					System.out.println ("--------------------------------------------------------------------------------------------\n"+
										"Vos nouveaux points d'attaque sont égal à : \n"+ this.getAttack()+
										"--------------------------------------------------------------------------------------------\n");
				break;
			case 5:
				if (potionList.size() >= 5) {
					potionList.remove(potionList.get(4));
				}
				else 
					System.out.println ("--------------------------------------------------------------------------------------------\n"+
										"Vous n'avez plus de potion dans votre sac...\n"+
										"--------------------------------------------------------------------------------------------\n");
					setVelocity(getExp() + 1 );
					System.out.println ("--------------------------------------------------------------------------------------------\n"+
										"Votre niveau d'éxpérience a augmenté à : \n"+ this.getExp()+
										"--------------------------------------------------------------------------------------------\n");
				break;
		
			default:
				System.out.println("Merci de saisir une autre valeur");
				break;
		}
	}
	public void takeWeapon(Object weapon) {
		if (weaponList.size() > 0){
			weaponList.remove(weapon);
		}
		else
			System.out.println ("--------------------------------------------------------------------------------------------\n"+
								"Oups ! L'inventaire est vide...\n"+
								"-------------------------------------------------------------------------------------------\n");
			setWeapon(weapon);
			setHold(true);
			this.setAttack(getAttack()+1);
	}
	public void changeWeapon(Object newWeapon){
		if(isHold() == true){
			Object tmp = getWeapon();
			this.setWeapon(newWeapon);
			this.takeWeapon(newWeapon);
			weaponList.add(tmp);
		}
		else
			takeWeapon(newWeapon);
	}
	@Override
	public void attack(Character enemy) {
		Scanner in = new Scanner (System.in);
		boolean choice = false;
		int heroChoice;
		while (!choice){
			boolean validInput;
			do{
				System.out.println("Que voulez vous faire ?\n" +
									"---------------------------------------------------------------------------------------\n"+
									"1  : Attaquer\n" + "2  : Prendre une potion\n" +
									"---------------------------------------------------------------------------------------");
				heroChoice = in.nextInt();
				validInput = true;
				switch (heroChoice) {
					case 1:
						choice = true;
						int newLife = enemy.getLife() - getAttack() + enemy.getDefense();
						enemy.setLife(newLife);
						break;
					case 2:
						choice = true;
						takePotion(in);
						break;
			
					default:
						System.out.println("---------------------------------------------------------------------------------------\n"+
											"Je n'ai pas compris votre demande...\n" +
											"---------------------------------------------------------------------------------------");
						validInput = false;
						break;
				}
			}while(!validInput);
		}
	} 
}
