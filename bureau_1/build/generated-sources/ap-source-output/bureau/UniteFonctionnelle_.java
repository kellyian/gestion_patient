package bureau;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(UniteFonctionnelle.class)
public abstract class UniteFonctionnelle_ {

	public static volatile SingularAttribute<UniteFonctionnelle, String> nom_uf;
	public static volatile SingularAttribute<UniteFonctionnelle, Integer> id;
	public static volatile ListAttribute<UniteFonctionnelle, Chambre> chambres;

}

