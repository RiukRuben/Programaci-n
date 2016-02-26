package contador;

public class Contador {
	int cont;
	
	public Contador(){
		cont=0;
	}
	public Contador(int cont){//Esto ya esta recibiendo un valor 	 
        if (cont < 0) 
        {
            this.cont = 0;//Esto hace que en caso de que el valor que se le de sea menor que 0
            //se inicialize en 0
            } 
        else 
        {
            this.cont = cont;
        }
    }
	public Contador(Contador copia){//Con esto se crea la copia del Contador es decir del objeto
		//que se genera y te saca una copia
		cont=copia.cont;
		
	}

	public int getCont() {
		return cont;
	}

	public void setCont(int cont) {
		this.cont = cont;
	}
	
	public int incrementar(){
		//Esto te devuelve un contador que devuelve cada vez sumandole uno
		return cont++;
	}
	public int decrementar(){
		cont--;
		if (cont<0)
		{
			this.cont=0;//en caso de que sea menor que cero te pone cero por defecto
		}
		
		return cont;
	}
	
}
