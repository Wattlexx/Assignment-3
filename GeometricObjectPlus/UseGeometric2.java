package GeometricObjectPlus;

public class UseGeometric2 {

	public static void main(String[] args) {
		
		GeometricFigure2 [] figure = new GeometricFigure2[2];
		figure[0] = new Square2(4,4);
		figure[1] = new Triangle2(3,7);
		
		figure[0].area();
		figure[1].area();
		
		System.out.println(figure[0].toString());
		figure[0].printSides();
		
		System.out.println();
		
		System.out.println(figure[1].toString());
		figure[1].printSides();
	}

}
