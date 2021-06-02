package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;
import kodlamaio.hrms.entities.dtos.JobAdvertisementWithEmployerDto;

public interface JobAdvertisementService {
	DataResult<List<JobAdvertisementWithEmployerDto>> getByIsActiveTrue();
	DataResult<List<JobAdvertisementWithEmployerDto>> getByIsActiveTrueOrderByPostedDate();
	DataResult<List<JobAdvertisementWithEmployerDto>> getByEmployer_CompanyName(String companyName);

}
