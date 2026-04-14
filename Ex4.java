package Ex1;
import java.util.Scanner;
class NombreComplexe{
	private float Re;
	private float Im;
	
	NombreComplexe (float Re,float Im){
		this.Re=Re;
		this.Im=Im;
	}
	
	public NombreComplexe addition(NombreComplexe z,NombreComplexe x){
		return  new NombreComplexe((z.Re + x.Re) , (z.Im+x.Im));
	}
	
	public NombreComplexe Multiplication(NombreComplexe z,NombreComplexe x){

		return  new NombreComplexe((z.Re*x.Re)-(z.Im*x.Im),(z.Re*x.Im)+(z.Im*x.Re));
	}
	
	public void Afficher() {
		System.out.println(Re+"+ i"+Im);
	}
	
}

public class Ex4 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrez la partie reelle de z1 : ");
		float Re1 =sc.nextFloat();
		
		System.out.println("Entrez la partie Imaginaire de z1 : ");
		float Im1 = sc.nextFloat();
		
		NombreComplexe z1 = new NombreComplexe(Re1,Im1);
		
		System.out.println("Entrez la partie reelle de z2 : ");
		float Re2 = sc.nextFloat();
		
		System.out.println("Entrez la partie Imaginaire de z2 : ");
		float Im2 = sc.nextFloat();
		
		NombreComplexe z2 = new NombreComplexe(Re2,Im2);
		
		NombreComplexe z3 = new NombreComplexe(0,0);
		
		NombreComplexe somme = z3.addition(z1,z2);
		System.out.print("z1 + z2 = ");somme.Afficher();
		NombreComplexe Produit= z3.Multiplication(z1,z2);
		System.out.print("z1 * z2 = ");Produit.Afficher();
		sc.close();
	}
	
}
