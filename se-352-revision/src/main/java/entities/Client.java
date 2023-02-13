package entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
@Table(name="Client")
public class Client extends BasedEntity{
	
	@Column(name="code",length=60,nullable=false,unique=true)
	private String code;
	
	
	@Column(name="RaisonSociale",length=250,nullable=true)
	private String raison;
	

	@OneToMany(mappedBy="client")
	private Set<Container> containers;
	
	
	@ManyToOne
	@JoinColumn(name="pays_id")
	private Pays pays;
	
	
	@OneToOne( cascade = CascadeType.ALL ) 
    @JoinColumn( name="coordonnees" )
    private Coordonnees coordonnees;
}
