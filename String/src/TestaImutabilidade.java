public class TestaImutabilidade {
	
	public static void main(String[] args) {
		String nome = "Eduardo Bernstein";
		String nomeAlterado = nome.toUpperCase();
		System.out.println(nome);
		System.out.println(nomeAlterado);
		
		String a = new String(new char[] { 'J', 'o', 'n', 'a', 's' });
		System.out.println(a);
	}
	
}
