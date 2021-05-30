package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.EmployerDao;
import kodlamaio.hrms.entities.concretes.Employer;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;

@Service
public class EmployerManager implements EmployerService {
	
	public EmployerDao employerDao;
	
	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}

	@Override
	public DataResult<List<Employer>> getAll() {
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(),"Data Listelendi ");
	}

	@Override
	public boolean isItEmpty() {
		
		return false;
	}

	@Override
	public Result add(Employer employer) {
		if(isItEmpty()) {
			return new ErrorResult("Tüm alanların Doldurulması zorunludur");
		}else {
			return new SuccessResult("Başarılı");
		}
		
		
	}

	@Override
	public Result addPosting(JobAdvertisement jobAdvertisement) {
		
		return new SuccessResult("Başarılı");
	}

	@Override
	public Result passivePosting(JobAdvertisement jobAdvertisement) {
		
		return new SuccessResult("Başarılı");
	}

	
}
