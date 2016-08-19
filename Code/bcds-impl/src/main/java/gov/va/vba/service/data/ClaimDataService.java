package gov.va.vba.service.data;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import gov.va.vba.domain.Claim;
import gov.va.vba.persistence.repository.ClaimRepository;

@Service
public class ClaimDataService extends AbsDataService<gov.va.vba.persistence.entity.Claim, Claim> {

	public ClaimDataService() {
		this.setClasses(gov.va.vba.persistence.entity.Claim.class, Claim.class);
	}

	public List<Claim> findAll() {
		List<Claim> output = new ArrayList<>();
		List<gov.va.vba.persistence.entity.Claim> input = ((ClaimRepository) repository).findAll();
		mapper.mapAsCollection(input, output, outputClass);
		return output;
	}
	
	public List<Claim> findFirstNumberedRow() {
		List<Claim> output = new ArrayList<>();
		List<gov.va.vba.persistence.entity.Claim> input = ((ClaimRepository) repository).findFirstNumberedRow();
		mapper.mapAsCollection(input, output, outputClass);
		return output;
	}
}