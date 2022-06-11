package metier.entities;

import java.io.Serializable;
import javax.persistence.*;


@Entity
@DiscriminatorValue("ETU")
public class Etudiant extends Adherent {

	
private static final long serialVersionUID = 1L;
private String filiere;
private int annee_inscrip;

	public Etudiant() {
		super();
	}
   
}
