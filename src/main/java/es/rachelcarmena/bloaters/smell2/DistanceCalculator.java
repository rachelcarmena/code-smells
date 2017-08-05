package es.rachelcarmena.bloaters.smell2;

public class DistanceCalculator {
    public double betweenPoints(Point point, Point point1) {
        return Math.sqrt(Math.pow((point1.getY() - point.getY()), 2) + Math.pow(point1.getX() - point.getX(), 2));
    }

    public double toOriginFrom(Point point) {
        return Math.sqrt(Math.pow(point.getY(), 2) + Math.pow(point.getX(), 2));
    }
}
