package com.vanillascript;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class RestSnippet {
	public static void main(String[] args) {
		
		RestAssured.baseURI="api/";
		RestAssured.authentication=RestAssured.basic("test@tes.com", "test");
		RequestSpecification inputRequest=RestAssured
				.given().log().all().body("test");
		Response outPutRequest=inputRequest.post();
		outPutRequest.prettyPrint();
		System.out.println("Satuse code "+outPutRequest.statusCode());
	}
	

}
