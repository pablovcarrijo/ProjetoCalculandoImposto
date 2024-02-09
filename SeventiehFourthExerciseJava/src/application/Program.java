package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPlayer;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		List<TaxPlayer> list = new ArrayList<>();
		
		for(int i = 1; i <= n; i ++) {
			System.out.println("Tax payer #" + i + " data:");
			
			System.out.print("Individual or company(c/i): ");
			char ch = sc.next().toLowerCase().charAt(0);
			
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Anual Income: ");
			Double anualIncome = sc.nextDouble();
			
			if(ch == 'i') {
				System.out.print("Helth expenditures: ");
				Double helthExpenditures = sc.nextDouble();
				list.add(new Individual(name, anualIncome, helthExpenditures));
			}
			else if (ch == 'c') {
				System.out.print("Numbers of employees: ");
				Integer quantityEmployee = sc.nextInt();
				list.add(new Company(name, anualIncome, quantityEmployee));
			}
			
		}
		
		System.out.println();
		System.out.println("TAXES PAID: ");
		
		Double sum = 0.0;
		for(TaxPlayer tax : list) {
			System.out.println(tax.getName() + ": $" + String.format("%.2f", tax.calculate()));
			sum += tax.calculate();
		}
		
		System.out.println();
		System.out.println("TOTAL: $" + String.format("%.2f", sum));
		
		sc.close();
		
	}
	
}
