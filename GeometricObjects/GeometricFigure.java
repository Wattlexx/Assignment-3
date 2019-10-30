package GeometricObjects;

public abstract class GeometricFigure {
	int height;
	int width;
	String figureType;
	double area;
	
	public GeometricFigure(int h, int w, String type) {
		height = h;
		width = w;
		figureType = type;
	}
	
	abstract void area();
	
	public String toString() {
		return String.format("Type: %s\nHeight: %d\nWidth: %d\nArea: %.2f\n", figureType, height, width, area);
	}
}
