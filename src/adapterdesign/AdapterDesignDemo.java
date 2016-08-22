package adapterdesign;

interface Windows {
	public void open();
	public void close();
	public void activated();
}

class WindowsAdatper implements Windows {
	public void open() {
		
	}
	public void close() {
		
	}
	public void activated() {
		
	}
}

class WindowsImpl extends WindowsAdatper {
	public void open(){
		System.out.println("open window");
	}
}

public class AdapterDesignDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Windows w = new WindowsImpl();
		w.open();
	}

}
