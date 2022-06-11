package metier.entities;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@DiscriminatorValue("ENS")
public class Enseignant extends Adherent {

	
private static final long serialVersionUID = 1L;
private String grade;
private String departement;
	public Enseignant() {
		super();
	}
   
}
