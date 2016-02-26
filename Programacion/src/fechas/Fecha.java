package fechas;

public class Fecha {
	private int mes;
	private int dia;
	private int anno;
	
	public Fecha(){//Esto se usa para el escaner, por eso inicializamos vacio
		mes=0;
		dia=0;
		anno=0;
	}
	public Fecha(int mes, int dia, int anno){
		this.mes=mes;
		this.dia=dia;
		this.anno=anno;	
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getAnno() {
		return anno;
	}
	public void setAnno(int anno) {
		this.anno = anno;
	}
	 private boolean esBisiesto() 
	 {//Comprobamos si es bisiesto o no con este metodo
	        return (anno % 4 == 0 && anno % 100 != 0 || anno % 400 == 0);
	    }
	public boolean fechaCorrecta() {

        boolean diaCorrecto, mesCorrecto, añoCorrecto;
        añoCorrecto = anno > 0;//año no puede ser menor que 0
        mesCorrecto = mes >= 1 && mes <= 12;//el es debe estar entre 1 y 12 no puede estar
        //por encima ni por debajo
        switch (mes) {
            case 2://en caso de que sea bisiesto coge esto
                if (esBisiesto()) {
                    diaCorrecto = dia >= 1 && dia <= 29;
                } 
                else
                {
                    diaCorrecto = dia >= 1 && dia <= 28;
                }
                break;//rompe el metodo para pasar al siguiente limpio
            case 4://en caso de que no sea bisiesto coge esto
                diaCorrecto = dia >= 1 && dia <= 30;
                break;
            default:
                diaCorrecto = dia >= 1 && dia <= 31;
        }
        return diaCorrecto && mesCorrecto && añoCorrecto;

    }
	public void diaSiguiente() { 
        dia++;
        if (!fechaCorrecta()) {
            dia = 1;
            mes++;
            if (!fechaCorrecta()) {
                mes = 1;
                anno++;
            }
        }
    }
	 @Override
	    public String toString() {
	        StringBuilder sb = new StringBuilder();
	        if (dia < 10) {
	            sb.append("0");
	        }
	        sb.append(dia);
	        sb.append("-");
	        if (mes < 10) {
	           sb.append("0");
	       }
	        sb.append(mes);
	        sb.append("-");
	        sb.append(anno);
	        return sb.toString();
	    }
	}

