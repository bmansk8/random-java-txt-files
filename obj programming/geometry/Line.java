public class Line{
	Point a;
	Point b;
	
	public Line(float ax,float ay,float bx,float by){
		
		this.a=new Point(ax,ay);
		this.b=new Point(bx,by);
		
	}
	
	public Line(Point a,Point b){
		this.a = a;
		this.b = b;
		
	}
	public String toString(){
		
		String str = "| " + a + "->" + b + " |";
		
		//String str= "|"+a.x +"," +a.y + ") ->(" +b.x + " , " +b.y + ")";
		return str;
	  }
	  
	  public float getLength(){
		  float diffX = b.x - a.x;
		  
		  float sqrX = diffX * diffX;
		  
		  float diffY = b.y - a.y;
		  
		  float sqrY = diffY * diffY;
		  
		  float sum =sqrX + sqrY;
		  
		  float sqrt = (float)Math.sqrt(sum);
		  
		  return sqrt;
	  } 
	  
	}