package org.E2ERestfulBooker.tests.base;

import org.E2ERestfulBooker.actions.AssertActions;
import org.E2ERestfulBooker.endPoints.APIConstants;
import org.E2ERestfulBooker.modules.PayloadManager;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseTest {

    public RequestSpecification requestSpecification;
    public AssertActions assertActions;
    public PayloadManager payloadManager;
    public JsonPath jsonPath;
    public Response response;
    Integer token;

    @BeforeMethod
    public void BaseTestHelper() {

        payloadManager = new PayloadManager();
        assertActions = new AssertActions();
        requestSpecification = (RequestSpecification) new RequestSpecBuilder()
                .setBaseUri(APIConstants.BASE_URL)
                .addHeader("Content-Type", "application/json")
                .build().log().all();
    }
    @AfterMethod
    public void tearDown(){
    }





}
