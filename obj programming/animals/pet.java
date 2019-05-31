public class pet{
	String name;
	byte age;
	float weight;
	
	public pet(String name,byte age,float weight){
		this.name=name;
		this.age=age;
		this.weight=weight;
	}
	
	public void makeSound(){
		System.out.println(name +":doesn't make a sound");
	}
	
	public String toString(){
		return name+" : "+age+" years old, weighs "+weight+" pounds";
	}
}