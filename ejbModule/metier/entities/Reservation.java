package metier.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;


@Entity
@IdClass(Pk_reservation.class)
public class Reservation implements Serializable {

@Id
private int id_adherent;
@Id
private int id_oeuvre;

private Date date_reservation;
private Date date_annulation;
private String type_support;

@ManyToOne
@JoinColumn(name="id_adherent")
private Adherent adhe;

@ManyToOne
@JoinColumn(name="id_oeuvre")
private Oeuvre oeuvr;


	public Reservation() {
		super();
	}
   
}
