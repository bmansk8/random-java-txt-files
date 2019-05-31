public class cat extends pet implements tagCarrier{
	
	boolean isOutSide;
	
	public cat(String name,byte age,float weight,boolean isOutSide){
		super(name,age,weight);
		this.isOutSide=isOutSide;
	}
	
	public void makeSound(){
		System.out.println(name+": meows");
	}
	
	public String toString(){
		String parString = super.toString();
		return parString + ", an "+((isOutSide)?"outdoor":"indoor")+" cat";
	}
	
	public void printTag(){
		System.out.println("A cat named "+name);
	}
}