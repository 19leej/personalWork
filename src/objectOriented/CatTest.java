package objectOriented;

public class CatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat kit = new Cat();
		System.out.println(kit.getAge());
		System.out.println(kit.getSleep());
		Cat kat = new Cat(4, 8);
		kat.birthday();
		System.out.println(kat.getAge());
		kat.sleepMore();
		System.out.println(kat.getSleep());

	}

}
