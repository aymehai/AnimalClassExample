
public class SaberToothTiger extends Animal {

public SaberToothTiger()
{
super();
System.out.println("Now I am a SaberToothTiger!");
}

@Override
public String sleep() {
	return "A SaberToothTiger sleeps...";
}

@Override
public String eat() {
	return "A SaberToothTiger eats...";
}

public String extinct(){
	return "A SaberToothTiger died of extinction";
}

}