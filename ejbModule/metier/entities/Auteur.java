package metier.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.*;


@Entity

public class Auteur implements Serializable {
@Id
private int id_auteur;
private String nom;
private String prenom;

@OneToMany (mappedBy="aut",fetch=FetchType.LAZY, cascade=CascadeType.ALL)
private Collection<Oeuvre> oeuvres;	
	

	public Auteur() {
		super();
	}
   
}
