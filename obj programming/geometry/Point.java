public class Point{

		float y;
		
		float x;

		public Point(float x,float y){
		 //x is method varible
		 //this.x is class varible
		 this.x = x;
		 this.y = y;
		 
		}
		
		public String toString(){
			String str = "("+x+","+y+")";
			return str;
		}
}
