package modelclassuses;

import java.util.Objects;

public class ResponseModelClass {

	private int id;
	private String name;
	private String username;
	private String email;
	private Address address;
	private String phone;
	private String website;
	private Company company;

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

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

	@Override
	public String toString() {
		return "ResponseModelClass [id=" + id + ", name=" + name + ", username=" + username + ", email=" + email
				+ ", address=" + address + ", phone=" + phone + ", website=" + website + ", company=" + company + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, company, email, id, name, phone, username, website);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ResponseModelClass other = (ResponseModelClass) obj;
		return Objects.equals(address, other.address) && Objects.equals(company, other.company)
				&& Objects.equals(email, other.email) && id == other.id && Objects.equals(name, other.name)
				&& Objects.equals(phone, other.phone) && Objects.equals(username, other.username)
				&& Objects.equals(website, other.website);
	}

}
