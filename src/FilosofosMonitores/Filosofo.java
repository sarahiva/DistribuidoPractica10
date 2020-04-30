package FilosofosMonitores;

public class Filosofo extends Thread {
	int id;
	Tenedor izq, der;
	estado est;
	
	public Filosofo(int id, Tenedor izq, Tenedor der, estado est){
		this.id=id;
		this.izq=izq;
		this.der=der;
		this.est=est;
	}
	
	public void run(){
		while(true){
			try {
				est.probarBocado(id);
				izq.tomarTenedor(id);
				der.tomarTenedor(id);
				est.Comiendo(id);
				der.dejarTenedor(id);
				izq.dejarTenedor(id);
				est.Parar(id);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
