package at.hochschule.burgenland.bswe.algo.model;

import java.time.LocalTime;

/**
 * Represents a flight between two airports.
 * This class is used as an edge in the flight route graph.
 */
public class Flight {

  private final int id;
  private final String origin;
  private final String destination;
  private final String airline;
  private final String flightNumber;
  private final int duration; // in minutes
  private final double price;
  private final LocalTime departureTime;


  /**
   * Constructs a Flight with the specified details.
   *
   * @param id            Unique identifier for the flight
   * @param origin        IATA code of the origin airport
   * @param destination   IATA code of the destination airport
   * @param airline       Name of the airline operating the flight
   * @param flightNumber  Flight number (e.g., "AA100")
   * @param duration      Flight duration in minutes
   * @param price         Price of the flight
   * @param departureTime Departure time of the flight
   */
  public Flight(int id, String origin, String destination, String airline,
                String flightNumber, int duration, double price, LocalTime departureTime) {
    this.id = id;
    this.origin = origin;
    this.destination = destination;
    this.airline = airline;
    this.flightNumber = flightNumber;
    this.duration = duration;
    this.price = price;
    this.departureTime = departureTime;
  }

  /**
   * Retrieves the unique identifier of the flight.
   *
   * @return the unique identifier of the flight
   */
  public int getId() {
    return id;
  }

  /**
   * Retrieves the IATA code of the origin airport for this flight.
   *
   * @return the IATA code of the origin airport
   */
  public String getOrigin() {
    return origin;
  }

  /**
   * Retrieves the IATA code of the destination airport for this flight.
   *
   * @return the IATA code of the destination airport
   */
  public String getDestination() {
    return destination;
  }

  /**
   * Retrieves the name of the airline operating the flight.
   *
   * @return the name of the airline
   */
  public String getAirline() {
    return airline;
  }

  /**
   * Retrieves the flight number of the flight.
   *
   * @return the flight number as a string
   */
  public String getFlightNumber() {
    return flightNumber;
  }

  /**
   * Retrieves the duration of the flight.
   *
   * @return the flight duration in minutes
   */
  public int getDuration() {
    return duration;
  }

  /**
   * Retrieves the price of the flight.
   *
   * @return the price of the flight
   */
  public double getPrice() {
    return price;
  }

  /**
   * Retrieves the departure time of the flight.
   *
   * @return the departure time of the flight as a {@code LocalTime} object
   */
  public LocalTime getDepartureTime() {
    return departureTime;
  }

  /**
   * Returns a string representation of the Flight object.
   * The string includes details such as the flight number, unique ID,
   * origin, destination, airline, flight duration, price, and departure time.
   *
   * @return a formatted string representing the flight details
   */
  @Override
  public String toString() {
    return String.format("Flight %s [ID: %d] - %s → %s | %s | Duration: %d min | Price: $%.2f | Departs: %s",
        flightNumber, id, origin, destination, airline, duration, price, departureTime);
  }

  /**
   * Indicates whether some other object is "equal to" this instance.
   * Two Flight objects are considered equal if their IDs are identical.
   *
   * @param o the object to compare with this instance
   * @return true if this object is the same as the input object,
   *         or if they are of the same class and have identical IDs, otherwise false
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Flight flight = (Flight) o;
    return id == flight.id;
  }

  /**
   * Returns the hash code value for this Flight object.
   * The hash code is computed based on the unique identifier of the flight.
   *
   * @return the hash code value of this Flight object
   */
  @Override
  public int hashCode() {
    return Integer.hashCode(id);
  }
}
