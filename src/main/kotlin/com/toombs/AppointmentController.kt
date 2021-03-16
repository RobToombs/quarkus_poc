package com.toombs

import javax.ws.rs.GET
import javax.ws.rs.Path

@Path("/appointments")
class AppointmentController {

    @GET
    fun appointments() : List<Appointment> {
        val med1 = Medication("Pixie Sticks", "10/12/2020", "10", "30")
        val med2 = Medication("Coffee", "9/3/2020", "3.59", "1")
        val med3 = Medication("Meatballs", "12/3/2020", "7.99", "7")
        val med4 = Medication("Cat Nip", "2/3/2020", "6.30", "3")
        val med5 = Medication("Calzones", "9/3/2020", "15.99", "60")

        val appt1 = Appointment(1, "Toombs", "Rob", "2/3/1990", "MRN123", "3/20/2021", "10:00 AM", "Dr. Pants", "", listOf(med1))
        val appt2 = Appointment(2, "Pants", "Mr", "6/28/2015", "CAT100", "4/12/2021", "1:00 PM", "Dr. Henry", "2/14/2021 @ 4:31 PM", listOf(med2, med3))
        val appt3 = Appointment(3, "Oatmeal", "Shaquille", "4/3/2000", "NBA208", "4/20/2021", "9:45 AM", "Dr. Stevens", "3/14/2021 @ 10:34 AM", listOf(med4, med5))
        val appt4 = Appointment(4, "Twoscoops", "Donnie", "5/6/1946", "MAGA2020", "1/2/2021", "11:45 AM", "Dr. Doctor", "", listOf(med4))
        val appt5 = Appointment(5, "Nothisis", "Patrick", "10/13/1972", "STAR12", "5/4/2021", "4:30 PM", "Sponge Bob", "", listOf(med1, med5, med2))
        val appt6 = Appointment(6, "Pitt", "Bread", "12/25/1983", "1231MR3", "4/20/2021", "9:45 AM", "Patrick Star", "", listOf(med3, med1))
        val appt7 = Appointment(7, "Bateman", "Patrick", "8/12/1940", "FJSAF231", "6/6/2021", "5:37 PM", "Mr. BigMan", "7/12/2020 @ 12:04 PM", listOf(med4, med1, med5))

        return listOf(appt1, appt2, appt3, appt4, appt5, appt6, appt7)
    }
}