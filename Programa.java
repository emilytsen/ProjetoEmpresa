//instanciando a classe Filme
public class Programa {

	//Declaração pedindo pra JVM rodar método main
	public static void main(String[] args) {
		
		//criando espaço para os objetos
		Vendedor v = new Vendedor();
		//atribuindo valores para o objeto
		v.setDataDeEntrada("10/01/2010");
		//atribuindo valores para o objeto
		v.setDepartamento("Vendas");
		//atribuindo valores para o objeto
		v.setEstaNaEmpresa(true);
		//atribuindo valores para o objeto
		v.setNome("Eduardo");
		//atribuindo valores para o objeto
		v.setRg("45");
		//v.calculaSalario();		
		 
		//criando espaço para os objetos
		Gerente g1 = new Gerente();
		//atribuindo valores para o objeto
		g1.departamento = "Vendas";
		//atribuindo valores para o objeto
		g1.dataDeEntrada = "03/02/1990";
		//atribuindo valores para o objeto
		g1.estaNaEmpresa = true;
		//atribuindo valores para o objeto
		g1.nome = "Eric";		
		//atribuindo valores para o objeto
		g1.rg = "48";
		//atribuindo valores para o objeto
		g1.salario = 3500.0;
		//g1.calculaSalario();
		
		//criando login
		g1.setLogin("eric");
		//criando senha
		g1.setSenha("123");
		
		//criando espaço para os objetos
		Supervisor supervisor = new Supervisor();
		//atribuindo valores para o objeto
		supervisor.salario = 5000.0;
		
		//criando espaço para os objetos
		ControleDeBonificacao controle = new ControleDeBonificacao();
		//atribuindo valores para o objeto
		controle.calculaTotalDeBonus(v);
		//atribuindo valores para o objeto
		controle.calculaTotalDeBonus(g1);
		//atribuindo valores para o objeto
		controle.calculaTotalDeBonus(supervisor);
		
		//printar valor do vendedor
		System.out.println(v.getDataDeEntrada());
		//printar valor do vendedor
		System.out.println(v.getDepartamento());
		//printar valor do vendedor
		System.out.println(v.getNome());
		//printar valor do vendedor
		System.out.println(v.getRg());
		//printar valor do vendedor
		System.out.println(v.getSalario())
		//printar valor do vendedor;
		System.out.println(v.isEstaNaEmpresa());
		//printar valor do vendedor
		System.out.println(v.bonifica());
		
		//separar informações através de barras
		System.out.println("//////////////////////////////");
		//autenticandologin e senha 
		g1.autentica("eric", "124");
		//printar dados do gerente 1
		System.out.println(g1.getDataDeEntrada());
		//printar dados do gerente 1
		System.out.println(g1.getDepartamento());
		//printar dados do gerente 1
		System.out.println(g1.getNome());
		//printar dados do gerente 1
		System.out.println(g1.getRg());
		//printar dados do gerente 1
		System.out.println(g1.getSalario());	
		//printar dados do gerente 1	
		System.out.println(g1.bonifica());
		
		//printar total de bonus
		System.out.println("Total de bonus: R$" + controle.getTotalDeBonus());
		
		
		
		
		
		
		
		
	}
}



