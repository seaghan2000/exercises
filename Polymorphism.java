public class Polymorphism {
	
	public static void main(String args[]) {
		
		System.out.println("Polymorphism");
		
		Animal myAnimals[] = new Animal[4];
		
		myAnimals[0] = new Animal(5,5);
		myAnimals[1] = new Horse(6,4," neigh");
		myAnimals[2] = new Dog(7,7, " woof");
		myAnimals[3] = new Frog(99,99, " ribbit");
		
		for(int i = 0; i < 4; i++) {
			myAnimals[i].speakWord();
			System.out.println("I weigh " + myAnimals[i].weight + " and my height is " + myAnimals[i].height);
		}
	}
}

class Animal {
	int height;
	int weight;
	String word;
	
	
	public Animal(int height, int weight) {
		this.height = 5;
		this.weight = weight;
		this.word = "I am an animal.";
	}
	
	void speakWord() {
		System.out.println(word);
	}
}

class Horse extends Animal{
	String phrase;
	
	public Horse(int height, int weight, String sound) {
		super( height,  weight);
		this.phrase = this.word + sound;
	}
	
	void speakWord() {
		System.out.println(phrase);
	}
	
}

class Dog extends Animal{
	String phrase;
	
	public Dog(int height, int weight, String sound) {
		super( height,  weight);
		this.phrase = this.word + sound;
	}
	
	void speakWord() {
		System.out.println(phrase);
	}
	
}

class Frog extends Animal{
	String phrase;
	
	public Frog(int height, int weight, String sound) {
		super( height,  weight);
		this.phrase = this.word + sound;
		this.weight = 1;
		this.height = this.weight;
	}
	
	void speakWord() {
		System.out.println(phrase);
	}
	
}
