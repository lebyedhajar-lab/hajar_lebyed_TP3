package Ex1;
import java.util.Random;
import java.util.Scanner;

public class Ex7Bonus {
	public static void main(String[] args){
	Random rand = new Random();
	int n = rand.nextInt(10);
	
	Scanner sc= new Scanner(System.in);
	int nb=-1;
	
	while(n!=nb){
		System.out.println("entrez un nombre (entre 1 et 10) :");
		nb = sc.nextInt();
		if(nb<n){
			System.out.println("Plus grand");
		}else
			if(nb>n) {
				System.out.println("Plus petit");
			}
	};
	System.out.println("Bravo !");
	sc.close();
	}
}