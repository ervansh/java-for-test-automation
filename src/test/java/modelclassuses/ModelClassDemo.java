package modelclassuses;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.not;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ModelClassDemo {

	SoftAssert softassert = new SoftAssert();
	private String usersBaseURI = "https://jsonplaceholder.typicode.com/";

	@BeforeMethod(description = "Set baseURI")
	public void setUp() {
		RestAssured.baseURI = usersBaseURI;
		RestAssured.basePath = "users";
	}

	@Test(description = "Single user data and manipulations")
	public void getSingleUserData() {
		Response response = RestAssured.given().contentType(ContentType.JSON).when().get("/1").then().extract()
				.response();

		softassert.assertEquals(response.getStatusCode(), "200");
		// System.out.println(response.asPrettyString() + " >>>>>>>>>>>>>>>>>>>>>"+
		// "\n");

		ResponseModelClass rs = response.as(ResponseModelClass.class);
		System.out.println(rs.getName().toString() + " ?????????????????? Name \n");
	}

	@Test(description = "Multi user data and manipulations")
	public void getMultiUsersData() {
		Response response = RestAssured.given().contentType(ContentType.JSON).when().get().then().extract().response();
		softassert.assertEquals(response.getStatusCode(), "200");

		List<ResponseModelClass> users = response.jsonPath().getList("", ResponseModelClass.class);
		assertThat(users, not(empty())); // hamcrest matchers
		assertTrue(!users.isEmpty()); // testng assertion

		users.forEach(e -> System.out.println(e.getAddress().getCity() + " Address- city !!!! "));
		System.out.println("\n");
		System.out.println(users.get(0).getUsername() + " Username of index 0");
		System.out.println("\n" + users.size() + " size");
		System.out.println("\n" + users.getFirst());
	}

	@Test(description = "Data manipulations using Hamcrest Matchers")
	public void dataManipulationsUsingMatchers() {
		RestAssured.given().contentType(ContentType.JSON).when().get().then().assertThat()
				// .body("name", is("Leanne Graham"))
				.statusCode(200).body("id", hasItems(1));
	}

}
