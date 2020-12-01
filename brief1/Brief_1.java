package ex1;
import java.util.Scanner;

public class Brief_1 {
	
	static Scanner input = new Scanner(System.in);

	static void welcome() {
		String text1 = "Quel est votre nom";
		String text2 = "Quel est votre prénom";
		String name;		
		System.out.println("bienvenu ");
		System.out.println(text1);
		name = input.nextLine();
		System.out.println(text2);
		name = name + " " + input.nextLine();
		System.out.println("Bonjour " + name);	
	}
	static void travaille() {
		float h = 0;
		float t = 0;
		float payer = 0;
		float err = 1;
		
		System.out.println("veuillez introduire le nombre d’heures travaillées cette semain");
		h = input.nextInt();
		while(err == 1) {
			if(h <= 60) {
				System.out.println("veuillez introduire le tarif par heure");
				t = input.nextInt();
				err = 0;
			}else if(h > 69) {
				System.out.println("information erronés");
				System.out.println("veuillez introduire le nombre d’heures travaillées cette semain");
				h = input.nextInt();
			}
			     else {
			    	System.out.println("number between 60 and 70 isn't consider");
					System.out.println("veuillez introduire le nombre d’heures travaillées cette semain");
					h = input.nextInt();
			     }
		}
		if(h <= 40 ) {
			payer = t * h;
			System.out.println("normal hours");
		}else {
			h = (h - 40);
			System.out.println("les heurs extra sont "+(int)h+"h");
			payer = 40 * t;
			System.out.println("prix des heurs fix = "+payer+" MAD");
			t = (float) (t + (t * 0.5));
			System.out.println("le tarif des heurs extra est : "+t+" MAD");
			payer = payer + (h * t);
		}
		
		System.out.println("votre indemnisation est de " + payer + " MAD");
	}
	public static void main (String[] args) {
		
		welcome();
		travaille();
		
	}
	
}
