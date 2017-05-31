
public class Monkey extends Animal {

public Monkey()
{
super();
System.out.println("Now I am a Monkey!");
}

@Override
public String sleep() {
	return "A Monkey sleeps...";
}

@Override
public String eat() {
	return "A Monkey eats...";
}

public String swing(){
	return "A Monkey swings on vines!";
}

}
