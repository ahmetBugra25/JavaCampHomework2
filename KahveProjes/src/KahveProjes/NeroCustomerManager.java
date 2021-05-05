package KahveProjes;

public class NeroCustomerManager extends BaseCustomerManager  {
	
private CustomerCheckServis customerCheckServis;
	
	public NeroCustomerManager(CustomerCheckServis customerCheckService) {
		super();
		this.customerCheckServis = customerCheckService;
	}
	
	@Override
	public void Save(Customer customer) {
		super.Save(customer);
	}

}
