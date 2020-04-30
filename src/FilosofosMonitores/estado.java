package FilosofosMonitores;

public class estado {
	boolean hambriento = true;
	boolean comiendo = false;

	public synchronized void probarBocado(int i) throws InterruptedException {
		while(comiendo == true && hambriento == true )
			wait();
		System.out.println("Filosofo "+ i + " puede comer");
		comiendo = true;
		hambriento = false;
	}
	
	public synchronized void Parar(int i){
		hambriento = true;
		comiendo = false;
		System.out.println("Filosofo "+ i + " deja de comer");
		notify();
	}
	
	public void Comiendo(int i){
		if(comiendo == true)
			System.out.println("Filosofo "+ i + " esta comiendo");
	}
}
