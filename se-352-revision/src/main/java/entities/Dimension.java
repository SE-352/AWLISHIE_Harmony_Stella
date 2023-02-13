package entities;


import javax.persistence.Column;
import javax.persistence.Entity;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
@Table(name="Dimension")
public class Dimension extends BasedEntity{
	
	@Column(name="longueur",nullable=false)
	private double longueur;
	
	@Column(name="largeur",nullable=false)
	private double largeur;
	
	@Column(name="hauteur",nullable=false)
	private double hauteur;
}
