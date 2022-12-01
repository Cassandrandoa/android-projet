package Cours1;

public class Arena extends Robot{
	
	Robot r1, r2;
	
	public Arena() {
	}
	
	public Arena(Robot r1, Robot r2) {
		this.r1 = r1;
		this.r2 = r2;
		// TODO Auto-generated constructor stub
	}


	public String fight(Robot r1,Robot r2) {
	
		if(estMort(r1) == false && estMort(r2)==false) {
			 r1.fire(r2);
			 while(estMort(r2)==false) {
					r2.fire(r1);
					if(estMort(r1)==false) {
						r1.fire(r2);
					}else {
						return "le rebot vainqeuer est "+ r2.getNom() +" est mort";
					}
				}
			 return "le rebot vainqeuer est "+ r1.getNom() +" est mort";
		}else {
		 if (estMort(r2) ==true) {
			return "Le "+ r2.getNom()+ " est deja mort";
		}else if (estMort(r1) ==true) {
			return "Le "+ r1.getNom()+ " est deja mort";
		}else {
		return "Les deux robots sont deja mort";
		}
		}
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
