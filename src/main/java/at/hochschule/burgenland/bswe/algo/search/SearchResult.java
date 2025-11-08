package at.hochschule.burgenland.bswe.algo.search;

import java.util.List;

import at.hochschule.burgenland.bswe.algo.model.Airport;
import at.hochschule.burgenland.bswe.algo.model.Flight;

/**
 * Encapsulates the results of a flight search operation.
 */
public class SearchResult {
  private final Airport airport;
  private final List<Flight> flights;
  private final String searchCriteria;

    public SearchResult(Airport airport, List<Flight> flights, String searchCriteria) {
        this.airport = airport;
        this.flights = flights;
        this.searchCriteria = searchCriteria;
    }

  public Airport getAirport() {
    return airport;
  }

  public List<Flight> getFlights() {
    return flights;
  }

  public String getSearchCriteria() {
    return searchCriteria;
  }

  public boolean hasResults() {
    return !flights.isEmpty();
  }

  public int getResultCount() {
    return flights.size();
  }

  /**
   * Generates a string representation of the search results.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("=== Search Results ===\n");
    sb.append("Search Criteria: ").append(searchCriteria).append("\n");

    if (airport != null) {
      sb.append("Airport: ").append(airport.toString()).append("\n");
    }

    sb.append("Found ").append(flights.size()).append(" flight(s)\n");
    sb.append("─────────────────────────────────────────────────────────\n");

    if (flights.isEmpty()) {
      sb.append("No flights found matching the criteria.\n");
    } else {
      for (int i = 0; i < flights.size(); i++) {
        sb.append(String.format("%d. %s\n", i + 1, flights.get(i).toString()));
      }
    }
    return sb.toString();
  }
}
