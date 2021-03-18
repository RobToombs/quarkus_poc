package com.toombs.appointment

import javax.enterprise.context.ApplicationScoped
import javax.enterprise.inject.Default
import javax.inject.Inject

@ApplicationScoped
class AppointmentService {

    @Inject
    @field: Default
    lateinit var appointmentDAO: AppointmentDAO

    fun getAppointments() : List<Appointment> {
        return appointmentDAO.findAll().list()
    }

}