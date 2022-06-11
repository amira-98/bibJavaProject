package metier.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.*;


@Entity
@DiscriminatorColumn(name="Type_oeuvre",length=3)
public class Oeuvre implements Serializable {

	
private static final long serialVersionUID = 1L;
@Id
private int id_oeuvre;
private String titre;
private int nb_dvd;
private int nb_sup_papier;

@ManyToOne
@JoinColumn(name="id_cat")
private Categorie cat;
@ManyToOne
@JoinColumn(name="id_aut")
private Auteur aut;
@OneToMany (mappedBy="oeuv",fetch=FetchType.LAZY, cascade=CascadeType.ALL)
private Collection<Livre> livres;

@ManyToMany(mappedBy="oeuvres")
private Collection<Adherent> adherents;

@OneToMany(mappedBy="oeuvr")
private Collection<Reservation> oeuvrr;

	public Oeuvre() {
		super();
	}
   
}
