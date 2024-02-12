package day6;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class ExmplePostReqiest {

    public static void main(String[] args) {

        RestAssured.baseURI = "https://reqres.in/";
        RestAssured.basePath = "/api/users";

        Response resp = given().contentType("application/json").body("{\n" +
                "    \"name\": \"morpheus\",\n" +
                "    \"job\": \"leader\"\n" +
                "}").log().all().post();

        System.out.println("Status: " + resp.statusCode());

        resp.prettyPrint();

    }
}
