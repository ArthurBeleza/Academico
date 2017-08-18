
public class Diciplina {
	//ATRIBUTOS
	
private String nome;
private String curso;
private int cargaHoraria;


public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getCurso() {
	return curso;
}
public void setCurso(String curso) {
	this.curso = curso;
}
public int getCargaHoraria() {
	return cargaHoraria;
}
public void setCargaHoraria(int cargaHoraria) {
	this.cargaHoraria = cargaHoraria;
}


@Override
public String toString() {
	return "Diciplina [nome=" + nome + ", curso=" + curso + ", cargaHoraria=" + cargaHoraria + ", getNome()="
			+ getNome() + ", getCurso()=" + getCurso() + ", getCargaHoraria()=" + getCargaHoraria() + ", getClass()="
			+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}


public Diciplina(String nome, String curso, int cargaHoraria) {
	super();
	this.nome = nome;
	this.curso = curso;
	this.cargaHoraria = cargaHoraria;
}




}