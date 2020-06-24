package com.revature.dmv.model;

import javax.ws.rs.BeanParam;
import javax.ws.rs.FormParam;
import javax.ws.rs.QueryParam;
import java.util.Objects;

public class Person {

	private String firstName;

	private String lastName;

	private String reason;

	public Person(String firstName, String lastName, String reason)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.reason = reason;
	}

	public Person(){

	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public String getReason()
	{
		return reason;
	}

	public void setReason(String reason)
	{
		this.reason = reason;
	}

	@Override
	public boolean equals(Object o)
	{
		if(this == o)
		{
			return true;
		}
		if(o == null || getClass() != o.getClass())
		{
			return false;
		}
		Person person = (Person) o;
		return Objects.equals(firstName, person.firstName) &&
				Objects.equals(lastName, person.lastName) &&
				Objects.equals(reason, person.reason);
	}

	@Override
	public int hashCode()
	{
		return Objects.hash(firstName, lastName, reason);
	}

	@Override
	public String toString()
	{
		return "Person{" +
				"firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", reason='" + reason + '\'' +
				'}';
	}

}
