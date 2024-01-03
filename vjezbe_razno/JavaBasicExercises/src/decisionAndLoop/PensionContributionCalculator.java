/*Employee's Age	Employee Rate (%)	Employer Rate (%)
55 and below			20					17
above 55 to 60			13					13
above 60 to 65			7.5					9
above 65				5					7.5 

*/

package decisionAndLoop;

import java.util.Scanner;

public class PensionContributionCalculator {

	public static void main(String[] args) {

		final int SALARY_CEILING = 6000;
		final double EMPLOYEE_RATE_55_AND_BELOW = 0.2;
		final double EMPLOYER_RATE_55_AND_BELOW = 0.17;
		final double EMPLOYEE_RATE_55_TO_60 = 0.13;
		final double EMPLOYER_RATE_55_TO_60 = 0.13;
		final double EMPLOYEE_RATE_60_TO_65 = 0.075;
		final double EMPLOYER_RATE_60_TO_65 = 0.09;
		final double EMPLOYEE_RATE_65_ABOVE = 0.05;
		final double EMPLOYER_RATE_65_ABOVE = 0.075;

		int salary, age;
		int contributableSalary;
		double employeeContribution, employerContribution, totalContribution;

		Scanner s = new Scanner(System.in);
		System.out.print("Enter salary: ");
		salary = s.nextInt();
		System.out.print("Enter age: ");
		age = s.nextInt();

		if(salary>6000) {
			contributableSalary = salary - 6000;
		}else {
			contributableSalary = salary;
		}
		
		

		if (age <= 55) {
			employeeContribution = contributableSalary * EMPLOYEE_RATE_55_AND_BELOW;
			employerContribution = contributableSalary * EMPLOYER_RATE_55_AND_BELOW;
			totalContribution = employeeContribution+employerContribution;
		}else if(age <=60) {
			employeeContribution = contributableSalary * EMPLOYEE_RATE_55_TO_60;
			employerContribution = contributableSalary * EMPLOYER_RATE_55_TO_60;
			totalContribution = employeeContribution+employerContribution;
		}else if(age <= 65) {
			employeeContribution = contributableSalary * EMPLOYEE_RATE_60_TO_65;
			employerContribution = contributableSalary * EMPLOYER_RATE_60_TO_65;
			totalContribution = employeeContribution+employerContribution;         
		}else {
			employeeContribution = contributableSalary * EMPLOYEE_RATE_65_ABOVE;
			employerContribution = contributableSalary * EMPLOYER_RATE_65_ABOVE;
			totalContribution = employeeContribution+employerContribution; 
		}
		
		System.out.printf("The employee's contribution is: $%.2f\n", employeeContribution);
		System.out.printf("The employer's contribution is: $%.2f\n", employerContribution);
		System.out.printf("The total contribution is: $%.2f\n", totalContribution);

	}

}
