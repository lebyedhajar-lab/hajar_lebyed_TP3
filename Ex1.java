package Ex1;

class Point{
	private double x;
	private double y;
	
	public Point(){
		this.x=0;
		this.y=0;
	}
	
	public Point(double x,double y){
		this.x=x;
		this.y=y;
	}
	
	public void afficher(){
		System.out.println("("+x+","+y+")");
	}
	
	public void deplacer(double dx, double dy) {
		this.x=this.x+dx;
		this.y=this.y+dy;
	}
	
	public double distanceAorigine(){
		return Math.sqrt(x*x+y*y);
	}
	
	public double distanceXY(){
		return Math.abs(x-y);
	}
}

public class Ex1 {
	public static void main(String[] args){
		Point p1= new Point();
		Point p2= new Point(4,3);
		
		p1.afficher();
		p2.afficher();
		
		p1.deplacer(4,5);
		p1.afficher();
		
		System.out.println(p1.distanceAorigine());
		System.out.println(p1.distanceXY());
	}
	
	
}
