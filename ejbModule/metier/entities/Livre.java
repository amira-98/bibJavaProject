package metier.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.*;


@Entity

public class Livre implements Serializable {

@Id
private int id_livre;
private Date date_edition;
private int etat;
private double prix;
private int qte;

@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name="fk_oeuvre")
private Oeuvre oeuv;

@ManyToMany(mappedBy="livres")
private Collection<Adherent> adherents;
	
@OneToMany(mappedBy="liv")
private Collection<Emprunt> livres;
	public Livre() {
		super();
	}
   
}
