package Ex1;

class Rectangle{
	private double largeur;
	private double hauteur;
	
	public Rectangle(double largeur, double hauteur){
		this.largeur=largeur;
		this.hauteur=hauteur;
	}
	public double Surface(){
		return largeur*hauteur;
	}
	public double Perimetre(){
		return largeur*2+hauteur*2;
	}
}

public class Ex2 {
	public static void main(String[] args){
		Rectangle R = new Rectangle(3,4);
		
		System.out.println(R.Surface());
		System.out.println(R.Perimetre());
	}

}
