public class Geometry{
	public static void main(String[] args){
		//points
		Point p1 =new Point(0,0);
		Point p2 =new Point(8,4);
		Point p3 =new Point(4,3);
		//line
		
		//Line l = new Line(p1,p2);
		Line l = new Line(0,0,8,0);
		System.out.println(l);
		System.out.println("Length : "+l.getLength() );
		//triangle
		
		
		Triangle tri = new Triangle(p1,p2,p3);
		
		//System.out.println("Area : "+ tri.getArea());//12
		//base timz hieght timz .5
			
		System.out.println("perimiter : "+tri.getPerimiter());//18
		
		
		
		//rectangle for the win
	    
		Rectangle rect = new Rectangle (p3,5,2);//14
		
		System.out.println("perimiter of the rectangle : "+rect.getPerimeter() );
		
		System.out.println("the area of the rectangle is : "+rect.getArea());
	}
	
}