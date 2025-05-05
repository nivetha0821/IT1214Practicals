class One {
int a=10;//variable definition
int b; // variable declaration

void printDetails(){//method
System.out.println("From class one a = "+a);
System.out.println("From class one b = "+b);
      }
}

class Two {
	int a,c;//declaration only
void printDetails(){ //method
	System.out.println("From class Two a= "+a);
	System.out.println("From class Two c= "+c);
      }
}

class Four{
	public static void main(String[] args){
		One ol=new One();
		Two tl=new Two();
		
		
		ol.b=100;
		ol.printDetails();
	
		tl.a=20;
		tl.c=30;
		tl.printDetails();
	}
}