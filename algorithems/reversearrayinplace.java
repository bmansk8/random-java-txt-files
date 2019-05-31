public class reversearrayinplace{
	
	public static void main(String[] args){
		int[] a={1,7,3,2,6};
		
		int temp=0;
		
		/*temp=a[0]; 
		a[0]=a[4];
		a[4]=temp;*/
		
		
		for(int i=0;i<a.length/2;i++){
			
			//a[i]=a[a.length-1-i];
			
		temp=a[i]; 
		a[i]=a[a.length-1-i];
		a[height-1-i][j]=temp;
		 }
		 
		for(int i=0;i<a.length;i++){
			
			System.out.println(a[i]);
			
		}
	}
}