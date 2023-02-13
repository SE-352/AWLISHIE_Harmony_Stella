package entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Data
@AllArgsConstructor
@Entity


public class BasedEntity {
  @Id()
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  
}