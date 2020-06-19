package cs1302.shapes;

/**
 * A circle is an {@link Ellipse} where both focul points are in the same location. It therefore
 * defines a curve in a plane surrounding a single focul point, such that the distance to the focul
 * point is constant for every point on the curve. The line through the focul point is called the
 * diameter. Half of this length is called the radius, denoting the distance from the focul
 * point to any point on the curve.
 */
public class Circle {

    private string name;
	
	public void setName(String name) {
		
        if (name == null) throw new NullPointerException("name cannot be null");
        else if (name.isEmpty()) throw new IllegalArgumentException("name cannot be an empty string");
        else this.name = name;
        
    }
	
	public String getName() {
        return name;
    }

    /** Length of the semi-major axis. */
    private double a;

    /** Length of the semi-minor axis. */
    private double b;
	
	public Ellipse(double radius) {
		
        setName("Circle");
        this.a = radius;
        this.b = radius;
		
    }
	
	public double getSemiMajorAxisLength() {
        return a;
    }
	
    public double getSemiMinorAxisLength() {
        return b;
    }

    public double getArea() {
        return Math.PI * a * b;
    }
	
    public double getPerimeter() {
        return getCircumference();
    }
	
    public double getCircumference() {
        return Math.PI * getDiameter();
    }
	
    public double getDiameter() {
        return 2.0 * getRadius();
    }
	
    public double getRadius() {
        return getSemiMajorAxisLength();
    }

}