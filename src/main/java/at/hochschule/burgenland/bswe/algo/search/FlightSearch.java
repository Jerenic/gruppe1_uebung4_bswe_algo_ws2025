package at.hochschule.burgenland.bswe.algo.search;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import at.hochschule.burgenland.bswe.algo.model.Airport;
import at.hochschule.burgenland.bswe.algo.model.Flight;

/**
 * Provides linear search functionality for flights.
 * Supports searching by origin, destination, airline, and flight number.
 */
public class FlightSearch {
  private final List<Flight> flights;
  private final Map<String, Airport> airports;

  /**
   * Constructs a FlightSearch with the given flights and airports.
   *
   * @param flights  List of all flights
   * @param airports Map of IATA codes to Airport objects
   */
  public FlightSearch(List<Flight> flights, Map<String, Airport> airports) {
    this.flights = flights;
    this.airports = airports;
  }

  /**
   * Searches for flights by origin airport IATA code.
   * Uses linear search to find all matching flights.
   *
   * @param iata IATA code of the origin airport
   * @return SearchResult containing the airport and matching flights
   */
  public SearchResult searchByOrigin(String iata) {
    Airport airport = airports.get(iata.toUpperCase());
    List<Flight> matchingFlights = new ArrayList<>();

    // Linear search through all flights
    for (Flight flight : flights) {
      if (flight.getOrigin().equalsIgnoreCase(iata)) {
        matchingFlights.add(flight);
      }
    }

    return new SearchResult(airport, matchingFlights, "Origin: " + iata);
  }

  /**
   * Searches for flights by destination airport IATA code.
   * Uses linear search to find all matching flights.
   *
   * @param iata IATA code of the destination airport
   * @return SearchResult containing the airport and matching flights
   */
  public SearchResult searchByDestination(String iata) {
    Airport airport = airports.get(iata.toUpperCase());
    List<Flight> matchingFlights = new ArrayList<>();

    // Linear search through all flights
    for (Flight flight : flights) {
      if (flight.getDestination().equalsIgnoreCase(iata)) {
        matchingFlights.add(flight);
      }
    }

    return new SearchResult(airport, matchingFlights, "Destination: " + iata);
  }

  /**
   * Searches for flights by airline name.
   * Uses linear search with case-insensitive partial matching.
   *
   * @param airline Airline name (or partial name)
   * @return SearchResult containing matching flights
   */
  public SearchResult searchByAirline(String airline) {
    List<Flight> matchingFlights = new ArrayList<>();

    // Linear search through all flights
    for (Flight flight : flights) {
      if (flight.getAirline().toLowerCase().contains(airline.toLowerCase())) {
        matchingFlights.add(flight);
      }
    }

    return new SearchResult(null, matchingFlights, "Airline: " + airline);
  }

  /**
   * Searches for flights by flight number.
   * Uses linear search with case-insensitive exact matching.
   *
   * @param flightNumber Flight number to search for
   * @return SearchResult containing matching flights
   */
  public SearchResult searchByFlightNumber(String flightNumber) {
    List<Flight> matchingFlights = new ArrayList<>();

    // Linear search through all flights
    for (Flight flight : flights) {
      if (flight.getFlightNumber().equalsIgnoreCase(flightNumber)) {
        matchingFlights.add(flight);
      }
    }
    return new SearchResult(null, matchingFlights, "Flight Number: " + flightNumber);
  }
}
