package modelclassuses;

public class ResponseModelClass {

	private int id;
	private String name;
	private String username;
	private String email;
	private Address address;
	private String phone;
	private String website;

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	Company company;

	public Address getAddress() {
		return address;
	}

	public Company getCompany() {
		return company;
	}

	public String getEmail() {
		return email;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	public String getUsername() {
		return username;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
