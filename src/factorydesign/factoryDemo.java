package factorydesign;

interface Animal {
	public void say();
}

class Cat implements Animal {
	public void say(){
		System.out.println("miao miao");
	}
}

class Dog implements Animal {
	public void say() {
		System.out.println("wang wang");
	}
}

class AnimalFactory {
	public static Animal getInstance(String classname) {
		Animal a = null;
		if("Cat".equals(classname)){
			a = new Cat();
		}
		if("Dog".equals(classname)){
			a = new Dog();
		}
		return a;
	}
}

public class factoryDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = null;
		a= AnimalFactory.getInstance(args[0]);
		if(a!=null) {
			a.say();
		}
	}

}
