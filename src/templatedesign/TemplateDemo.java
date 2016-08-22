package templatedesign;

abstract class AbstractClass {
	abstract void methodA ();
	abstract void methodB();
	abstract void methodC();
	
	void template() {
		this.methodA();
		this.methodC();
		this.methodB();
	}
}

class ConcreteClass extends AbstractClass {

	@Override
	void methodA() {
		// TODO Auto-generated method stub
		System.out.println("first");
	}

	@Override
	void methodB() {
		// TODO Auto-generated method stub
		System.out.println("third");
	}

	@Override
	void methodC() {
		// TODO Auto-generated method stub
		System.out.println("second");
	}
	
}

public class TemplateDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractClass a = new ConcreteClass();
		a.template();
	}

}
