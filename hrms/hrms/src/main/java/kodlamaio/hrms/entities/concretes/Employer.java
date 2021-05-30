package kodlamaio.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="employer")
public class Employer {
	@Id
	@GeneratedValue
	@Column(name="user_id")
	private int userId;
	@Column(name="company_name")
	private String companyName;
	@Column(name="website_adress")
	private String websiteAdress;
	@Column(name="phone_number")
	private String phoneNumber;
	
	
	@OneToMany(mappedBy = "employer")
	private List<JobAdvertisement> jobAdvertisements;

}
