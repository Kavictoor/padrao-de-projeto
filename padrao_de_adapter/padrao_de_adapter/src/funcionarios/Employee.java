package funcionarios;

public class Employee {
	
	public String nameEmp;
	public int ageEmp;
	public String emailEmp;
	
	
	public Employee(String nameEmp, int ageEmp, String emailEmp) {

		this.nameEmp = nameEmp;
		this.ageEmp = ageEmp;
		this.emailEmp = emailEmp;
	}


	public String getNameEmp() {
		return nameEmp;
	}


	public void setNameEmp(String nameEmp) {
		this.nameEmp = nameEmp;
	}


	public int getAgeEmp() {
		return ageEmp;
	}


	public void setAgeEmp(int ageEmp) {
		this.ageEmp = ageEmp;
	}


	public String getEmailEmp() {
		return emailEmp;
	}


	public void setEmailEmp(String emailEmp) {
		this.emailEmp = emailEmp;
	}
	


}
