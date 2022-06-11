package metier.entities;

import java.io.Serializable;


public class Pk_emprunt implements Serializable
{
	private int id_adherent;
	private int id_livre;
	public int getId_adherent() {
		return id_adherent;
	}
	public void setId_adherent(int id_adherent) {
		this.id_adherent = id_adherent;
	}
	public int getId_livre() {
		return id_livre;
	}
	public void setId_livre(int id_livre) {
		this.id_livre = id_livre;
	}
	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return super.equals(arg0);
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	

}
