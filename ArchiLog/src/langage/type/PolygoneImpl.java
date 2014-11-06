package langage.type;

/**
 * @author Timoth� Barbe et Christophe Comoretto
 * 
 */
import java.awt.Point;
import java.util.Arrays;

public class PolygoneImpl implements CheminFerme {

	private Point points[];

	public PolygoneImpl(Point[] points) {
		this.points = points;
	}

	public Point[] getPoints() {
		return points;
	}

	public void setPoints(Point[] points) {
		this.points = points;
	}

	@Override
	public String toString() {
		return "PolygoneImpl [points=" + Arrays.toString(points) + "]";
	}

}
