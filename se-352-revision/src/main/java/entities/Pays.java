package entities;


import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;

import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
@Table(name="Pays")
public class Pays extends BasedEntity{
	
	@Column(name="codePays",length=60,nullable=false,unique=true)
	private String code;
	
	@Column(name="NomInternational",length=60,nullable=false)
	private String NomInt;
	
	@OneToMany(mappedBy="Pays")
	private Set<Client> clients;
}
