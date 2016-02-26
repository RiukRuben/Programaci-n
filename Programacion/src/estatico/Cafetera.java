package estatico;

public class Cafetera {
	
	static int nCafeteras=0;//Esto al ser estatico no se va a reflejar en el propio objeto
	String color="blanco";
	int ref;

	public static void main(String[] args) {
		Cafetera cafetera1= new Cafetera();
		Cafetera cafetera2= new Cafetera("rojo");
		Cafetera cafetera3=new Cafetera("rosa");
		System.out.println(cafetera1.toString());
		System.out.println(cafetera2.toString());
		System.out.println(cafetera3.toString());
		}
	public Cafetera() 
	{
		nCafeteras++;
		ref = Cafetera.nCafeteras;
	}
	public String toString(){
		String ret="Esta cafetera es la numero: "+ref+" de un total de: "+ Cafetera.nCafeteras+" es de color "+ getColor();
		return ret;
	}

	
	
	public Cafetera(String color) {
		this.color = color;
		nCafeteras++;
		ref=Cafetera.nCafeteras;
	}
	public static int getnCafeteras() {
		return nCafeteras;
	}

	
	public static void setnCafeteras(int nCafeteras) {
		Cafetera.nCafeteras = nCafeteras;
	}

	
	public String getColor() {
		return color;
	}

	
	public void setColor(String color) {
		this.color = color;
	}

}
