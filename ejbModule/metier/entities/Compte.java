package metier.entities;

import java.io.Serializable;
import javax.persistence.*;


@Entity

public class Compte implements Serializable {
@Id
private String login;
private String mp;

@OneToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "id_adherent")
private Adherent adh;

	public Compte() {
		super();
	}
   
}
