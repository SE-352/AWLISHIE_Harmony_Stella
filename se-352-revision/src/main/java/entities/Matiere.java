package entities;

import javax.persistence.Column;
import javax.persistence.Entity;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
@Table(name="Matiere")
public class Matiere extends BasedEntity{
	
	@Column(name="code",length=60,nullable=false,unique=true)
	private String code;
	
	@Column(name="type",length=60,nullable=false)
	private String type;
	
	@Column(name="libelle",length=60,nullable=false)
	private String libelle;
	
	
	@ManyToOne
	@JoinColumn(name="container_id")
	private Container container;
	
	
}
