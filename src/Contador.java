
public class Contador {
	private int total=0;

	public Contador(int total) {
		super();
		this.total = total;
	}

	public Contador() {
		super();
	}
	public synchronized void sumar() {
		total++;
	}

	public synchronized int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

}
