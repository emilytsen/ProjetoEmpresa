//instanciando a classe Gerente herdando de Funcionario 
public class Gerente extends Funcionario{
	//criando variável privada (atributo) login
	private String login;
	//criando variável privada (atributo) senha
	private String senha;
	
	//criando um método getLogin
	public String getLogin() {
		//pegando variável código e mostrando de forma segura
		return login;
	}
	//criando um método setLogin
	public void setLogin(String login) {
		//atribuindo valor para login
		this.login = login;
	}

	//criando um método getSenha
	public String getSenha() {
		//pegando variável código e mostrando de forma segura
		return senha;
	}
	//criando um método setSenha
	public void setSenha(String senha) {
		//atribuindo valor para senha
		this.senha = senha;
	}
	//criando um método bonifica
	public double bonifica(){
		//calculando e retornando bonifica
		return this.salario * 0.15;
	}
	
	//criando um método autentica
	public void autentica(String login, String senha) {
		//criando condicional para login 
		if((this.login == login) && (this.senha == senha)) {
			//permitindo acesso caso senha e login estejam corretos
			System.out.println("Acesso Permitido!");
		}else{
			//bloqueando acesso caso senha e login estejam incorretos
			System.out.println("Acesso Negado!");
		}
	}
}
