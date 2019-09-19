package day58;

public class ShapeTest {
public static void main(String[] args) {
	Triangle t1 = new Triangle("red",5,10);
	Square s1 = new Square("red",5);
	Drawable d1 = new Square("red",5);
	Drawable d2 = new Triangle("red",5,5);
	Drawable d3 = new Triangle("red",5,5);
	Drawable d4 = new Square("Green",5);
	d1.draw();
	d2.draw();
	d3.draw();
	d4.draw();
	

	List<Drawable> DrawbleShapes = new  ArrayList<>();
	DrawbleShapes.add(d1);
	DrawbleShapes.add(d2);
	DrawbleShapes.add(d3);
	DrawbleShapes.add(d4);
	
	
	
	for(Drawable each: DrawbleShapes) {
		each.draw();
	}
	
	
	
	
}

	
}
}
