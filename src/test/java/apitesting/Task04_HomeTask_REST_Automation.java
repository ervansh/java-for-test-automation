package apitesting;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Task04_HomeTask_REST_Automation {

	SoftAssert softassert = new SoftAssert();
	String apikey = "0dfa75e62176bbc34e10f95dab4b853e";
	String city = "hyderabad";
	float lat;
	float lon;

	public String baseuri = "http://api.openweathermap.org/data/2.5/weather";

	@Test
	public void getcityWeather() {
		Response response = RestAssured.given().baseUri(baseuri).queryParam("q", city).queryParam("appid", apikey)
				.when().get().then().assertThat().statusCode(200).extract().response();
		JsonPath jsonpath = new JsonPath(response.body().asString());
		lon = jsonpath.get("coord.lon");
		lat = jsonpath.get("coord.lat");
		System.out.println("Lat: " + lat + "\n" + "Lon: " + lon);
	}

	@Test(dependsOnMethods = "getcityWeather")
	public void verifyData() {
		Response response = RestAssured.given().baseUri(baseuri).queryParam("lat", lat).queryParam("lon", lon)
				.queryParam("appid", apikey).when().get().then().assertThat().statusCode(200).extract().response();

		JsonPath jsonpath = new JsonPath(response.body().asString());
		float tempmin = jsonpath.get("main.temp_min");
		float temp = jsonpath.get("main.temp");
		
		softassert.assertEquals(jsonpath.get("name"), "Hyderabad");
		softassert.assertEquals(jsonpath.get("sys.country"), "IN");
		softassert.assertTrue(tempmin>0);
		softassert.assertTrue(temp>0);

	}
}
