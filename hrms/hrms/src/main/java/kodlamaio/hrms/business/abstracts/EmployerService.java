package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Employer;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;


public interface EmployerService {
	
	DataResult<List<Employer>> getAll();
	Result add(Employer employer);
	Result addPosting(JobAdvertisement jobAdvertisement);
	Result passivePosting(JobAdvertisement jobAdvertisement);
	boolean isItEmpty();
	
}
