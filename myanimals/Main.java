package myanimals;

public class Main {

	public static void main(String[] args) {
		
System.out.println(Cat.getCatCount());
		
		Cat myCat = new Cat();
		myCat.meow();
		myCat.name = "Tofu";
		myCat.age = 3;
		System.out.println(Cat.MAX_LIVES); 
		
System.out.println(Cat.getCatCount());

System.out.println(Dog.getDogCount());

	Dog myDog = new Dog();
	myDog.bark();
	myDog.name = "Stella";
	myDog.age = 8;
	System.out.println(Dog.MAX_LIVES); 

System.out.println(Dog.getDogCount());

	}

}
