package fr.groupe3.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Emprunteur {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@OneToOne
	private Utilisateur utilisateur;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name = "adresse_residence_id", referencedColumnName = "id")
	private Adresse aResidence;
	
	public Emprunteur() {}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public Adresse getaResidence() {
		return aResidence;
	}

	public void setaResidence(Adresse aResidence) {
		this.aResidence = aResidence;
	}
}
