package metier.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.*;

@Entity

public class Categorie implements Serializable {
@Id
private int id_categorie;
private String libelle;
@OneToMany (mappedBy="cat",fetch=FetchType.LAZY, cascade=CascadeType.ALL)
private Collection<Oeuvre> oeuvres;	
	
	
	public Categorie()
	{
		super();
	}
   
}
