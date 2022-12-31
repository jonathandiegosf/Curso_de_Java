package Application;

import java.util.Locale;
import java.util.Scanner;

import entities.Terreno;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Terreno ter = new Terreno();
		
		System.out.print("Digite a largura do terreno: ");
		ter.largura = sc.nextDouble();
		System.out.print("Digite o comprimento do terreno: ");
		ter.comprimento = sc.nextDouble();
		System.out.print("Digite o valor do metro quadrado: ");
		ter.valorm2 = sc.nextDouble();
		
		System.out.println("Area do Terreno: " + String.format("%.2f", ter.areaTerreno()));
		System.out.println("Preco do Terreno: " + String.format("%.2f", ter.precoTerreno()));
		
		
		

	}

}
