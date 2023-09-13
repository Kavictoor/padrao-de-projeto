package company;

import Adapter.UserAdapter;
import clientes.Customer;
import clientes.CustomerAdapter;
import estoque.Product;
import estoque.ProductSale;
import funcionarios.Employee;
import funcionarios.EmployeeAdapter;

public class Salescompany {

	public static void main(String[] args) {

		Customer customer = new Customer("João Silva",25, "joao@email.com");
		Employee employee = new Employee("Maria Souza",45, "maria@email.com");
		Product product = new Product("Smartphone", 1000.0);

		UserAdapter customerAdapter = new CustomerAdapter(customer);
		UserAdapter employeeAdapter = new EmployeeAdapter(employee);
		

		ProductSale saleToCustomer = new ProductSale(customerAdapter, product);
		ProductSale saleToEmployee = new ProductSale(employeeAdapter, product);
		
		 System.out.println("Venda para o Cliente:");
	        saleToCustomer.makeSale();

	        System.out.println("\nVenda para o funcionário:");
	        saleToEmployee.makeSale();
	       
	        
	      
	        
	}
	
	

}

