package TestProjects.EmployeeAPI_Test_Project;

import static org.testng.Assert.assertEquals;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCases {
	
	
	get_ViewEmployeeList viewEmployeeList = new get_ViewEmployeeList();
	get_ViewSingleEmployeeDetail viewEmployeeDetail = new get_ViewSingleEmployeeDetail();
	post_CreateEmployee createEmployee = new post_CreateEmployee();
	put_ChangeEmployeeInformation employeeUpdate = new put_ChangeEmployeeInformation();
	delete_DeleteSingleEmployeeInformation deleteEmployeeByID = new delete_DeleteSingleEmployeeInformation();
	
	String EMP_Name = RandomStringUtils.randomAlphabetic(9);
	
	
	@Test
	public void getEmployee_Positive() {
		viewEmployeeList.getEmployeeList();
		System.out.println(viewEmployeeList.returnEmployeeID(1));
		Assert.assertEquals(viewEmployeeList.returnEmployeeID(1) , "2");
	}
	
	@Test
	public void createEmployee_Positive() {
		createEmployee.CreateNewEmployee(EMP_Name, "12344", "32");
		System.out.println("the employee name is: "+createEmployee.getEmployeeName());
		Assert.assertEquals(createEmployee.getStatus(), "success");
		Assert.assertEquals(createEmployee.getMessage(), "Successfully! Record has been added.");
	
	}
	
	@Test
	public void getEmployeeDetail() {
		createEmployee.CreateNewEmployee(EMP_Name, "12344", "32");
		int emp_ID = Integer.parseInt(createEmployee.getEmployeeID());
		viewEmployeeDetail.viewingEmployeeDetail(emp_ID);
		
		Assert.assertEquals(viewEmployeeDetail.getStatus()  , "success");
	}
	
	@Test
	public void updateEmployee() {
		employeeUpdate.updateExistingEmployee("", "", "", "");
		
		Assert.assertEquals("" , "");
	}
	
	@Test
	public void deleteEmployee() {
		deleteEmployeeByID.deleteExistingEmployee("");
		
		Assert.assertEquals("" , "");
	}
	
	
	

}
