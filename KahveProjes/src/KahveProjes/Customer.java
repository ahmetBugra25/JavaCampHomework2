package KahveProjes;

public class Customer {
	private int id;
	private String firstName;
	private String lastName;
	private String dataofBirth;
	private String NationlaNumber;
	
	
	public Customer() {
		
	}


	public Customer(int id, String firstName, String lastName, String dataofBirth, String nationlaNumber) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dataofBirth = dataofBirth;
		NationlaNumber = nationlaNumber;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getDataofBirth() {
		return dataofBirth;
	}


	public void setDataofBirth(String dataofBirth) {
		this.dataofBirth = dataofBirth;
	}


	public String getNationlaNumber() {
		return NationlaNumber;
	}


	public void setNationlaNumber(String nationlaNumber) {
		NationlaNumber = nationlaNumber;
	}



}
