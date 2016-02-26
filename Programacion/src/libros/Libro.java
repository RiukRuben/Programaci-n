package libros;

public class Libro {
	int ejemplares;
	int prestados;
	String titulo;//String sirve para inicializar algo a lo cual le vas a meter un nombre
	//es decir se inicializa como una cadena de caracteres
	String autor;
	public Libro(){//Esto se usa para que el escaner pille los datos que metas
		//por eso lo inicilizamos vacios
		titulo="";
		autor="";
		ejemplares=0;
		prestados=0;
	}
	public 	Libro( String titulo, String autor, int ejemplares, int prestados){
		this.ejemplares=ejemplares;
		this.prestados=prestados;
		this.titulo=titulo;
		this.autor=autor;
		//Con esto haces que no se mezcle los "disponibles" de arriba con los de abajo, en la llamada
	}
	public int getEjemplares() {
		return ejemplares;
	}
	public void setEjemplares(int ejemplares) {
		this.ejemplares = ejemplares;
	}
	public int getPrestados() {
		return prestados;
	}
	public void setPrestados(int prestados) {
		this.prestados = prestados;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public boolean prestamo() {		 
        boolean prestado = true;
        if (prestados < ejemplares) {//Con esto hacemos que los prestados nunca puedan
        	//ser mayores que los ejemplares disponibles
            prestados++;
        } 
        else 
        {
            prestado = false;
        }
        return prestado;
    }
	public boolean devolucion() {
        boolean devuelto = true;
        if (prestados == 0) {
            devuelto = false;
        } 
        else //En caso de que haya libros prestados y se devuelvan se le resta 1
        	//a los libros prestados
        {
            prestados--;
        }
        return devuelto;
    }
	 @Override
	    public String toString() {
	    return "El titulo del libro es: " + titulo + "su autor: " + autor + 
	                  "ejemplares que quedan : " + ejemplares + "ejemplares prestados: " + prestados;
	    }
	}

