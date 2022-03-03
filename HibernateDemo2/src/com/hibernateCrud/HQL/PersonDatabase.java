package com.hibernateCrud.HQL;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity(name="Persons")
@Table(name="Persons")
public class PersonDatabase 
{
	@Id
	@Column(name="personId")
	int personId;
	
	@Column(name="firstName")
	String firstName;
	
	@Column(name="lastName")
	String lastName;
	
	@Column(name="address")
	String address;
	
	@Column(name="City")
	String City;

	public int getPersonId() {
		return personId;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public PersonDatabase(int personId, String firstName, String lastName, String address, String city) {
		this.personId = personId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		City = city;
	}

	public PersonDatabase(String firstName, String lastName, String address, String city) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		City = city;
	}
	public PersonDatabase()
	{
		
	}

	@Override
	public String toString() {
		return "PersonDatabase [personId=" + personId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", address=" + address + ", City=" + City + "]";
	}
	
	
	

}
