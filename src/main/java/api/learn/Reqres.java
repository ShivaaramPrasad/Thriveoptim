package api.learn;

import java.util.List;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.response.Response;

public class Reqres {
		
		@Test
		public void getUserData() {
			RestAssured.baseURI = "https://reqres.in/";
			RestAssured.basePath="api/users?page=2";
			Response inputrequest = RestAssured
					.given()
								 .log().all()
								 .header(new Header("content-Type","application.JSON"))
								 .contentType(ContentType.JSON)								 
                     .when()
				                 .get();
			inputrequest.prettyPrint();
			System.out.println("Satuse code "+inputrequest.statusCode());
			List <Integer> ids = inputrequest.jsonPath().getList("data.id");
			for (Integer  id: ids) 
			 System.out.println(id);
			}
}
