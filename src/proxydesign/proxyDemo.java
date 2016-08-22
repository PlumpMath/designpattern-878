package proxydesign;

interface Network {
	public void show();
}

class Real implements Network {
	
	public void show() {
		System.out.println("This is real network");
	}
}

class Proxy implements Network {
	
	public Network network;
	
	public Proxy(Network network){
		this.network = network;
	}
	
	public void check() {
		System.out.println("check your identity to connect to real network");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		this.check();
		this.network.show();
	}

}

public class proxyDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Network net = null;
		net = new Proxy(new Real());
		net.show();
	}

}
