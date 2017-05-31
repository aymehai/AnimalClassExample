
public class AnimalApp {

	public static void main(String[] args) {

		Cat c = new Cat();
		print(c.eat());
		print(c.sleep());
		print(c.purr());

		Bird b = new Bird();
		print(b.eat());
		print(b.sleep());
		print(b.fly());

		Dog d = new Dog();
		print(d.eat());
		print(d.sleep());
		print(d.bark());

		Fish f = new Fish();
		print(f.swim());
		print(f.eat());
		print(f.poop());
		
		Monkey m = new Monkey();
		print(m.eat());
		print(m.sleep());
		print(m.swing());

		Unicorn u = new Unicorn();
		print(u.eat());
		print(u.sleep());
		print(u.disappear());
		
		SaberToothTiger s = new SaberToothTiger();
		print(s.eat());
		print(s.sleep());
		print(s.extinct());
	}

	private static void print(String s) {
		System.out.println(s);
	}
}
