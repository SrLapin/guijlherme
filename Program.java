package program;

import java.util.Scanner;

import entities.Conversao;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Conversao Conversao = new Conversao(); 
		
		System.out.println("Informe a quantidade de metros:");
		double metros = sc.nextDouble();
		Conversao.setMetros(metros);
		
		System.out.printf("Metros para Polegadas: %.2f \n" , Conversao.metrosParaPolegadas(metros));
		System.out.printf("Metros para Pes: %.2f \n" , Conversao.metrosParaPes(metros));
		
				
		System.out.println("Informe a quantidade de polegadas: ");
		double polegadas = sc.nextDouble();
		Conversao.setPolegadas(polegadas);
		
		System.out.printf("Polegadas para Metros: %.2f \n" , Conversao.polegadasParaMetros(polegadas));
		System.out.printf("Polegadas para P�s: %.2f \n" , Conversao.polegadasParapes(polegadas));
		
		
		System.out.println("Informe a quantidade de p�s: ");
		double pes = sc.nextDouble();
		Conversao.setPes(pes);
		
		System.out.printf("P�s para metros: %.2f \n" , Conversao.pesParaMetros(pes));
		System.out.printf("P�s para polegadas: %.2f \n" , Conversao.pesParaPolegadas(pes));
			
		
		sc.close();
	}
}
