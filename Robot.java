package Cours1;

public class Robot {
	
	public Robot() {}
	
	private String nom;
	private int pv;
	
	public Robot (String nom, int pv) {
		this.nom = nom; 
		this.pv = 10;
	}
	
	public String getNom () {
		return nom;
	}
	
	public int getPv () {
		return pv;
	}
	
	public void setNom (String nom) {
		this.nom = nom;
	}
	
	public void setPv (int pv) {
		this.pv = pv;
	}
	
	public Robot fire (Robot robotAttaque) {
		if (robotAttaque.getPv() <= 0) {
			System.out.println (robotAttaque.getNom() + " est deja mort");
		}
		else {
			robotAttaque.pv-=2;
			System.out.println(" "+robotAttaque.getNom()+" a ete touche par le robot "+this.nom);
		}
		System.out.print("au "+ "il rest "+robotAttaque.getPv());
		return robotAttaque;
	}
	
	public boolean estMort(Robot b) {
		if(b.pv==0) {
			System.out.println(" "+b.nom+" est mort");
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot r = new Robot("cassandra", 10);
		Robot r1 = new Robot("bob", 10);
		System.out.println("je suis, " + r.getNom() + " et j'ai " + r.getPv() + " points de vie " );
		
		Arena a = new Arena();
		
		a.fight(r, r1);
	}
	

}
