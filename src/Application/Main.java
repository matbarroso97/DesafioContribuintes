package Application;

import Entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quantos contribuintes você vai digitar? ");
        int n = sc.nextInt();
        System.out.println();

        List<TaxPayer> list = new ArrayList<>();


        for (int i = 0; i < n; i++) {
            System.out.println("Digite os dados do " + (i + 1) + "o contribuinte:");
            System.out.print("Renda anual com salário: ");
            double salaryIncome = sc.nextDouble();
            System.out.print("Renda anual com prestação de serviço: ");
            double servicesIncome = sc.nextDouble();
            System.out.print("Renda anual com ganho de capital: ");
            double capitalIncome = sc.nextDouble();
            System.out.print("Gastos médicos: ");
            double healthSpending = sc.nextDouble();
            System.out.print("Gastos educacionais: ");
            double educationSpending = sc.nextDouble();
            System.out.println();
            TaxPayer emp = new TaxPayer(salaryIncome, servicesIncome, capitalIncome, healthSpending, educationSpending);
            list.add(emp);

        }

        for (int i = 0; i < n; i++){
            System.out.println("Resumo do " + (i + 1) + "o contribuinte: ");
            System.out.println(list.get(i));
            System.out.println();
        }



    }
}