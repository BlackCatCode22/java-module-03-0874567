package myanimals;

public class Dog extends Animal {
			
			public static final int MAX_LIVES = 1;
			private static int dogCount = 0;
			String name;
			int age;
			int livesRemaining;
			
			public void bark() {
				System.out.println("bark");
			}
			
			public Dog() {
				dogCount++;
				livesRemaining = MAX_LIVES;

			}
			
			public static int getDogCount() {
				return dogCount;
			}

}
