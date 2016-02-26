package ejercicios_recuperacion;

public class Decimoquinto {

	public static void main(String[] args) {
		int mes=Integer.valueOf(args[0]);
		int a=31;
		int b=28;
		int c=31;
		int d=30;
		int e=31;
		int f=30;
		int g=31;
		int h=30;
		int i=31;
		int j=30;
		int k=31;
		int l=30;
		if (mes<1){
			System.out.println("Por favor introduzca un numero superior a 0");
		}
		if (mes>12){
			System.out.println("Por favor introduzca un numero menor a 13");
		}
		if(mes==1){
			System.out.println("Este mes es Enero y tiene: "+a+" dias");
		}
		if(mes==2){
			System.out.println("Este mes es Febrero y tiene: "+b+" dias");
		}
		if(mes==3){
			System.out.println("Este mes en Marzo y tiene: "+c+" dias");
		}
		if(mes==4){
			System.out.println("Este mes es Abril y tiene: "+d+" dias");
		}
		if(mes==5){
			System.out.println("Este mes es Mayo y tiene: "+e+" dias");
		}
		if(mes==6){
			System.out.println("Este mes es Junio y tiene: "+f+" dias");
		}
		if(mes==7){
			System.out.println("Este mes es Julio y tiene: "+g+" dias");
		}
		if(mes==8){
			System.out.println("Este mes es Agosto y tiene: "+h+" dias");
		}
		if (mes==9){
			System.out.println("Este mes es Septiembre y tiene: "+i+" dias");
		}
		if(mes==10){
			System.out.println("Este mes es Octuble y tiene: "+j+" dias");
		}
		if(mes==11){
			System.out.println("Este mes es Noviembre y tiene: "+k+" dias");
		}
		if(mes==12){
			System.out.println("Este mes es Diciembre y tiene: "+l+" dais");
		}

	}

}
