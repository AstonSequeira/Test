import java.util.ArrayList;

public class EmpMain {

	public static void main(String[] args) {
		Employees emp = new Employees();
		emp.enterEmployeesData();
		emp.printEmployees();
		emp.enterEmployeesData(20, "Bruce", 30);
		
		ArrayList <employeedata> obj = new ArrayList<>(23);
		EmpSal sal = new EmpSal();
		sal.getSal();
}
}
