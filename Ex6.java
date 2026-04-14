package Ex1;

class Voiture{
	String marque;
	int vitesse;
	
	Voiture(String marque,int vitesse){
		this.marque=marque;
		this.vitesse=vitesse;
	}
	
	public void accelerer(int valeur){
		if(vitesse+valeur<=240){
			vitesse+=valeur;
			System.out.println("la voiture " +marque+" accelere : "+ vitesse+"km/h");
		}else {
			vitesse=240;
			System.out.println("la voiture "+marque+"a atteint la vitesse maximale : 240 km/h");
		}
	}
	
	public void freiner(int valeur){
		if(vitesse-valeur>=0) {
			vitesse-=valeur;
			System.out.println("la vitesse actuelle est : "+vitesse);
		}
	}
	
	public void afficher() {
		System.out.println("la marque :"+this.marque+"| la vitesse :"+this.vitesse+"km/h");
	}
}

public class Ex6 {
	public static void main(String[] args) {
		
		Voiture V = new Voiture("audi",80);
		
		V.afficher();
		
		V.accelerer(40);
		V.accelerer(160);
		
		V.freiner(30);

	}

}
