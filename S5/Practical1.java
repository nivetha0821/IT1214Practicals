class  Paper{
	int length;
	int width;
	String text;
}

class Document{
	String name;
	Paper p;//Declaration
	
	public static void main(String[] args){
		Document d=new Document();
		System.out.println("Created a Document Object d");
		d.name="My First Document";
		System.out.println("Name of the Document d is "+d.name);
		
		//d.p=new paper();
		//d.p.text="this is the text in the paper of document my first document";
		d.p=new Paper();
		d.p.length=5;
		d.p.width=25;
		d.p.text="this is the text in the paper of document my first document";
		//set the length and width of the paper object p of the document object d
		System.out.println("Size (1*w) of the paper of the Document d is "+d.p.length+" * "+d.p.width);
		System.out.println("text value of paper p of document d is  "+d.p.text);
		
		Document d2=new Document();
		System.out.println("Created a Document Object d2");
		d2.name="My Second Document";
		System.out.println("Name of the Document d2 is "+d2.name);
		
		
	}
}
