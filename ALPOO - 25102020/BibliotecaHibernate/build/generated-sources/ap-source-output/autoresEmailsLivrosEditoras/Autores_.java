package autoresEmailsLivrosEditoras;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Autores.class)
public abstract class Autores_ {

	public static volatile SetAttribute<Autores, Livros> Livros;
	public static volatile SingularAttribute<Autores, Integer> idAut;
	public static volatile SingularAttribute<Autores, String> Nome;
	public static volatile ListAttribute<Autores, Email> email;

}

