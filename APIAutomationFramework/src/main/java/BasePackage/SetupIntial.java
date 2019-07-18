package BasePackage;

import org.testng.annotations.BeforeSuite;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SetupIntial {
	
	public RequestSpecification httpRequest;
	public Response response;
	
	@BeforeSuite
	public void intailSetup()
	
	{
		
	}

}
