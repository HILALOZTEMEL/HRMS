package kodlamaio.hrms.entities.concretes;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
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
@Table(name="city")
public class City {
	@Id
	@GeneratedValue
	@Column(name="city_id")
	private int userId;
	@Column(name="city_name")
	private String companyName;

	@OneToMany(mappedBy = "city")
	private List<JobAdvertisement> jobAdvertisements;
}
