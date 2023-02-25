import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        InOut inout = new InOut();
		Hero hero = new Hero ("Hero1", 0, 0, 3, 5, 1, 2, 2, true);
		Scanner in = new Scanner (System.in);
		inout.start();
		System.out.println("Hero1 X : " + hero.getX());
		System.out.println("Hero1 Y : " + hero.getY());
		inout.playerMove(in, hero);
		System.out.println("Hero1 X : " + hero.getX());
		System.out.println("Hero1 Y : " + hero.getY());
    }
}
