package cs1302.shapes;

public class Ellipse {
	
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

    public Ellipse(double a, double b) {
		
        setName("Ellipse");
        this.a = a;
        this.b = b;
		
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
        double h = ((a - b) * (a - b)) / ((a + b) * (a + b));
        double p = Math.PI * (a + b) * (1.0 + ((3.0 * h) / (10 + Math.sqrt(4.0 - 3.0 * h))));
        return p;
    }

}