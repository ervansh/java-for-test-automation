package apitesting;

public class JiraResources {

	private static final String baseURI = "https://ervanshsingh.atlassian.net/rest/api/3/issue";

	private static final String encodedtoken = "ZXJ2YW5zaHNpbmdoQGdtYWlsLmNvbTpBVEFUVDN4RmZHRjBtcURoUmR1dW1KY2Y2N1pjdUQtci01ang0NVV6c0wtMXNaQ1g0VmJoRVNCa0tXT3QtMnBMLXJKUWdrWmtkQ0ppWjZ2aEx6aXlzNU02Tmo5b2ZrRXZGb3Y5d2VTdUFsR0d4SGtzZFpJeU5LUWVUVlhOVzM1QUo2VmN4RW0xREFQakxGZDlqWXBULUlPb010X2NnYWRoNHU4dmJzQThNcHpUeFh4MEx5SnhtWUk9MjhEMzg5OTg=";

	public static String getAuthToken() {
		return encodedtoken;
	}

	public static String getBaseURI() {
		return baseURI;
	}
}
