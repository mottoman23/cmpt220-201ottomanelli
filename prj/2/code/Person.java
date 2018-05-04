import java.util.Scanner;

public class Person {
	private String name;
	private boolean gender;
	private double salary;
	private boolean hasHealthInsurance;
	private int age;
	
	public Person (String name, boolean gender, double salary, boolean hasHealthInsurance, int age) {
		this.name = name;
		this.gender = gender;
		this.salary = salary;
		this.hasHealthInsurance = hasHealthInsurance;
		this.age = age;
	}
	
	String getName() {
		return this.name;
	}
	
	boolean getGender() {
		return this.gender;
	}
	
	double getSalary() {
		return this.salary;
	}
	
	boolean getInsuranceState() {
		return this.hasHealthInsurance;
	}
	
	int getAge() {
		return this.age;
	}
	
	void setName(String updatedName) {
		this.name = updatedName;
	}
	
	void setGender(boolean updatedGender) {
		this.gender = updatedGender;
	}
	
	void setSalary(double updatedSalary) {
		this.salary = updatedSalary;
	}
	
	void setInsuranceState(boolean updatedInsuranceState) {
		this.hasHealthInsurance = updatedInsuranceState;
	}
	
	void setAge(int updatedAge) {
		this.age = updatedAge;
	}
}