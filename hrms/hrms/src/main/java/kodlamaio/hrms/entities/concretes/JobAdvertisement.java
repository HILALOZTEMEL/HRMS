package kodlamaio.hrms.entities.concretes;
import java.time.LocalDate;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="job_advertisement")
public class JobAdvertisement {
	@Id
	@GeneratedValue
	@Column(name="job_description_id")
	private int userId;
	@Column(name = "job_description")
	private String jobDescription;
	@Column(name = "min_salary")
	private double minSalary;
	
	@Column(name = "max_salary")
	private double maxSalary;
	
	@Column(name = "number_of_open_positions")
	private int numberOfOpenPositions;
	
	@Column(name = "application_deadline")
	private LocalDate applicationDeadline;
	
	@Column(name = "posted_date")
	private LocalDate postedDate;
	
	@Column(name = "is_active")
	private boolean isActive;
	
	@ManyToOne()
	@JoinColumn(name="user_id")
	private Employer employer;
	
	@ManyToOne()
	@JoinColumn(name="city_id")
	private City city;
	
	
}
