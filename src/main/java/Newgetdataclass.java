import io.restassured.RestAssured;
import io.restassured.response.Response;



public class Newgetdataclass {
    public static void main(String[] agrs){
        RestAssured.baseURI = "https://reqres.in/";
        for(int i=1;i<=12;i++){
            Response getobject = RestAssured.given().get("/api/users/"+i);
            String first=getobject.path("data.first_name");
            System.out.println(first);
        }

    }
}
