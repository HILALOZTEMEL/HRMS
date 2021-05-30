package kodlamaio.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="users")
public class User {
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;	
	
	@Column(name="eposta")
	private String ePosta;
	@Column(name="password")
	private String password;
	@Column(name="password_repeat")
	private String passwordRepeat;
	
	

}
