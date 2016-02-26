package fracciones;
	public class Fraccion {
	    private int num;
	    private int den;
	    public Fraccion() {
	        num = 0;
	        den = 1;
	    }
	    public Fraccion(int num, int den) {//Con esto se introduce el denominador
	        this.num = num;
	        if(den==0){
	            den = 1;
	        }
	        this.den = den;
	     
	    }
	    public Fraccion(int num) {//Aqui se mete el valor del numerador
	        this.num = num;
	        this.den = 1;
	    }
	    public int getDen() {
	        return den;
	    }
	    public void setDen(int den) {
	        this.den = den;
	    }
	    public int getNum() {
	        return num;
	    }
	    public void setNum(int num) {
	       this.num = num;
	    }
	    public Fraccion sumar(Fraccion f) {//Con esto realizamos la suma de las fracciones
	        Fraccion aux = new Fraccion();
	        aux.num = this.num * f.den + this.den * f.num;
	        aux.den = this.den * f.den;
	        return aux;
	    }
	   public Fraccion restar(Fraccion f) {//Con este metodo realizamos la resta de fracciones
	        Fraccion aux = new Fraccion();
	        aux.num = this.num * f.den - this.den * f.num;
	        aux.den = this.den * f.den;
	        return aux;
	    }	 
	    public Fraccion multiplicar(Fraccion f) {//Con esto realizamos la multiplicacion de fracciones
	        Fraccion aux = new Fraccion();
	        aux.num = this.num * f.num;
	        aux.den = this.den * f.den;
	        return aux;
	    }
	
	    public Fraccion dividir(Fraccion f) {//Con esto realizamos la division de fracciones
	        Fraccion aux = new Fraccion();
	        aux.num = this.num * f.den;
	        aux.den = this.den * f.num;
	        return aux;
	    }
	    public String toString() {
	        return num + "/" + den;
	    }

	 }     



