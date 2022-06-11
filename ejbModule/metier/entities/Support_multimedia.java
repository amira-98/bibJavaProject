package metier.entities;

import java.io.Serializable;
import javax.persistence.*;


@Entity
@DiscriminatorValue("mul")
public class Support_multimedia extends Oeuvre {


	private static final long serialVersionUID = 1L;
private int nb_copie_dispo;

	public Support_multimedia() {
		super();
	}
   
}
