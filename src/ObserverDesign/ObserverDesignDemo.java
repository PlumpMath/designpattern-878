package ObserverDesign;
import java.util.Observable;
import java.util.Observer;

class House extends Observable {
	public float price;

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.setChanged();
		this.notifyObservers(price);
		this.price = price;
	}
	
	public House(float price){
		this.price = price;
	}
	
	public String toString(){
		return "RMB" + this.price;
	}

}

class HousePriceObserver implements Observer {
	public String name;
	
	public HousePriceObserver(String name){
		this.name = name;
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		if(arg instanceof Float){
			System.out.println("Observer " + name + " observe the price is changed to: " + ((Float) arg).floatValue());
		}
	}
}


public class ObserverDesignDemo extends Observable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		House h = new House(1000000);
		HousePriceObserver P1 = new HousePriceObserver("Person1");
		HousePriceObserver P2 = new HousePriceObserver("Person2");
		HousePriceObserver P3 = new HousePriceObserver("Person3");
		h.addObserver(P1);
		h.addObserver(P2);
		h.addObserver(P3);
		System.out.println("now the house price is: " + h);
		h.setPrice(2000000);
		System.out.println("change the house price to: " + h);
	}

}
