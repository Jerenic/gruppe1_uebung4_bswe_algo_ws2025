package at.hochschule.burgenland.bswe.algo.algorithm.finderutil;

import at.hochschule.burgenland.bswe.algo.model.Flight;

/**
 * Functional interface for calculating edge weights in Dijkstra's algorithm.
 */
public interface WeightFunction {
  double getWeight(Flight flight);
}
