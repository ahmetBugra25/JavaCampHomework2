package KahveProjes;

public class StarbucksCustomerManager extends BaseCustomerManager{
  private CustomerCheckServis customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckServis customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void Save(Customer customer) {
		if(customerCheckService.CheckIfRealPerson(customer)) {
			super.Save(customer);
		}else {
			System.out.println("Not a valid person");
		}
	}
}
