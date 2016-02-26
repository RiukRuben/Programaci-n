package entornosErrores;

public class PrincipalBien {
	public static void main(String[] args) {
	Bien f1 = new Bien(1, 4);
    Bien f2 = new Bien(1, 2);
    Bien f3 = new Bien ();
    Bien f4 = new Bien(4);
    Bien suma = f1.sumar(f2);
    Bien resta = f1.restar(f3);
    Bien producto = f1.multiplicar(f4);
    Bien cociente = f1.dividir(f2);
    System.out.println(f1 + " + " + f2 + " = " + suma);
    System.out.println(f1 + " - " + f3 + " = " + resta);
    System.out.println(f1 + " * " + f4 + " = " + producto);
    System.out.println(f1 + " / " + f2 + " = " + cociente);

}
}
