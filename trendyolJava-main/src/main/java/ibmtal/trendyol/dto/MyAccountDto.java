package ibmtal.trendyol.dto;

public class MyAccountDto {
private int id;
private String name;
private String age;
private String email;
private String phonenumber;
private String password;
private String surname;
private String username;
public MyAccountDto() {
	super();
}
public MyAccountDto(int id, String name, String age, String email, String phonenumber, String password, String surname,
		String username) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
	this.email = email;
	this.phonenumber = phonenumber;
	this.password = password;
	this.surname = surname;
	this.username = username;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhonenumber() {
	return phonenumber;
}
public void setPhonenumber(String phonenumber) {
	this.phonenumber = phonenumber;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getSurname() {
	return surname;
}
public void setSurname(String surname) {
	this.surname = surname;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
}
