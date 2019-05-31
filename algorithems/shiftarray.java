

public class shiftarray{
	public static void main(String[] args){
		
		
		
		int[][] y={
			{1,5,4},
		    {2,8,6},
			{3,7,9}
			
		};
		
		int height=y.length;
		int width=y[0].length;
		
		for(int b=0;b<(height);b++){
			for(int c=0;c<width/2;c++){
			int	temp=y[b][c]; 
				y[b][c]=y[b][(width-1)-c];
				y[b][(width-c)-1]=temp;
			}
		}
		
		printarray(y);
	
	}
	public static void printarray(int[][] arr){
	  System.out.print("-----\n");
	  for(int i =0; i< arr.length; i++){
		for(int j =0;j<arr[i].length;j++){
			System.out.print(arr[i][j] + "\t");
		}  
		System.out.print("\n");
	  }
	  System.out.print("-----\n");
	}
}
