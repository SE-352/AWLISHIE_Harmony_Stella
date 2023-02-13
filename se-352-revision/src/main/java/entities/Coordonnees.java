package entities;



import javax.persistence.Column;
import javax.persistence.Entity;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
@Table(name="Coordonnees")
public class Coordonnees extends BasedEntity{
	
	@Column(name="code",length=60,nullable=false,unique=true)
	private String code;
	
	@Column(length=120,nullable=false)
	private String Adresse;
	
	@Column(name="NumeroTelephone",length=80,nullable=true)
	private String NumTel;
}
