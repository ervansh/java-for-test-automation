package apitesting;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Task06_JiraAPIAutomation {

	SoftAssert softassert = new SoftAssert();
	String defectid;
	String postbody;
	String putbody;

	@BeforeTest
	public void setup() {

		try {
			postbody = FileUtils.readFileToString(new File(Constants.postbodyjiraissue), "UTF-8");
			putbody = FileUtils.readFileToString(new File(Constants.putbodyjiraissue), "UTF-8");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Test
	public void createJiraIssue() {
		System.out.println("body : " + Constants.postbodyjiraissue);
		Response response = RestAssured.given().baseUri(JiraResources.getBaseURI())
				.header("Authorization", "Basic " + JiraResources.getAuthToken()).contentType(ContentType.JSON)
				.body(postbody).when().post().then().assertThat().statusCode(201).extract()
				.response();
		defectid = response.path("id");
	}

	@Test(dependsOnMethods = "createJiraIssue")
	public void getJiraIssue() {
		Response response = RestAssured.given().baseUri(JiraResources.getBaseURI())
				.header("Authorization", "Basic " + JiraResources.getAuthToken()).when().get("/" + defectid).then()
				.assertThat().statusCode(200).extract().response();
		String id = response.path("id");
		System.out.println("Jira id is "+id);
	}

	@Test(dependsOnMethods = "getJiraIssue")
	public void updateJiraIssue() {
		RestAssured.given().baseUri(JiraResources.getBaseURI())
				.header("Authorization", "Basic " + JiraResources.getAuthToken()).contentType(ContentType.JSON)
				.body(putbody).when().put("/" + defectid).then().assertThat().statusCode(204).log().all();
	}

	@Test(dependsOnMethods = "updateJiraIssue")
	public void attachmentInJiraIssue() {
		System.out.println("Jira Attachment: "+Constants.attachmentjiraissue);
		RestAssured.given().baseUri(JiraResources.getBaseURI())
				.header("Authorization", "Basic " + JiraResources.getAuthToken())
				.header("X-Atlassian-Token", "no-check")
				.multiPart("file", new File(Constants.attachmentjiraissue))
				.when().post("/"+defectid+"/attachments")
				.then().assertThat().statusCode(200).log().all();
	}

	@Test(dependsOnMethods = "attachmentInJiraIssue", enabled = true)
	public void deleteJiraIssue() {
		RestAssured.given().baseUri(JiraResources.getBaseURI())
				.header("Authorization", "Basic " + JiraResources.getAuthToken()).when().delete("/" + defectid).then()
				.assertThat().statusCode(204).log().all();
	}
}
