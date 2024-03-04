package tester;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

import com.emp.core.Employee;
import com.emp.core.FullTimeEmp;
import com.emp.core.PartTimeEmp;

public class EmpManagementTester {

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in))
		{
			HashMap<Integer, Employee> employees = new HashMap<>();
			boolean exit= false;
			while(!exit)
			{
				try {
					System.out.println("1.Add full time employee\r\n"
							+ "2.Add part time employee\r\n"
							+ "3.Delete an employee by Emp Id\r\n"
							+ "4.Search employee details by Aadhaar number\r\n"
							+ "5.Display all employee details\r\n"
							+ "6.Display all employee details sorted by date of joining\r\n"
							+ "7.Exit");
					
					switch(sc.nextInt())
					{
					
					case 1:
						System.out.println("Enter Emp no:");
						int empno=sc.nextInt();
						System.out.println("Enter EmpId, Name, Date of Joining,Phone Number, Aadhaar Number,Monthly Salary ");
						
						//FullTimeEmp(String name, LocalDate dateOfJoining, String phoneNumber, String aadhaarNumber,
						//double monthlySalary);
						FullTimeEmp fte = new FullTimeEmp(sc.nextInt(),sc.next(), LocalDate.parse(sc.next()), sc.next(), sc.next(),sc.nextDouble());
						employees.put(empno, fte);
						System.out.println("New Full Time Employee Added!!!");
						break;
						
					case 2:
						System.out.println("Enter Emp no:");
						int empno1=sc.nextInt();
						System.out.println("Enter  EmpId, Name, Date of Joining,Phone Number, Aadhaar Number,Monthly Salary ");
						
						//FullTimeEmp(String name, LocalDate dateOfJoining, String phoneNumber, String aadhaarNumber,
						//double monthlySalary);
						PartTimeEmp pte = new PartTimeEmp(sc.nextInt(),sc.next(), LocalDate.parse(sc.next()), sc.next(), sc.next(),sc.nextDouble());
						employees.put(empno1, pte);
						System.out.println("New Part Time Employee Added!!!");
						break;
						
					case 3:
						System.out.println("Enter EmpId to delete employee.");
						int empno2 = sc.nextInt();
						employees.remove(empno2);
						System.out.println("Employee Deleted!!");
						break;
					
					case 4:
						System.out.println("Enter Aadhaar Number to search:");
						String aadharno=sc.next();
						for (Employee e : employees.values())
						{
							if(e.getAadhaarNumber().equals(aadharno))
								System.out.println("Employee Found: " + e);
						}
						break;
						
					case 5:						
						for(Employee e :employees.values())
						{
							System.out.println("Employee Details:" + e);
						}
						break;
						
					case 6:
						System.out.println("Employees Sorted by Date of joining:");
						employees.values().stream()
						.sorted(Comparator.comparing(Employee::getDateOfJoining))
						.forEach(p -> System.out.println(p));
						break;
					
					case 0:
						exit=true;
						break;
					
					
					}//end of switch
					
					
				}//end of inner try
				catch(Exception e)
				{
					e.printStackTrace();
				}//end of inner try
				
				
				
			}//end of while
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}//end of try
		catch(Exception e)
		{
			e.printStackTrace();
		}//end of catch
	}

}
