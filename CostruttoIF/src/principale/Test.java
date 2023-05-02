package principale;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		/*
		Scanner in = new Scanner(System.in);
		System.out.println("Inserire Stipendio");
		int valore = in.nextInt();
		String messaggio=null;
		if(valore <=1150) {
			valore=((valore*10)/100)+valore;
			//System.out.println("Nuovo Stipendio "+valore);
			messaggio="Aumento - Nuovo Stipendio "+valore;
		}else {
			messaggio="Non hai diritto all' aumento !!!";
			//System.out.println("Non hai diritto all' aumento !!!");
		}
		System.out.println(messaggio);
		*/
		/******************************************/
		int v=58;
		String m="";
		if(v>=1 && v<=100) {
			if(v>=1 && v<=50) {
				if(v%2==0) {
					m="Numero Pari";
				}else {
					m="Numero Dispari";
				}
			}else {
				System.out.println("Eseguo il calcolo");
				if(v%3==0) {
					m="Numero Divisibile x 3";
				}else {
					m="Numero NON Divisibile x 3";
				}
			}
		}else {
			m="USCITA";
		}
		
		System.out.println(m);
		
		
		System.out.println("F I N E");	
	}
}
