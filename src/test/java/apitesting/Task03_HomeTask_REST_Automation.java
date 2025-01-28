package apitesting;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Task03_HomeTask_REST_Automation {
	SoftAssert softassert = new SoftAssert();
	public String petBaseURI = "https://petstore.swagger.io/v2/pet";
	public String usersBaseURI = "https://jsonplaceholder.typicode.com/users";
	private String filePetData;

	@BeforeTest
	public void setUpData() {
		try {
			filePetData = FileUtils.readFileToString(new File(Constants.getPetStoreDataFile), "UTF-8");
		} catch (IOException e) {
			e.getStackTrace();
		}
	}

	@Test
	public void postPetData() {
		Response response = RestAssured.given().baseUri(petBaseURI).contentType(ContentType.JSON).body(filePetData)
				.accept(ContentType.JSON).when().post().then().extract().response();

		Assert.assertTrue(response.getStatusCode() == 200);
	}

	@Test(dependsOnMethods = "postPetData", enabled = true)
	public void getPetData() {
		Response response = RestAssured.given().baseUri(petBaseURI).contentType(ContentType.JSON).when().get("/12345")
				.then().extract().response();
		softassert.assertEquals(response.getStatusCode(), "200");
		softassert.assertEquals(response.contentType(), ContentType.JSON);

		softassert.assertEquals(response.path("category.name"), "dog");
		softassert.assertEquals(response.path("pet.name"), "snoopie");
		softassert.assertEquals(response.path("pet.photoUrls.status"), "pending");
		softassert.assertAll();
	}

	@Test
	public void getUsersData() {
		Response response = RestAssured.given().baseUri(usersBaseURI).contentType(ContentType.JSON).when().get().then()
				.extract().response();
		softassert.assertEquals(response.getStatusCode(), "200");

		JsonPath jsonpath = new JsonPath(response.body().asString());
		List<String> names = jsonpath.get("name");
		softassert.assertTrue(names.size() > 3);
		softassert.assertTrue(names.contains("Ervin Howell"));
	}
}
