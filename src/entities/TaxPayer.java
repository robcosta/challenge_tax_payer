package entities;

public class TaxPayer {

	private double salaryIncome;
	private double serviceIncome;
	private double capitalIncome;
	private double healtSpending;
	private double educationSpending;

	public TaxPayer() {
	}

	public TaxPayer(double salaryIncome, double serviceIncome, double capitalIncome, double healtSpending,
			double educationSpending) {
		this.salaryIncome = salaryIncome;
		this.serviceIncome = serviceIncome;
		this.capitalIncome = capitalIncome;
		this.healtSpending = healtSpending;
		this.educationSpending = educationSpending;
	}

	public double getSalaryIncome() {
		return salaryIncome;
	}

	public void setSalaryIncome(double salaryIncome) {
		this.salaryIncome = salaryIncome;
	}

	public double getServiceIncome() {
		return serviceIncome;
	}

	public void setServiceIncome(double serviceIncome) {
		this.serviceIncome = serviceIncome;
	}

	public double getCapitalIncome() {
		return capitalIncome;
	}

	public void setCapitalIncome(double capitalIncome) {
		this.capitalIncome = capitalIncome;
	}

	public double getHealtSpending() {
		return healtSpending;
	}

	public void setHealtSpending(double healtSpending) {
		this.healtSpending = healtSpending;
	}

	public double getEducationSpending() {
		return educationSpending;
	}

	public void setEducationSpending(double educationSpending) {
		this.educationSpending = educationSpending;
	}

	public double salaryTax() {
		double taxSalary = 0.0;
		if (salaryIncome >= 30000.0)
			taxSalary = salaryIncome * 0.1;
		if (salaryIncome >= 50000.0)
			taxSalary = salaryIncome * 0.2;

		return taxSalary;
	}
	
	public double serviceTax() {
		double  taxService= serviceIncome * 0.15;
		return taxService;
	}
	
	public double capitalTax() {
		double  taxCapital= capitalIncome * 0.20;
		return taxCapital;
	}
	
	public double grossTax() {
		return salaryTax() + serviceTax() + capitalTax();
	}
	
	public double taxRebate() {
		double maxRebate = healtSpending + educationSpending;
		if(maxRebate > grossTax() * 0.3)
			maxRebate = grossTax() * 0.3;

		return maxRebate;
	}

}
