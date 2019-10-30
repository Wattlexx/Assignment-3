package GeometricObjects;

public class Triangle extends GeometricFigure{
	
	public Triangle(int h, int w) {
		super(h, w, "Triangle");
	}

	@Override
	void area() {
		super.area = (super.height*super.width)/2;
	}

}
