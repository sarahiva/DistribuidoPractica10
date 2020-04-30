package FilosofosMonitores;

public class Tenedor {
	int id;
	boolean libre=true;
	
	public Tenedor(int id){
		this.id=id;
	}
	
	public synchronized void tomarTenedor(int i) throws InterruptedException{
		while(!libre) // si el tenedor que quiere tomar esta ocupado debe esperar
			wait();
		System.out.println("Filosofo "+ i + " toma tenedor "+ id);
		libre=false;
	}
	
	public synchronized void dejarTenedor(int i){
		System.out.println("Filosofo "+ i + " suelta el tenedor " + id);
		libre = true;
		notify();
	}
}
