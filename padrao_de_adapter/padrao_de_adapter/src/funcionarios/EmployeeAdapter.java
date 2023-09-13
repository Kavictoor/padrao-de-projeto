package funcionarios;

import Adapter.UserAdapter;

public class EmployeeAdapter implements UserAdapter {
	
    private Employee employee;

    public EmployeeAdapter(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String getName() {
        return employee.getNameEmp();
    }

    @Override
    public String getEmail() {
        return employee.getEmailEmp();
    
    }
}