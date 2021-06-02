package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.entities.User;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;



public interface UserService {
	Result add(User user);
	DataResult<User> findByEmail(String email);
	
}
