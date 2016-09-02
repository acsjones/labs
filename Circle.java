import java.text.DecimalFormat;

public class Circle {

	public double radius;

	public double getArea() {
		return (Math.PI * (radius * radius));
	}

	public double getCircumference() {
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

	public String getFormattedArea() {
		return formatNumber(getArea());
	}

}
