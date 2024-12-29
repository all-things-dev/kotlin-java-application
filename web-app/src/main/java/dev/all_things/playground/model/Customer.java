package dev.all_things.playground.model;

public class Customer
{
	private String firstName;
	private String lastName;

	public Customer(final String firstName, final String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName()
	{
		return this.firstName;
	}

	public void setFirstName(final String firstName)
	{
		this.firstName = firstName;
	}

	public String getLastName()
	{
		return this.lastName;
	}

	public void setLastName(final String lastName)
	{
		this.lastName = lastName;
	}
}
