package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="system_personnel")
public class SystemPersonel {
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="departman")
	private String departman;
	


	


}
