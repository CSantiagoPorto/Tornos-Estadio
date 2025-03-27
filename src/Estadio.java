
public class Estadio {
	//Mi objeto compartido es el contador por lo tanto necesitaré un objeto contador pero 4 objetos torno
	
	public static void main(String[] args) {
		Contador contador = new Contador();
		Torno torno1 = new Torno(contador, "Torno 1");//Creo un objeto torno que tiene nombre y comparte EL MISMO
		//objeto contador que usan el resto de tornos. 
		//Controlamos que no se pisen al haber hecho synchronized el método sumar()
		Torno torno2= new Torno(contador, "Torno 2");
		Torno torno3= new Torno(contador, "Torno 3");
		Torno torno4= new Torno(contador, "Torno 4");
		
		torno1.start();
		torno2.start();
		torno3.start();
		torno4.start();
		
		try {
			//join() hace que cada hilo termine de ejecutar por completo el bucle for de 50 personas que 
			//implementé en Torno
			torno1.join();
			torno2.join();
			torno3.join();
			torno4.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("El total de personas en el palco VIP es de: "+ contador.getTotal());

	}

}
