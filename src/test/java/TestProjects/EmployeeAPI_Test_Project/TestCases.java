package TestProjects.EmployeeAPI_Test_Project;

import org.testng.annotations.Test;

public class TestCases {
	
	
	get_ViewEmployeeList viewEmployeeList = new get_ViewEmployeeList();
	get_ViewSingleEmployeeDetail viewEmployeeDetail = new get_ViewSingleEmployeeDetail();
	post_CreateEmployee createEmployee = new post_CreateEmployee();
	put_ChangeEmployeeInformation employeeUpdate = new put_ChangeEmployeeInformation();
	delete_DeleteSingleEmployeeInformation deleteEmployeeByID = new delete_DeleteSingleEmployeeInformation();
	
	@Test
	public void getEmployee_Positive() {
		viewEmployeeList.getEmployeeList();
	}
	
	@Test
	public void createEmployee_Positive() {
		createEmployee.CreateNewEmployee("Mehedi Zam", "12344", "32");
	}
	
	@Test
	public void updateEmployee() {
		employeeUpdate.updateExistingEmployee();
	}
	
	@Test
	public void deleteEmployee() {
		deleteEmployeeByID.deleteExistingEmployee();
	}
	
	
	

}
