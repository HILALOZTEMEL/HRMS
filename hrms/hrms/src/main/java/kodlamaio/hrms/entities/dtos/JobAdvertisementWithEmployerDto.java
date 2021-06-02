package kodlamaio.hrms.entities.dtos;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobAdvertisementWithEmployerDto {
	
	private String companyName;	
	private int numberOfOpenPositions;
	private LocalDate applicationDeadline;
	private LocalDate postedDate;
	
	
	
}
