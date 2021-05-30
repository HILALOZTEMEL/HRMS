package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobAdvertisementService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.dataAccess.abstracts.JobAdvertisementDao;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;

@Service
public class JobAdvertisementManager implements JobAdvertisementService{
	
	private JobAdvertisementDao jobAdvertisementDao;
	
	@Autowired
	public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao) {
		super();
		this.jobAdvertisementDao = jobAdvertisementDao;
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByIsActiveTrue() {
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.getByIsActiveTrue(),"Data Listelendi ");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByIsActiveTrueOrderByPostedDate() {
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.getByIsActiveTrueOrderByPostedDate(),"Data Listelendi ");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByEmployer_CompanyName(String companyName) {
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.getByEmployer_CompanyName(companyName),"Data Listelendi ");
	}

}
