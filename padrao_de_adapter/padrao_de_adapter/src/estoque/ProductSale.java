package estoque;

import Adapter.UserAdapter;
import funcionarios.EmployeeAdapter;

public class ProductSale {
	
	private UserAdapter user;
	private Product product;

	public ProductSale(UserAdapter user, Product product) {
		this.user = user;
		this.product = product;
	}
 
	 
	 public void makeSale() {
	        System.out.println( user.getName());
	        System.out.println("Email: " + user.getEmail());
	        System.out.println("Produto: " + product.getName());
	        if (user instanceof EmployeeAdapter) {
	            double priceWithEmployeeDiscount = product.getPrice() * 10/100;
	            System.out.println("O preço para funcionário é: R$" + (product.getPrice() - priceWithEmployeeDiscount));
	           
	        } else {
	            System.out.println("Preço: R$" + product.getPrice());
	        }
	       
	    }
	        
	    }

