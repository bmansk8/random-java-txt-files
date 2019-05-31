public class dog extends pet implements tagCarrier{
	
	String breed;
	
	public dog(String name,byte age,float weight,String breed){
		super (name,age,weight);
		this.breed=breed;
	}
	
	public void makeSound(){
		System.out.println(name + ": barks");
	}
	
	public String toString(){
		String parString = super.toString();
		return parString + ", "+breed+" breed";
	}
	
	public void printTag(){
		System.out.println("a dog named "+name);
	}
}