
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno a1 = new Aluno("João", "123", 20, "Computação", "Noturno", "M");
		
		Diciplina d1 = new Diciplina("LTP1", "Computação", 40);
		
		System.out.println(a1.getNome());
		System.out.println(d1.getNome());
		
		System.out.println(a1.imprimirAluno());
	}

}
				