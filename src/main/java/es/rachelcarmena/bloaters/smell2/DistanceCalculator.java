package es.rachelcarmena.bloaters.smell2;

public class DistanceCalculator {
    public double betweenPoints(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((y2 - y1), 2) + Math.pow(x2 - x1, 2));
    }

    public double toOriginFrom(int x, int y) {
        return Math.sqrt(Math.pow(y, 2) + Math.pow(x, 2));
    }
}
