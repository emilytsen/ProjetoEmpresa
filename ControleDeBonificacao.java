//instanciando a classe ControleDeBonificacao
public class ControleDeBonificacao {
	//criando variável privada (atributo) totalDebonus
	private double totalDebonus;
	
	//criando o método getTotalDeBonus
	public double getTotalDeBonus() {
		//pegando variável código e mostrando de forma segura
		return this.totalDebonus;
	}
	
	//criando o método calculaTotalDeBonus
	public double calculaTotalDeBonus(Funcionario f) {
		//retornando o valor de bonus + bonifica do funcionario
		return this.totalDebonus = this.totalDebonus + f.bonifica();
	}
}
