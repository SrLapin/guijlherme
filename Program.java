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
		System.out.printf("Polegadas para Pés: %.2f \n" , Conversao.polegadasParapes(polegadas));
		
		
		System.out.println("Informe a quantidade de pés: ");
		double pes = sc.nextDouble();
		Conversao.setPes(pes);
		
		System.out.printf("Pés para metros: %.2f \n" , Conversao.pesParaMetros(pes));
		System.out.printf("Pés para polegadas: %.2f \n" , Conversao.pesParaPolegadas(pes));
			
		
		sc.close();
	}
}
