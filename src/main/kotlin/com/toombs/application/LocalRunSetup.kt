package com.toombs.application

import com.toombs.appointment.Appointment
import com.toombs.appointment.AppointmentDAO
import com.toombs.appointment.Medication
import java.math.BigDecimal
import java.time.LocalDate
import java.time.LocalDateTime
import javax.enterprise.context.ApplicationScoped
import javax.enterprise.inject.Default
import javax.inject.Inject
import io.quarkus.runtime.StartupEvent

import javax.enterprise.event.Observes

@ApplicationScoped
class LocalRunSetup {

    @Inject
    @field: Default
    lateinit var appointmentDAO: AppointmentDAO

    fun onStart(@Observes ev: StartupEvent?) {
        println("Hello Friend")
        populateDB()
    }

    private fun populateDB() {
        val med1 = Medication(null, "Pixie Sticks", LocalDate.of(2020, 12, 10), BigDecimal(10.0), 30)
        val med2 = Medication(null, "Coffee", LocalDate.of(2020, 9, 3), BigDecimal(3.59), 1)
        val med3 = Medication(null, "Meatballs", LocalDate.of(2020, 12, 3), BigDecimal(7.99), 7)
        val med4 = Medication(null,"Cat Nip", LocalDate.of(2020, 2, 3), BigDecimal(6.30), 3)
        val med5 = Medication(null,"Calzones", LocalDate.of(2020, 9, 3), BigDecimal(15.99), 60)

        val appt1 = Appointment("Toombs", "Rob", LocalDate.of(1990,2,3), "MRN123", LocalDateTime.of(2021, 20, 3, 10, 0, 0), "Dr. Pants", null, listOf(med1))
        val appt2 = Appointment( "Pants", "Mr", LocalDate.of(2015, 6, 28), "CAT100", LocalDateTime.of(2021, 4, 12, 13, 0, 0), "Dr. Henry", LocalDateTime.of(2021, 2, 14, 16, 31, 0), listOf(med2, med3))
        val appt3 = Appointment( "Oatmeal", "Shaquille", LocalDate.of(2000, 4, 3), "NBA208", LocalDateTime.of(2021, 4, 20, 9, 45, 0),  "Dr. Stevens", LocalDateTime.of(2021, 3, 14, 10, 34, 0), listOf(med4, med5))
        val appt4 = Appointment( "Twoscoops", "Donnie", LocalDate.of(1946, 5, 6), "MAGA2020", LocalDateTime.of(2021, 1, 2, 11, 45, 0), "Dr. Doctor", null, listOf(med4))
        val appt5 = Appointment( "Nothisis", "Patrick", LocalDate.of(1972, 10, 13), "STAR12", LocalDateTime.of(2021, 5, 4, 16, 30, 0), "Sponge Bob", null, listOf(med1, med5, med2))
        val appt6 = Appointment( "Pitt", "Bread", LocalDate.of(1983, 12, 25), "1231MR3", LocalDateTime.of(2021, 4, 21, 9, 34, 0),  "Patrick Star", null, listOf(med3, med1))
        val appt7 = Appointment( "Bateman", "Patrick", LocalDate.of(1940,8, 13), "FJSAF231", LocalDateTime.of(2021, 6, 6, 17, 37, 0),  "Mr. BigMan", LocalDateTime.of(2020, 7, 12, 12, 4, 0), listOf(med4, med1, med5))

        appointmentDAO.persist(listOf(appt1, appt2, appt3, appt4, appt5, appt6, appt7))
    }

}