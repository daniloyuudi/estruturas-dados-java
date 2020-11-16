package ed.pilha;

public class Exercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pilha pilha = new Pilha();
		pilha.push("Mauricio");
		pilha.push("Marcelo");
		pilha.pop();
		pilha.push("Guilherme");
		pilha.push("Paulo");
		pilha.pop();
		pilha.push("João");
		
		System.out.println(pilha);
		
	}

}
