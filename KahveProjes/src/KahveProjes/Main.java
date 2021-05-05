package KahveProjes;


public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new NeroCustomerManager(new CustomerCheckServis() {
			
			@Override
			public boolean CheckIfRealPerson(Customer customer) {
				
				return false;
			}
		});
		customerManager.Save(new Customer(1,"Ahmet","Balkaya","23/10/2001","253641"));

	}

}
