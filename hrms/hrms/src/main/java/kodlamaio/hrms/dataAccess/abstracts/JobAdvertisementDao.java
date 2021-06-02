package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.hrms.entities.concretes.JobAdvertisement;
import kodlamaio.hrms.entities.dtos.JobAdvertisementWithEmployerDto;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer>{
	@Query("Select new kodlamaio.hrms.entities.dtos.JobAdvertisementWithEmployerDto"
			+ "(e.companyName, j.numberOfOpenPositions, j.applicationDeadline, j.postedDate) "
			+ "From JobAdvertisement j Inner Join j.employer e where j.isActive=true ")
	List<JobAdvertisementWithEmployerDto> getByIsActiveTrue();
	
	@Query("Select new kodlamaio.hrms.entities.dtos.JobAdvertisementWithEmployerDto"
			+ "(e.companyName, j.numberOfOpenPositions, j.applicationDeadline, j.postedDate) "
			+ "From JobAdvertisement j Inner Join j.employer e where j.isActive=true Order By j.postedDate ASC ")
	List<JobAdvertisementWithEmployerDto> getByIsActiveTrueOrderByPostedDate();
	
	@Query("Select new kodlamaio.hrms.entities.dtos.JobAdvertisementWithEmployerDto"
			+ "(e.companyName, j.numberOfOpenPositions, j.applicationDeadline, j.postedDate) "
			+ "From JobAdvertisement j Inner Join j.employer e where e.companyName=:companyName And j.isActive=true ")
	List<JobAdvertisementWithEmployerDto> getByEmployer_CompanyName(String companyName);
	

	
}
