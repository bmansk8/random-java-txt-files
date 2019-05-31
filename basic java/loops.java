public class loops{

public static void main (String[] args){
//init ,condition,iterartion
//for loops
for (int i = 99; i > 0 ; i--){
	System.out.println(i + "bottles on da wall");
	System.out.println(i + "bottles oohhh");
	System.out.println("take one down pass it around");
	
	switch (i){
	
	case 3:
	System.out.println((i-1) + "bottles of cccooookkkeee on da wall");
		break;
		
	case 2:
	System.out.println((i-1) + "bottle of coookkkkeee on that wall");
	break;
	
	case 1:
	System.out.println("no mo bottles of da cookkee on da wall");
	break;
	
    }
		}

		
//while loop
	int j = 0;//int
	while (j < 10 /*condition*/){
	//code here
	j++;//iteration time
}

//do while loop
int k =0; //init
do{
	//yo code
	k++;// iteration step
	}while(k<10 /*condition*/);
}
}







}