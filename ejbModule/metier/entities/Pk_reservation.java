package metier.entities;

import java.io.Serializable;

public class Pk_reservation implements Serializable {
	
	private int id_adherent;
	private int id_oeuvre;
	public int getId_adherent() {
		return id_adherent;
	}
	public void setId_adherent(int id_adherent) {
		this.id_adherent = id_adherent;
	}
	public int getId_oeuvre() {
		return id_oeuvre;
	}
	public void setId_oeuvre(int id_oeuvre) {
		this.id_oeuvre = id_oeuvre;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	
}
