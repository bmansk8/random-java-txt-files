public class Rectangle{
 
  Point topLeft;
  Point bottomRight;
 
 //add overloaded constructer
	public Rectangle(Point topLeft,Point bottomRight){
	 this.topLeft=topLeft;
	 this.bottomRight=bottomRight;
	}
 
    /*public Rectangle (float tlx,float tly,float brx,float bry){
		 this.topLeft=new Point(tlx,tly);
		 this.bottomRight=new Point(brx,bry);
	 } */
		
	
	//make rectangle out of this float top_left_x, float top_left_y, float width, float height via constructer
    public Rectangle (float top_left_x,float top_left_y,float width,float height){
		this.topLeft=new Point (top_left_x,top_left_y);
		this.bottomRight=new Point ( (top_left_x+width) , (top_left_y+height) );
		}
		
		public Rectangle (Point psqr,float width,float height){
			this(psqr.x,psqr.y,width,height);
			
		}
		
	//getPerimeter(), getArea() for the rectangle
	
	public float getPerimeter(){
		
	float Perimeter = ( ( getWidth() * 2) + ( getHeight() * 2) );
		
		return Perimeter;
	}
	
	public float getArea (){
		
		float Area = (getWidth() * getHeight() );
		
		return Area;
	}
	
	public float getWidth(){
		float width=bottomRight.x-topLeft.x;
		
		return width;
	}
	
	public float getHeight(){
		
		float height=bottomRight.y-topLeft.y;
		
		return height;
	}
	
}