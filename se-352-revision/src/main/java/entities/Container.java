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
@Table(name="Container")
public class Container extends BasedEntity{
	
	@Column(name="code",length=60,nullable=false,unique=true)
	private String code;
	
	@ManyToOne
	@JoinColumn(name="client_id")
	private Client client;
	
	@OneToMany(mappedBy="container")
	private Set<Matiere> matieres;
	
	@OneToOne( cascade = CascadeType.ALL ) 
    @JoinColumn( name="dimension" )
    private Dimension dimension;

	

}
