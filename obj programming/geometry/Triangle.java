public class Triangle{
	
	Point a;
	Point b;
	Point c;
	
	public Triangle(Point a,Point b,Point c){
		this.a = a;
		this.b = b;
		this.c = c;
		
	}
	
	public float getPerimiter(){
		
		Line l_ab = new Line (a,b);
		 float d_ab=l_ab.getLength();
		
		Line l_bc = new Line (b,c);
		 float d_bc=l_bc.getLength();
		 
		Line l_ca = new Line (c,a);
		 float d_ca=l_ca.getLength();
		
		 float distanceTriangle = (d_ca+d_bc+d_ab);
		 
		 return distanceTriangle;
	}
	
}