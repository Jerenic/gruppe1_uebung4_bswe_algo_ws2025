package at.hochschule.burgenland.bswe.algo.algorithm.finderutil;

import java.util.List;

import at.hochschule.burgenland.bswe.algo.model.Flight;

/**
 * Helper class for Dijkstra's algorithm priority queue.
 */
public class DijkstraNode {
  public double weight;
  public String airportIata;
  public List<Flight> path;

  public DijkstraNode(double weight, String airportIata, List<Flight> path) {
    this.weight = weight;
    this.airportIata = airportIata;
    this.path = path;
  }
}
