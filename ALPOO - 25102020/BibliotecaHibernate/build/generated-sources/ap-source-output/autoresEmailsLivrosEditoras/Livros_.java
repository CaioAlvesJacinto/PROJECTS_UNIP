package autoresEmailsLivrosEditoras;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Livros.class)
public abstract class Livros_ {

	public static volatile SetAttribute<Livros, Autores> Autores;
	public static volatile SingularAttribute<Livros, Double> custo;
	public static volatile SingularAttribute<Livros, Integer> idLiv;
	public static volatile SingularAttribute<Livros, String> titulo;
	public static volatile SingularAttribute<Livros, Integer> edicao;

}

