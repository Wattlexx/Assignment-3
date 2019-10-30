package GeometricObjects;

public class Square extends GeometricFigure{

	public Square(int h, int w) {
		super(h, w, "Square");
	}
	
	@Override
	public void area() {
		super.area = super.height*super.width;
	}
	

}
