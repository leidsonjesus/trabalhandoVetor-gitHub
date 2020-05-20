package Aplication;

import java.util.Locale;
import java.util.Scanner;

import entidade.Produto;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Produto[] vect = new Produto[n];
		
	   
	    
		for ( int i=0 ; i<n; i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			double valor = sc.nextDouble();
			
			vect[i] = new Produto(nome, valor);
			
			
		}
		double sum = 0;
		for ( int i=0 ; i<n; i++) {
			
		sum = vect[i].getValor();
		
		}
		
		double media = sum / n ;
		System.out.println("a media é : " + media);
		sc.close();
	}

}





























