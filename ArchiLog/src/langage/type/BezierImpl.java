package langage.type;

import java.awt.Point;

public class BezierImpl implements CheminOuvert {

	private Point points[];

	public BezierImpl(Point point1, Point point2) {
		this.points = new Point[] { point1, point2 };
	}

	public BezierImpl(Point point1, Point point2, Point point3) {
		this.points = new Point[] { point1, point2, point3 };
	}

	public Point[] getPoints() {
		return points;
	}

	public void setPoints(Point[] points) {
		this.points = points;
	}
}
