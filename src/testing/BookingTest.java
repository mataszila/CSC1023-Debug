package testing;

import java.util.Date;

import project1.Customer;
import project1.Delivery;
import project1.ShowBooking;
import project1.Show;
import project1.Ticket;

/*
 * Test class
 * 
 * @author Jennifer D. Warrender (njw125)
 * @author Joe Bloggs (b1023456)
 * 
 */
public class BookingTest {

	public static void main(String[] args) {

		// examples of how to create an instance of each class

		// create new show
		Show phantom = new Show("The Phantom of the Lecture Theatre", false, new Date());

		// create new customer that wants his tickets posted
		Customer c = new Customer("Joe Bloggs", "Claremont Tower, Newcastle University, Newcastle-upon-Tyne, NE1 7RY",
				Delivery.POST);

		// create new show booking for customer
		ShowBooking booking1 = new ShowBooking(phantom);
		
		// you may use this test class to help with your assessment
		System.out.println("TODO");
		
	}

}
