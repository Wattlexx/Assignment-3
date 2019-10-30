package GeometricObjectPlus;

public abstract class GeometricFigure2 implements SidedObject{
	int height;
	int width;
	String figureType;
	double area;
	
	public GeometricFigure2(int h, int w, String type) {
		height = h;
		width = w;
		figureType = type;
	}
	
	abstract void area();
	
	public String toString() {
		return String.format("Type: %s\nHeight: %d\nWidth: %d\nArea: %.2f", figureType, height, width, area);
	}
}