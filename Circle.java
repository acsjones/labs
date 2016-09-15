import java.text.DecimalFormat;
/**
 * This holds the variables and methods for calculating circles.
 */
public class Circle {
public double radius;

	public double getArea() {
		return (Math.PI * (radius * radius));
	}

	private double getCircumference() {
		return (Math.PI * 2 * radius);
	}

	static int objectCount = 0;

	public static int getObjectCount() {
		;
		return objectCount++;
	}

	private String formatNumber(double x) {
		DecimalFormat df = new DecimalFormat(".##");
		return df.format(x);
	}

	public String getFormattedCircumference() {
		return formatNumber(getCircumference());
	}
/**
 *         Calculate area then 
 * @return Returns the  area with the format of ".##"
 */
	public String getFormattedArea() {
		return formatNumber(getArea());
	}

}
