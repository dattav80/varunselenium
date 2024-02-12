package day6;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class ExmplePostReqiest_POJO {

    public static void main(String[] args) {

        RestAssured.baseURI = "https://reqres.in/";
        RestAssured.basePath = "/api/users";

        CreatUser user = new CreatUser();
        user.setJob("Automation Manager");
        user.setName("Sowmya");

        Response resp = given().contentType("application/json").body(user).log().all().post();

        System.out.println("Status: " + resp.statusCode());

        resp.prettyPrint(); // Serialised response

    }
}
