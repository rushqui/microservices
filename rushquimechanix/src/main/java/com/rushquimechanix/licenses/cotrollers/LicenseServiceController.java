package com.rushquimechanix.licenses.cotrollers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rushquimechanix.model.License;

@RestController
@RequestMapping(value="/v1/organizations/{organizationId}/licenses")
public class LicenseServiceController {
	
	@RequestMapping(value="/{lcenseId}", method= RequestMethod.GET)
	public License getLicenses(@PathVariable("organizationId") String organizationId,
							@PathVariable("lcenseId") String lcenseId) {
		return new License()
				.withId(lcenseId)
				.withProductName("Teleco")
				.withLicenseType("Seat")
				.withOrganizationId("TestOrg");
		
		
	}
}
