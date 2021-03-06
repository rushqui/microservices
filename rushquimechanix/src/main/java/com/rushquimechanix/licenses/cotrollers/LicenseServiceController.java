package com.rushquimechanix.licenses.cotrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.rushquimechanix.licenses.config.ServiceConfig;
import com.rushquimechanix.licenses.services.LicenseService;
import com.rushquimechanix.model.License;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping(value="/v1/organizations/licenses")
public class LicenseServiceController {
	
	@Autowired
	private LicenseService licenseService;

	@Autowired
	private ServiceConfig serviceConfig;
	
//	@RequestMapping(value="/{lcenseId}", method= RequestMethod.GET)
//	public License getLicenses2(@PathVariable("organizationId") String organizationId,
//							@PathVariable("lcenseId") String lcenseId) {
//		return new License()
//				.withId(lcenseId)
//				.withProductName("Teleco")
//				.withLicenseType("Seat")
//				.withOrganizationId("TestOrg");
//	}
	
	 @RequestMapping(value="/",method = RequestMethod.GET)
	 public List<License> getLicenses( @PathVariable("organizationId") String organizationId) {
		 return licenseService.getLicensesByOrg(organizationId);
	 }

	 @RequestMapping(value="/{licenseId}",method = RequestMethod.GET)
	 public License getLicenses( @PathVariable("organizationId") String organizationId,
	                                @PathVariable("licenseId") String licenseId) {
		 return licenseService.getLicense(organizationId,licenseId);
	 }

	 @RequestMapping(value="{licenseId}",method = RequestMethod.PUT)
	 public String updateLicenses( @PathVariable("licenseId") String licenseId) {
		 return String.format("This is the put");
	}

	 @RequestMapping(value="/",method = RequestMethod.POST)
	 public void saveLicenses(@RequestBody License license) {
		 licenseService.saveLicense(license);
	 }

	 @RequestMapping(value="{licenseId}",method = RequestMethod.DELETE)
	 @ResponseStatus(HttpStatus.NO_CONTENT)
	 public String deleteLicenses( @PathVariable("licenseId") String licenseId) {
		 return String.format("This is the Delete");
	}
}
