package metier.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;


@Entity
@IdClass(Pk_emprunt.class)
public class Emprunt implements Serializable {
@Id
private int id_adherent;
@Id
private int id_livre;




private Date date_emprunt;
private Date date_retour_effective;
private Date date_retour_theorique;
private int nb_aver;
private String type_support;



@ManyToOne(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
@JoinColumn(name="id_adherent")
private Adherent adh;

@ManyToOne(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
@JoinColumn(name="id_livre")
private Livre liv;

	public Emprunt() {
		super();
	}
   
}
