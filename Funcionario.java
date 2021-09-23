//instanciando a classe Funcionario
public abstract class Funcionario {
	//criando variável privada (atributo) nome
	protected String nome;
	//criando variável privada (atributo) departamento
	protected String departamento;
	//criando variável privada (atributo) salario
	protected double salario;
	//criando variável privada (atributo) dataDeEntrada
	protected String dataDeEntrada;
	//criando variável privada (atributo) rg
	protected String rg;
	//criando variável privada (atributo) estaNaEmpresa
	protected boolean estaNaEmpresa;
	
	//criando um método getNome
	public String getNome() {
		//pegando variável nome e mostrando de forma segura
		return nome;
	}
	//criando um método setNome
	public void setNome(String nome) {
		//atribuindo valor para nome
		this.nome = nome;
	}

	//criando um método getDepartamento
	public String getDepartamento() {
		//pegando variável departamento e mostrando de forma segura
		return departamento;
	}
	//criando um método setDepartamento
	public void setDepartamento(String departamento) {
		//atribuindo valor para departamento
		this.departamento = departamento;
	}

	//criando um método getSalario
	public double getSalario() {
		//pegando variável salario e mostrando de forma segura
		return salario;
	}
	//criando um método setSalario
	public void setSalario(double salario) {
		//atribuindo valor para salario
		this.salario = salario;
	}

	//criando um método getDataDeEntrada
	public String getDataDeEntrada() {
		//pegando variável dataDeEntrada e mostrando de forma segura
		return dataDeEntrada;
	}
	//criando um método setDataDeEntrada
	public void setDataDeEntrada(String dataDeEntrada) {
		//atribuindo valor para dataDeEntrada
		this.dataDeEntrada = dataDeEntrada;
	}

	//criando um método getRg
	public String getRg() {
		//pegando variável rg e mostrando de forma segura
		return rg;
	}
	//criando um método setRg
	public void setRg(String rg) {
		//atribuindo valor para rg
		this.rg = rg;
	}

	//criando um método isEstaNaEmpresa
	public boolean isEstaNaEmpresa() {
		//pegando variável estaNaEmpresa e mostrando de forma segura
		return estaNaEmpresa;
	}
	//criando um método setEstaNaEmpresa
	public void setEstaNaEmpresa(boolean estaNaEmpresa) {
		//atribuindo valor para estaNaEmpresa
		this.estaNaEmpresa = estaNaEmpresa;
	}

	//criando um método calculaSalario
	public void calculaSalario(double valor) {
		//calculando o sálario
		this.salario = valor - (valor * 0.06);
	}

	//criando um método calculaSalario
	public void calculaSalario(double valor, double horaExtra) {
		//calculando o valor extra
		double valorHorasExtra = (valor/30) / 8 * horaExtra;
		//calculando o salário com valor extra
		this.salario = valor - (valor*0.06) + valorHorasExtra;
	}

	//criando o método calculaSalario
	public double  calculaSalario() {
		//calculando o sálario e retornando
		return this.salario = this.salario - (this.salario * 0.06);
	}

	//criando o método bonifica
	public double bonifica(){
		//calculando e retornando a bonificação
		return this.salario * 0.10;
	}
	
	//criando o método demite
	public void demite() {
		//alterando status para  false (demitido)
		estaNaEmpresa = false;
	}

	//criando o método calculaGanhoAnual
	public double calculaGanhoAnual() {
		//retornando valor do ganho anual
		return salario * 12;
	}
	
	

}
