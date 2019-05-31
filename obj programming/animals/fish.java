public class fish extends pet{
	boolean issltwtr;
	
	public fish(String name,byte age,float weight,boolean issltwtr){
		super (name,age,weight);
		this.issltwtr= issltwtr;
		
	}
	
	
	public String toString(){
		String parString = super.toString();
		return parString +", and is a "+(issltwtr?"salt water ":" is not salt water")+" fish ";
	}
}

