public class Polymorphism {
	
	public static void main(String args[]) {
		
		System.out.println("Polymorphism Example");
		
        //An array of animals, despite being different classes thay can all be a part of the parent classes array
		Animal myAnimals[] = new Animal[4];
		
        //Fill array
		myAnimals[0] = new Animal(5,5);
		myAnimals[1] = new Horse(6,4," neigh");
		myAnimals[2] = new Dog(7,7, " woof");
		myAnimals[3] = new Frog(99,99, " ribbit");
		
        //All animals can have a differnt speakWord() and they can use the parent attributes for height, weight etc
		for(int i = 0; i < 4; i++) {
			myAnimals[i].speakWord();
			System.out.println("I weigh " + myAnimals[i].weight + " and my height is " + myAnimals[i].height);
		}
	}
}

//Animal parent class
class Animal {
	int height;
	int weight;
	String word;
	
	//Constructor
	public Animal(int height, int weight) {
		this.height = 5;
		this.weight = weight;
		this.word = " I am an animal. ";
	}
	
	void speakWord() {
		System.out.println(word);
	}
}

//Horse in an animal
class Horse extends Animal{
	String phrase;
	
	public Horse(int height, int weight, String sound) {
		super( height,  weight);
		this.phrase = this.word + sound;
	}
	
	void speakWord() {
		System.out.println("neigh " + phrase);
	}
	
}

//Dog is an animal
class Dog extends Animal{
	String phrase;
	
	public Dog(int height, int weight, String sound) {
		super( height,  weight);
		this.phrase = this.word + sound;
	}
	
	void speakWord() {
		System.out.println("Dog doesn't like speaking");
	}
	
}

//Frog is an animal
class Frog extends Animal{
	String phrase;
	
	public Frog(int height, int weight, String sound) {
		super( height,  weight);
		this.phrase = this.word + sound;
		this.weight = 1;
		this.height = this.weight;
	}
	
	void speakWord() {
		System.out.println(phrase + phrase);
	}
	
}
