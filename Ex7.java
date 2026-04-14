package Ex1;

class Produit{
	private int id;
	private String nom;
	private String description;
	private double prix;
	private int quantite;
	
	private static int nombreProduits = 0;
	
	private static final double PRIX_MIN = 0;
	
	public Produit (int id,String nom,String description,float prix,int quantite ){
		this.id=id;
		this.nom=nom;
		this.description=description;
		this.prix=prix;
		this.quantite=quantite;
		nombreProduits++;
	}
	
	
	
	public void ajouterProd(){
        System.out.println("Produit ajouté : "+this.nom);
    }
	
	public void modifierProd(double nouveauPrix,int nouvelleQuantite) {
        if(nouveauPrix>= PRIX_MIN){
            this.prix = nouveauPrix;
        }
        this.quantite = nouvelleQuantite;
        System.out.println("Produit modifié :"+this.nom);
    }
	
	public void supprimerProd(){
        this.nom ="";
        this.description ="";
        this.prix = 0;
        this.quantite = 0;
        nombreProduits--;
        System.out.println("Produit supprimé.");
    }
	
	public int getId(){
        return this.id;
    }
	
	public void afficher(){
        System.out.println("ID: "+this.id+" | Nom : "+this.nom+" | Prix: "+this.prix+" DH | Quantité: "+this.quantite);
    }
	
	public static int getNombreProduits() {
        return nombreProduits;
    }
}
	
public class Ex7 {
	public static void main(String[] args){
		
		Produit P1 = new Produit(1,"Stylo","rouge",2,50); 
		Produit P2 = new Produit(2,"Cahier","90 page",8,30);
		
		System.out.println("Nombre des produit créés : "+Produit.getNombreProduits());
	
		P1.ajouterProd();
		P2.ajouterProd();
		
		P1.afficher();
		P2.afficher();
		
		P1.modifierProd(1.5,60);
		P1.afficher();
		
		P2.supprimerProd();
		
		System.out.println("Nombre des produit : "+Produit.getNombreProduits());
		
	}

}
