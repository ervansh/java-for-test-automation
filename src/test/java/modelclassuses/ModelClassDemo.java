package modelclassuses;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ModelClassDemo {

	SoftAssert softassert = new SoftAssert();
	private String usersBaseURI;

	@Test
	public void getSingleUserData() {
		usersBaseURI = "https://jsonplaceholder.typicode.com/users/1";
		Response response = RestAssured.given().baseUri(usersBaseURI).contentType(ContentType.JSON).when().get().then()
				.extract().response();
		softassert.assertEquals(response.getStatusCode(), "200");
		// System.out.println(response.asPrettyString() + " >>>>>>>>>>>>>>>>>>>>>"+
		// "\n");

		ResponseModelClass rs = response.as(ResponseModelClass.class);
		System.out.println(rs.getName().toString() + " ?????????????????? \n");
	}

	@Test
	public void getMultiUsersData() {
		usersBaseURI = "https://jsonplaceholder.typicode.com/users";
		Response response = RestAssured.given().baseUri(usersBaseURI).contentType(ContentType.JSON).when().get().then()
				.extract().response();
		softassert.assertEquals(response.getStatusCode(), "200");

		List<ResponseModelClass> users = response.jsonPath().getList("", ResponseModelClass.class);
		assertTrue(!users.isEmpty());
		users.forEach(e -> System.out.println(e.getAddress().getCity() + " Address- city !!!! \n"));

	}
}
