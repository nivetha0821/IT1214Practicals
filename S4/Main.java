class Person{
	
	private String name;
	private int age;
	
	//Getter
	
	public String getName(){
		return name;
	}
	//setter
	public void setName(String newName){
		this.name=newName;
	}
	public int getage(){
		return age;
	}
	public void setage(int newage){
		this.age=newage;
	}
}
public class Main{
	public static void main(String args[])
	{
		Person p1=new Person();
	    p1.setName("john");
		p1.setage(24);
		System.out.println(p1.getName());
		System.out.println(p1.getage());
	}
}
