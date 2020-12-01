package ex1;
import java.util.Scanner;

public class Main {
	//ex 1
	static Scanner input = new Scanner(System.in);

	static void welcome() {
		String text1 = "Quel est votre nom";
		String text2 = "Quel est votre prénom";
		String name;
		Scanner input = new Scanner(System.in);
		System.out.println(text1);
		name = input.nextLine();
		System.out.println(text2);
		name = name + " " + input.nextLine();
		System.out.println("Bonjour " + name);	
	}
	//ex 2
	static void tva() {
		int prixHt;
		int number;
		int tva;
		int total;
		Scanner input = new Scanner(System.in);
		System.out.println("entre le prix HT");
		prixHt = input.nextInt();
		System.out.println("entre le nombre d'article");
		number = input.nextInt();;
		System.out.println("entre le taux de TVA");
		tva = input.nextInt();
		total = (prixHt*number);
		total = ((total * (tva)) / 100) + total;
		System.out.println("total a payer : " + total + " Dh");	
	}
	//ex3
	static void printNumber() {
		int number = 1;
		while (number < 11) {
			System.out.print(number);
			if(number < 10) System.out.print(", ");
			number++;
		}
		System.out.print("\n");		
	}
	static void print2Number() {
		int n1 = 1;
		int n2 = 100;
		while(n1 < 11 ) {
			System.out.print(n1);
			if(n2 > 91) {
				System.out.print(", "+n2+", ");
			}
			n1++;
			n2--;
			}
	}
	//ex 4
	private static void sayMynameAndAge(String nom, String prenom, int age, boolean genre ) {
		String text = "";
		String text2 = "";
		if(genre)
			text = "un homme";
		else 
			text = "une femme";
		if(age < 18)
			text2 = "mineur";
		else text2 = "majeur"; 
		System.out.println("Bonjour " + nom + " "+prenom +", tu as " + age + " ans. \ntu es "+text+" et vous êtes " + text2);
	}
	static void sayMyName() {
		String nom = "";
		String prenom = "";
		boolean genre = false;
		int age;
		System.out.println("entre Votre nom");
		nom = input.nextLine();
		System.out.println("entre Votre prénom");
		prenom = input.nextLine();
		System.out.println("entre année de naissance");
		age = input.nextInt();
		age = 2020 - age;
		System.out.println("Si homme entrè 1, sinon 2");
		if(input.nextInt() == 1) 
			genre = true;
		
		sayMynameAndAge(nom, prenom, age, genre);
	}
	
	
	//ex 5 
		private static void sayMyGenderAndAge(String genre, int age) {
			String text = "majeur";
			String text2 = " tu peux ";

			if(age < 18) {
				text = "mineur";
				text2 = " tu ne peux pas ";
			}
			if(genre == "homme") {
				System.out.println("Bonjour Monsieur "+" vous etez " + text+text2+"passer");
				  
			}else if (genre == "femme") 
				System.out.println("Bonjour Mll "+", vous etez " + text+text2+"passer");
			else System.out.println("erreur in 2nd ft");
				
			
		}
		static void sayMyGender() {
			int genre = 0;
			int age = 0;
			String text = "homme";
			boolean status = true;
			while(status) {
				System.out.println("veuillez entrer le genre: \nvous un homme :1 \nune femme :2");
				genre = input.nextInt();
				if(genre == 1 || genre == 2) {
					status = false;
					if(genre == 2)
						text = "femme";
				}else {
					System.out.println("erreur!! : genre incorrect");
				}

			}
			status = true;
			while(status) {
				System.out.println("entre année de naissance");
				age = input.nextInt();
				if(age < 2015 && age > 1890) {
					age = 2020 - age;
					status = false;
				}else
					System.out.println("erreur!! : année incorrect");
			}
			
			sayMyGenderAndAge(text,age);
		}
		
	public static void main (String[] args) {
		
		sayMyGender();
	}
	
}
