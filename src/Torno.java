
public class Torno extends Thread{
	//Contador es el recurso compartido
	private Contador contador;
	private String id; 
	public Torno(Contador contador, String id) {
		//super();
		this.contador = contador;
		this.id = id;
	}
	
	

	public void run() {
		for(int i=0;i<50;i++) {//He decidido que el aforo total es 200
			contador.sumar();//Llamo al método sumar() que está definido en Contador
			System.out.println(id+" tiene  : "+contador.getTotal()+" personas.");
			try {
				Thread.sleep((long) (Math.random()*100));
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
	}
}
