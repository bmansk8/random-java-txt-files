public class animal{
	public static void main(String[] args){
		//make animal
		pet pet = new pet("Spark",(byte)3,3.14f);
		pet.makeSound();
		System.out.println(pet);
		
		System.out.println();
		//makedog
		dog dog =new dog("tipy",(byte)1,50f,"staford shire bull terrier");
		dog.printTag();
		dog.makeSound();
		System.out.println(dog);
		//make cat
		System.out.println();
		cat cat = new cat("fatty wig",(byte)5,12f,false);
		cat.printTag();
		cat.makeSound();
		System.out.println(cat);
		//make fish
		System.out.println();
		fish fish =new fish("flounder",(byte)2,10f,true);
		fish.makeSound();
		System.out.println(fish);
		
		
		System.out.println("_____________");
		
		tagCarrier[] tagCarriers= new tagCarrier[4];
		tagCarriers[0]= new dog("dog1",(byte)1,50f,"german shep");
		tagCarriers[1]= new dog("dog2",(byte)2,40f,"pity");
		tagCarriers[2]= new cat("cat1",(byte)1,10f,true);
		tagCarriers[3]= new dog("dog3",(byte)1,1f,"dog");
		
		tagCarriers[0].printTag();
		//tagCarriers[0].makeSound(); it doesn't work
	}
	
	
	
}