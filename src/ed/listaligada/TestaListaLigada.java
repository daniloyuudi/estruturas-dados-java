package ed.listaligada;

public class TestaListaLigada {

	public static void main(String[] args) {
		Listaligada lista = new Listaligada();
		
		System.out.println(lista);
		lista.adicionaNoComeco("mauricio");
		System.out.println(lista);
		lista.adicionaNoComeco("paulo");
		System.out.println(lista);
		lista.adicionaNoComeco("guilerme");
		System.out.println(lista);
		
		lista.adiciona("marcelo");
		System.out.println(lista);
		
		lista.adiciona(2, "Gabriel");
		System.out.println(lista);
		
		Object x = lista.pega(2);
		System.out.println(x);
		
		System.out.println(lista.tamanho());
		
		lista.removeDoComeco();
		
		System.out.println(lista);
		System.out.println(lista.tamanho());
	}
	
}
