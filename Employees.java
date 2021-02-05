
import java.util.ArrayList;

public class Employees implements employeedata{
	int id ;
	String name ;
	int age;
	
	public void enterEmployeesData() {
		this.id=15;
		this.name="Aston";
		this.age=24;
		
	}
	public void printEmployees() {
		System.out.println("Your Employee Details are" + "Id : " + id + " Name : "+name+ " Age : " + age);
	}
	
	public void enterEmployeesData(int id,String name ,int age) {
		this.id=id;
		this.name=name;
		this.age=age;
		
		System.out.println("Your Employee Details are" + "Id : " + id + " Name : "+name+ " Age : " + age);
		
	}
	
	
	@Override
	public void empName() {
		System.out.println("Your Employee Details are" + "Id : " + id + " Name : "+name+ " Age : " + age);
		
	}

}
