package GeometricObjectPlus;

public class Square2 extends GeometricFigure2{

	public Square2(int h, int w) {
		super(h, w, "Square");
	}
	
	@Override
	public void area() {
		super.area = super.height*super.width;
	}

	@Override
	public void printSides() {
		System.out.print("Number of sides: " + 4 + "\n");
		
	}
	

}
