class Parent_class
{
	void display()
	{
		System.out.println("I am from Parent Class");
	}
}
class Parent_two extends Parent_class
{
	void display()
	{
		System.out.println("I am from Parent Class");
	}
}
class Parent_three extends Parent_class
{
	void display()
	{
		System.out.println("I am from Parent Class");
	}
}
class Parent_four extends Parent_class
{
	void display()
	{
		System.out.println("I am from Parent Class");
	}
}

public class multilevelInheritance {
	
		public static void main(String[] args) {
			Parent_class object = new Parent_class();
			object.display();

	}

}
