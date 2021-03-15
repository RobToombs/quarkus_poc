package com.toombs

import io.quarkus.test.junit.QuarkusTest
import io.restassured.RestAssured.given
import org.hamcrest.CoreMatchers.`is`
import org.junit.jupiter.api.Test

@QuarkusTest
class AppointmentResourceTest {

    @Test
    fun testAppointmentEndpoint() {
        given()
          .`when`().get("/appointments")
          .then()
             .statusCode(200)
             .body(`is`("Appointment Placeholder"))
    }

}