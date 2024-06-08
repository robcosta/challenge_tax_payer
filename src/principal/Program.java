package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> listPayers = new ArrayList<>();
		
		System.out.print("Quantos contribuintes você vai digitar: ");
		int numberPayer = sc.nextInt();
		
		for(int i = 1; i <= numberPayer; i++) {
			System.out.println("\nDigite os dados do " + i + "o contribuinte:");
			System.out.print("Renda anual com salário: ");
			double salaryIncome = sc.nextDouble();
			
			System.out.print("Renda anual com prestação de serviço: ");
			double serviceIncome = sc.nextDouble();
			
			System.out.print("Renda anual com ganho de capital: ");
			double capitalIncome = sc.nextDouble();
			
			System.out.print("Gastos médicos: ");
			double healtSpending = sc.nextDouble();
			
			System.out.print("Gastos educaionais: ");
			double educationSpending = sc.nextDouble();
			
			TaxPayer taxPayer = new TaxPayer(salaryIncome, serviceIncome, capitalIncome, healtSpending, educationSpending);
			
			listPayers.add(taxPayer);
		}

		for(TaxPayer taxPayer : listPayers) {
			int indice = listPayers.indexOf(taxPayer) + 1;
			System.out.println("\nResumo do " + indice  + "o Contribuinte: ");
			System.out.printf("Imposto bruto total: %.2f", taxPayer.grossTax());
			System.out.printf("\nAbatimento: %.2f", taxPayer.taxRebate());
			System.out.printf("\nImposto devido: %.2f", taxPayer.grossTax() - taxPayer.taxRebate());
			System.out.println();
		}
		sc.close();
	}
}
