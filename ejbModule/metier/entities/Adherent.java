package metier.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.*;

@Entity
@DiscriminatorColumn(name="Type_adherent",length=3)
public class Adherent implements Serializable {

	
private static final long serialVersionUID = 1L;
@Id
private int id_adherent;
private String nom;
private String prenom;
private String adresse;
private String email; 
private int tel;
private int nb_emp_courant;
private int blacklist;

@OneToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "login")
private Compte cpt;

@ManyToMany
@JoinTable(name = "adh_oeuv",
joinColumns = @JoinColumn(name = "id_adherent"),
inverseJoinColumns = @JoinColumn(name = "id_oeuvre"))
private Collection<Oeuvre> oeuvres;
@ManyToMany
@JoinTable(name = "adh_liv",
joinColumns = @JoinColumn(name = "id_adherent"),
inverseJoinColumns = @JoinColumn(name = "id_oeuvre"))
private Collection<Livre> livres;

@OneToMany(mappedBy="adhe")
private Collection<Reservation> adheren;

@OneToMany(mappedBy="adh")
private Collection<Emprunt> adherents;

	public Adherent() {
		super();
	}
   
}
