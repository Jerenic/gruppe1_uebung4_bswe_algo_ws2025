package at.hochschule.burgenland.bswe.algo.model;

/**
 * Represents an airport with its identifying information and geographic coordinates.
 * This class is used as a node in the flight route graph.
 */
public class Airport {
  private final int id;
  private final String iata;
  private final String city;
  private final String country;
  private final double latitude;
  private final double longitude;

  /**
   * Constructs an Airport with the specified details.
   *
   * @param id        Unique identifier for the airport
   * @param iata      Three-letter IATA code (e.g., "VIE", "JFK")
   * @param city      City where the airport is located
   * @param country   Country where the airport is located
   * @param latitude  Geographic latitude coordinate
   * @param longitude Geographic longitude coordinate
   */
  public Airport(int id, String iata, String city, String country, double latitude, double longitude) {
    this.id = id;
    this.iata = iata;
    this.city = city;
    this.country = country;
    this.latitude = latitude;
    this.longitude = longitude;
  }

  /**
   * Retrieves the unique identifier of the airport.
   *
   * @return the unique identifier of the airport
   */
  public int getId() {
    return id;
  }

  /**
   * Retrieves the three-letter IATA code of the airport.
   *
   * @return the IATA code of the airport
   */
  public String getIata() {
    return iata;
  }

  /**
   * Retrieves the name of the city where this airport is located.
   *
   * @return the city name associated with this airport
   */
  public String getCity() {
    return city;
  }

  /**
   * Retrieves the country where the airport is located.
   *
   * @return the country name as a string
   */
  public String getCountry() {
    return country;
  }

  /**
   * Retrieves the geographic latitude coordinate of the airport.
   *
   * @return the latitude coordinate of the airport
   */
  public double getLatitude() {
    return latitude;
  }

  /**
   * Retrieves the geographic longitude coordinate of the airport.
   *
   * @return the longitude of the airport.
   */
  public double getLongitude() {
    return longitude;
  }


  /**
   * Returns a string representation of the airport.
   * The string includes the IATA code, city, country, unique ID,
   * and geographic coordinates (latitude and longitude) of the airport.
   *
   * @return a formatted string representing the airport details
   */
  @Override
  public String toString() {
    return String.format("%s (%s) - %s, %s [ID: %d, Coords: %.2f, %.2f]",
        iata, city, country, city, id, latitude, longitude);
  }

  /**
   * Indicates whether some other object is "equal to" this one.
   * Two Airport objects are considered equal if their IDs are identical.
   *
   * @param o the object to compare with this instance
   * @return true if this object is the same as the input object, or if they are of the same class
   *         and have identical IDs, otherwise false
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Airport airport = (Airport) o;
    return id == airport.id;
  }

  /**
   * Returns the hash code value for this Airport object.
   * The hash code is computed based on the unique identifier of the airport.
   *
   * @return the hash code value of this Airport object
   */
  @Override
  public int hashCode() {
    return Integer.hashCode(id);
  }
}
