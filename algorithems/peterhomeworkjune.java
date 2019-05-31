public class peterhomeworkjune{
	
	public static void main(String[] args){
		int[] a={1,3,5,6};
		
	    int	target=4;
		
		int	answer=findindex(a,target);
		
		System.out.println(answer);
		
	}
	
	public static int findindex(int[]b,int t){
		for(int i=0;i<b.length;i++){
			if(b[i]==t){
			return i;
			}else if(b[i] > t){
					return i;
			}	
		}
		return b.length;
	}
}