package GeometricObjectPlus;

public class Triangle2 extends GeometricFigure2{
	
	public Triangle2(int h, int w) {
		super(h, w, "Triangle");
	}

	@Override
	void area() {
		super.area = (super.height*super.width)/2;
	}

	@Override
	public void printSides() {
		System.out.print("Number of sides: " + 3 + "\n");
		
	}

}
