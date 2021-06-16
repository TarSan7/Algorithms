package pack;

public class Main {
	public static void main(String [] args) {
		Algorythm first = new Algorythm("Hello, my friend.");
		first.check();
		
		Algorythm second = new Algorythm("ABCDE,FGHIJKLmn,opqrstu,vwxyz.");
		second.check();
		
		Algorythm third = new Algorythm("Ou, you...");
		third.check();
		
		Algorythm fourth = new Algorythm("Love yourself!");
		fourth.check();
	}
}
