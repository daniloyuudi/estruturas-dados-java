package ed.conjunto;

public class Exercicio {
	public static void main(String[] args) {
		Conjunto conjunto = new Conjunto();
		conjunto.adiciona("Mauricio");
		conjunto.adiciona("Mauricio");
		conjunto.adiciona("Guilherme");
		conjunto.adiciona("Paulo");
		conjunto.remove("Guilherme");
		System.out.println(conjunto);
	}
}
