public class TestaPoolDeStrings {
	
	public static void main(String[] args) {
		String nome1 = "Eduardo Bernstein";
		String nome2 = "Eduardo Bernstein";
		System.out.println(nome1 == nome2);
		System.out.println(nome1.equals(nome2));
		String nome3 = new String("Eduardo Bernstein");
		String nome4 = new String("Eduardo Bernstein");
		System.out.println(nome3 == nome4);
		System.out.println(nome3.equals(nome4));
	}
	
}
