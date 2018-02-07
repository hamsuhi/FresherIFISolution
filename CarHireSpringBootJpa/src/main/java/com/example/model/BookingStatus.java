package com.example.model;

import java.io.Serializable;
import javax.persistence.*;

import java.util.List;
import java.util.Set;


/**
 * The persistent class for the BookingStatus database table.
 * 
 */
@Entity
@NamedQuery(name="BookingStatus.findAll", query="SELECT b FROM BookingStatus b")
public class BookingStatus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="booking_status_code")
	private int bookingStatusCode;

	@Column(name="booking_status_description")
	private String bookingStatusDescription;

	//bi-directional many-to-one association to Booking
	@OneToMany(mappedBy="bookingStatus", fetch=FetchType.EAGER)
	private Set<Booking> bookings;

	public BookingStatus() {
	}
	

	public BookingStatus(String bookingStatusDescription) {
		super();
		this.bookingStatusDescription = bookingStatusDescription;
	}


	public int getBookingStatusCode() {
		return this.bookingStatusCode;
	}

	public void setBookingStatusCode(int bookingStatusCode) {
		this.bookingStatusCode = bookingStatusCode;
	}

	public String getBookingStatusDescription() {
		return this.bookingStatusDescription;
	}

	public void setBookingStatusDescription(String bookingStatusDescription) {
		this.bookingStatusDescription = bookingStatusDescription;
	}

	public Set<Booking> getBookings() {
		return this.bookings;
	}

	public void setBookings(Set<Booking> bookings) {
		this.bookings = bookings;
	}

	public Booking addBooking(Booking booking) {
		getBookings().add(booking);
		booking.setBookingStatus(this);

		return booking;
	}

	public Booking removeBooking(Booking booking) {
		getBookings().remove(booking);
		booking.setBookingStatus(null);

		return booking;
	}

}