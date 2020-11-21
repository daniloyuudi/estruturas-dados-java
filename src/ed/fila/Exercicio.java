package ed.fila;

public class Exercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fila fila = new Fila();
		fila.adiciona("Mauricio");
		fila.adiciona("Paulo");
		fila.adiciona("Guilherme");
		fila.remove();
		fila.adiciona("João");
		fila.remove();
		System.out.println(fila);
	}

}
