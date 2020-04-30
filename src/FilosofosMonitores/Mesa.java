package FilosofosMonitores;

public class Mesa {
	public static void main(String[] args){
		estado est = new estado();
		Tenedor[] tenedores = new Tenedor[5];
		for(int i=0; i<tenedores.length;i++){
			tenedores[i]=new Tenedor(i);
		}
		
		Filosofo[] filosofos = new Filosofo[5];
		for(int i=0; i<filosofos.length;i++){
			filosofos[i] = new Filosofo(i, tenedores[i], tenedores[(i+1)%5],est);
		}
		
		for(int i=0; i<filosofos.length;i++){
			filosofos[i].start();
		}
		
	}

}
