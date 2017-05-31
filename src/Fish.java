
public class Fish extends Animal {

	public Fish() {
		super();
		System.out.println("Now I am a Fish!");
	}

	@Override
	public String eat() {
		return "A Fish eats...";
	}

	public String swim() {
		return "A Fish swims...";
	}

	public String poop() {
		return "A Fish pooped...";
	}

}