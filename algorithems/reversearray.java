public class reversearray{
	
	public static void main(String[] args){
		int[] a={1,7,3,2,6};
		int[] b=new int[a.length];
		
		for(int i=0;i<a.length;i++){
			b[i]=a[a.length-1-i];
		 }
		 
		for(int i=0;i<b.length;i++){
			
			System.out.println(b[i]);
			
		}
	}
}

