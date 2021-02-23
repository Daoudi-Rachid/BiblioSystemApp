package fr.groupe3.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Emprunt {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@NotNull
	private Date DateEmprunt;
	@NotNull
	private Date DateRetour;
	@OneToOne
	@JoinColumn(name="livre_id")
	private Livre livre;
	
}
