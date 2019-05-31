public class min{
	public static void main(String args []){
		int [] list = {
			-1,3,5,-6,-3,1,8
		};
		
		int minIndex = 0;
		int minValue = list[0];
		
		for(int i = 1; i < list.length; i ++){
		int	curValue=list[i];
		if(curValue < minValue){
			minValue = curValue;
			minIndex = i;
			}
		}
		System.out.println("the minumun value is "+minValue+" and the minumun index is "+minIndex);
	}
	
}