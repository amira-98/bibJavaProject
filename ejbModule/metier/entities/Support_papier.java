package metier.entities;

import java.io.Serializable;
import javax.persistence.*;


@Entity
@DiscriminatorValue("pap")
public class Support_papier extends Oeuvre {

	
private static final long serialVersionUID = 1L;
private int nb_copie_dispo;


	public Support_papier() {
		super();
	}
   
}
