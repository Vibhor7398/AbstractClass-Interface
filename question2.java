package ques2;

abstract class Animals {

	static String name;
	static String breed;
	static String color;

	abstract void eat();

	static void speak() {
		System.out.println("All animals speak differently.");
	}

}

class Dog extends Animals {
	 void eat() {
		System.out.println("Dogs are omnivorous. They eat vegetables and chicken.");
	}
	void setInfo() {
		Animals.breed = "Labrador";
		Animals.color = "Black";
		Animals.name = "Bruno";
	}
	void display() {
		System.out.println("Breed is " + Animals.breed);
		System.out.println("Name is " + Animals.name);
		System.out.println("Color is " + Animals.color);
	}

}

public class question2 extends Dog{
	public static void main(String args[])
	{
		Dog d = new Dog();
		Animals.speak();
		d.eat();
		d.setInfo();
		d.display();
		
	}
}
