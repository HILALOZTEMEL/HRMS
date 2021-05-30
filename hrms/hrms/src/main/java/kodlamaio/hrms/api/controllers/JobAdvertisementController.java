package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobAdvertisementService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;

@RestController
@RequestMapping("/api/JobAdvertisements")
public class JobAdvertisementController {
	
	private JobAdvertisementService jobAdvertisementService;
	@Autowired
	public JobAdvertisementController(JobAdvertisementService jobAdvertisementService) {
		super();
		this.jobAdvertisementService = jobAdvertisementService;
	}
	@GetMapping("/getByIsActiveTrue")
	public DataResult<List<JobAdvertisement>> getByIsActiveTrue(){
		return this.jobAdvertisementService.getByIsActiveTrue();
	}
	@GetMapping("/getByIsActiveTrueOrderByPostedDate")
	public DataResult<List<JobAdvertisement>> getByIsActiveTrueOrderByPostedDate(){
		return this.jobAdvertisementService.getByIsActiveTrueOrderByPostedDate();
	}
	@GetMapping("/getByEmployer_CompanyName")
	public DataResult<List<JobAdvertisement>> getByEmployer_CompanyName(String companyName){
		return this.jobAdvertisementService.getByEmployer_CompanyName(companyName);
	}
	
}
