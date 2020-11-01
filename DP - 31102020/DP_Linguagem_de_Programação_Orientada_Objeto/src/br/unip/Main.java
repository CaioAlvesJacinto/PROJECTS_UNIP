package br.unip;
import models.*;

public class Main {

	public static void main(String[] args) {

		Pessoa p = new Pessoa();
		p.setNome("Caio");
		p.setTelefone("12987083064");
		p.setEndereco("Rua Ângela Aparecida Ramos, 31 - Jardim Santa Marina - Jacareí / SP");
		
		Pessoa p1 = new Pessoa("Vitória", "12988260935");
		p1.setEndereco("Rua Mario Lago, 74 - Cidade Salvador - Jacareí / SP");
		
		Pessoa p2 = new Pessoa("Apartamento 10, Andar 5 - Vila Branca - Jacareí / SP");
		p2.setNome("Leonardo");
		p2.setTelefone("12985236412");
		
		Fornecedor f = new Fornecedor(50000.00,40000.00);
		f.setNome("Cruyff LTDA");
		f.setTelefone("1239546987");
		f.setEndereco("Cond. Vert Ville, 503 - Jardim Santa Maria - Jacareí / SP");
		f.obterSaldo(f.getValorCredito(), f.getValorDivida());
		
		Empregado e = new Empregado();
		e.setNome("Caio");
		e.setTelefone("12987083064");
		e.setEndereco("Rua Ângela Aparecida Ramos, 31 - Jardim Santa Marina - Jacareí / SP");
		e.setSalarioBase(5000.00);
		e.setCodigoSetor(5);
		e.setImposto(0.2);
		e.calcularSalario();
		
		Empregado e1 = new Empregado();
		e1.setSalarioBase(6000.00);
		e1.setImposto(0.2);
		e1.calcularSalario();
					
		Administrador a = new Administrador();
		a.setNome("Pedro Marcos");
		a.setTelefone("12986325687");
		a.setEndereco("Rua Dominó Leopoldo, 56 - Jardim Aquarius - São José dos Campos / SP");
		a.setAjudaDeCusto(10000.00);
		a.setCodigoSetor(10);
		a.setSalarioBase(8000.00);
		a.setImposto(0.25);
		a.calcularSalario();
		
		Operario o = new Operario();
		o.setNome("Gabriel");
		o.setTelefone("12988260395");
		o.setEndereco("Rua Mario Lago, 74 - Cidade Salvador - Jacareí / SP");
		o.setCodigoSetor(3);
		o.setSalarioBase(4620.00);
		o.setValorProducao(2351.23);
		o.setImposto(0.23);
		o.setComissao(1562.36);
		o.calcularSalario();
		
		
	}

}
