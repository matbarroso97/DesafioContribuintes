package Entities;

public class TaxPayer {

    private Double salaryIncome;
    private Double servicesIncome;
    private Double capitalIncome;
    private Double healthSpending;
    private Double educationSpending;


    public TaxPayer(Double salaryIncome, Double servicesIncome, Double capitalIncome, Double healthSpending, Double educationSpending) {
        this.salaryIncome = salaryIncome;
        this.servicesIncome = servicesIncome;
        this.capitalIncome = capitalIncome;
        this.healthSpending = healthSpending;
        this.educationSpending = educationSpending;
    }

    public double salaryTax(){

        if (salaryIncome / 12 < 3000.00) {
            return 0;
        } else if (salaryIncome / 12 <= 5000.00) {
            return salaryIncome * 10 / 100;
        } else {
            return salaryIncome * 20 / 100;
        }

    }

    public double servicesTax(){
        if(servicesIncome > 0) {
            return servicesIncome * 15 / 100;
        }
        else {
            return 0.0;
            }
        }


    public double capitalTax(){
        if(capitalIncome > 0) {
            return capitalIncome * 20 / 100;
        }
        else {
            return 0.0;
        }
    }

   public double grossTax(){
        return salaryTax() + servicesTax() + capitalTax();
   }

   public double taxRebate(){
       return Math.min(healthSpending + educationSpending, (grossTax() * 30) / 100);
    }

   public double netTax(){
        return grossTax() - taxRebate();
   }

    @Override
    public String toString() {
        return "Imposto bruto total: " + String.format("%.2f\n", grossTax())  + "Abatimento: " + String.format("%.2f\n", taxRebate()) + "Imposto devido: " + String.format("%.2f", netTax());
    }
}
