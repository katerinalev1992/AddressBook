package application;

public class Person {
	
	private String firstName;
	private String lastName;
	private String sex;
	private String email;
	private String tel;
	
	
	public Person(String firstName, String lastName, String sex, String email, String tel) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.sex = sex;
		this.email = email;
		this.tel = tel;
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


	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTel() {
		return tel;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
	
}
