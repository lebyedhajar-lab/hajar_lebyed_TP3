package Ex1;

class CompteBancaire {
	private int numero;
	private double solde;
	
	CompteBancaire(int numero,double solde){
		this.numero=numero;
		this.solde=solde;
	}
	
	public void deposer(double montant){
		if(montant>0) {
			solde+=montant;
		}else 
			System.out.println("Montant invalide");
	}

	public void retirer(double montant) {
		if(montant>solde) {
			System.out.println("impossible : solde inuffissant");
		}else
			solde-=montant;
		System.out.println("effuctue");
		}
	
	public void transferer(CompteBancaire destination,double montant){
		if(montant>solde) {
			System.out.println("solde inuffissant");
		}else {
			this.retirer(montant);
			destination.deposer(montant);
			System.out.println("le transfert de " +montant+" de "+this.numero+" vers "+ destination.numero);
		}
	}
	
	public void afficherSolde(){
		System.out.println("Compte"+numero+ " votre solde : "+ solde);
	}
	
}

public class Ex5 {
	public static void main(String[] args){

        CompteBancaire c1 = new CompteBancaire(66666, 5000);
        CompteBancaire c2 = new CompteBancaire(44444, 1000);

        c1.afficherSolde();
        c2.afficherSolde();

        c1.deposer(2000);
        c1.afficherSolde();
        
        c2.retirer(1500);
        
        c1.transferer(c2,500);
        c1.afficherSolde();
        
    }
}
