package es.rachelcarmena.bloaters.smell2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DistanceCalculatorShould {
    private DistanceCalculator distanceCalculator;

    @Before
    public void setUp() throws Exception {
        distanceCalculator = new DistanceCalculator();
    }

    @Test
    public void calculate_distance_between_points() {
        double distance = distanceCalculator.betweenPoints(1, 5, 2, 8);

        assertEquals(3.16, distance, 0.01);
    }

    @Test
    public void calculate_distance_from_one_point_to_origin() {
        double distance = distanceCalculator.toOriginFrom(1, 5);

        assertEquals(5.1, distance, 0.01);
    }
}
