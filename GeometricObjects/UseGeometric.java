package GeometricObjects;

public class UseGeometric {

	public static void main(String[] args) {
		
		GeometricFigure [] figure = new GeometricFigure[2];
		figure[0] = new Square(4,4);
		figure[1] = new Triangle(4,2);
		
		figure[0].area();
		figure[1].area();
		
		System.out.println(figure[0].toString());
		System.out.println(figure[1].toString());
	}

}
