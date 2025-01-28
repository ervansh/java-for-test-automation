package apitesting;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Task02_HomeTask_REST_Functional {

	SoftAssert softassert = new SoftAssert();
	private String baseURL = "https://jsonplaceholder.typicode.com";
	String updatedatafile;
	String postdatafile;

	@BeforeTest
	public void setup() {
		try {
			updatedatafile = FileUtils.readFileToString(new File(Constants.updateDataFile), "UTF-8");
			postdatafile = FileUtils.readFileToString(new File(Constants.postDataFile), "UTF-8");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@DataProvider
	public Object[][] endPoints() {
		return new Object[][] { { "/posts" }, { "/comments" }, { "/albums" }, { "/photos" }, { "/todos" },
				{ "/users" } };
	}

	@Test(dataProvider = "endPoints", enabled = false)
	public void getResourceCount(String endpoint) {
		Response response = RestAssured.given().baseUri(baseURL).when().get(endpoint).then().assertThat()
				.statusCode(200).extract().response();

		List<Integer> ids = response.path("id");
		System.out.println("Number of resources at resource end point " + endpoint + " are " + ids.size());
	}

	@Test(dataProvider = "endPoints", dependsOnMethods = "getResourceCount", enabled = false)
	public void getSpecificData(String endpoint) {

		Response response = RestAssured.given().baseUri(baseURL + endpoint).when().get("/2").then().assertThat()
				.statusCode(200).extract().response();

		int id = response.path("id");
		softassert.assertTrue(response.getStatusCode() == 200);
		softassert.assertTrue(id == 2);
		softassert.assertAll();
	}

	@Test(dataProvider = "endPoints", enabled = false)
	public void updateSpecificData(String endpoint) {
		Response response = RestAssured.given().baseUri(baseURL + endpoint).contentType(ContentType.JSON)
				.body(updatedatafile).when().patch("/2").then().assertThat().statusCode(200).extract().response();

		String title = response.path("title");
		softassert.assertTrue(response.getStatusCode() == 200);
		softassert.assertTrue(title == "Testing in English");
		softassert.assertAll();
	}

	@Test(dataProvider = "endPoints", enabled = true)
	public void createSpecificData(String endpoint) {
		Response response = RestAssured.given().baseUri(baseURL + endpoint).contentType(ContentType.JSON)
				.body(postdatafile).when().post().then().assertThat().statusCode(201).extract().response();

		softassert.assertTrue(response.getStatusCode() == 201);
		softassert.assertAll();
	}

	@Test(dataProvider = "endPoints", dependsOnMethods = "createSpecificData", enabled = true)
	public void deleteSpecificData(String endpoint) {
		Response response = RestAssured.given().baseUri(baseURL + endpoint).contentType(ContentType.JSON).when()
				.delete("/4996").then().assertThat().statusCode(200).extract().response();

		softassert.assertTrue(response.getStatusCode() == 200);
		softassert.assertAll();
	}

}
