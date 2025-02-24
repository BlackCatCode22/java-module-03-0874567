package myanimals;

public class Cat extends Animal {
		
		public static final int MAX_LIVES = 9;
		private static int catCount = 0;
		String name;
		int age;
		int livesRemaining;
		
		public void meow() {
			System.out.println("meow");
		}
		
		public Cat() {
			catCount++;
			livesRemaining = MAX_LIVES;

		}
		
		public static int getCatCount() {
			return catCount;
		}
		
}
